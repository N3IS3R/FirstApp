package com.neiser.tmapp.ui.ticket.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neiser.tmapp.R
import com.neiser.tmapp.domain.TicketInfo

class AddTicketAdapter(private var ticketList:List<TicketInfo>) :
    RecyclerView.Adapter<AddTicketViewHolder>(){

    fun updateList(list: List<TicketInfo>){
        ticketList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddTicketViewHolder {
      return AddTicketViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.item_tickets, parent,false)
      )
    }

    override fun getItemCount()= ticketList.size

    override fun onBindViewHolder(holder: AddTicketViewHolder, position: Int) {
        holder.render(ticketList[position] )
    }
}