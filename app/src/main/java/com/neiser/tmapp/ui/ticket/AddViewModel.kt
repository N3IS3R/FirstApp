package com.neiser.tmapp.ui.ticket

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras
import com.neiser.tmapp.domain.TicketInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor() : ViewModel() {

    private var _ticket = MutableStateFlow<List<TicketInfo>>(emptyList())
    val ticket:StateFlow<List<TicketInfo>> = _ticket

    init {
        _ticket.value = listOf(
            TicketInfo.Carpinteria, TicketInfo.Plomeria, TicketInfo.Albañileria, TicketInfo.Electricidad
        )
    }

}