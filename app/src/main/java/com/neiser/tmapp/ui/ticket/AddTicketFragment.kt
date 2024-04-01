package com.neiser.tmapp.ui.ticket

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle.State.*
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.neiser.tmapp.R
import com.neiser.tmapp.databinding.FragmentAddTicketBinding
import com.neiser.tmapp.ui.details.DetailsViewModel
import com.neiser.tmapp.ui.ticket.adapter.AddTicketAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlin.math.log


@AndroidEntryPoint
class AddTicketFragment : Fragment() {

    //para conectarlo con el ViewModel
    private val addViewModel by viewModels<AddViewModel>()

    private lateinit var adapter: AddTicketAdapter
    private var _binding:FragmentAddTicketBinding? = null
    private val binding get() = _binding!!

    //Para engancharlo al viewModel......
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initRecyceView()
        initUIState()
    }

    private fun initRecyceView() {
      adapter = AddTicketAdapter()

        binding.rvAddTicket.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapter
        }
        binding.rvAddTicket.layoutManager = LinearLayoutManager(context)
        binding.rvAddTicket.adapter = adapter
    }

    private fun initUIState() {
        //se uso esta pq se engancha al ciclo de vida del fragment
        lifecycleScope.launch {
            repeatOnLifecycle(STARTED){
                addViewModel.ticket.collect{
                    //cambios en tickets
                    adapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTicketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}