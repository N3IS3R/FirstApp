package com.neiser.tmapp.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.neiser.tmapp.R
import com.neiser.tmapp.databinding.FragmentAddTicketBinding
import com.neiser.tmapp.databinding.FragmentDetailsTicketBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsTicketFragment : Fragment() {

    //para conectarlo con el ViewModel
    private val detailsViewModel by viewModels<DetailsViewModel>()

    private var _binding: FragmentDetailsTicketBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsTicketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}
