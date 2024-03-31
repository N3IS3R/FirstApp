package com.neiser.tmapp.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.neiser.tmapp.R
import com.neiser.tmapp.databinding.FragmentAddTicketBinding
import com.neiser.tmapp.databinding.FragmentLoginBinding
import com.neiser.tmapp.ui.details.DetailsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {

    //para conectarlo con el ViewModel
    private val loginViewModel by viewModels<LoginViewModel>()


    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}