package com.neiser.tmapp.ui.ticket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neiser.tmapp.R
import com.neiser.tmapp.databinding.FragmentAddTicketBinding
import com.neiser.tmapp.databinding.FragmentUpdateTicketBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class UpdateTicketFragment : Fragment() {
    private var _binding: FragmentUpdateTicketBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUpdateTicketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}