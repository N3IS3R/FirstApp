package com.neiser.tmapp.ui.ticket.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.neiser.tmapp.databinding.ItemTicketsBinding
import com.neiser.tmapp.domain.TicketInfo

class AddTicketViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemTicketsBinding.bind(view)
    fun render(ticketInfo: TicketInfo){
        val context = binding.tvTitle.context
        //binding.tvTitle.text = context.getString(TicketInfo.tipoAveria)
        binding.ivTicket.setImageResource(ticketInfo.imgAveria)

    }
}