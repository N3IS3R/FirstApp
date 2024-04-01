package com.neiser.tmapp.domain

import com.neiser.tmapp.R

// sealed class pq van a ser datos fijos por defecto para mostrar en la app
sealed class TicketInfo(val tipoAveria:Int, val imgAveria:Int){
         object Plomeria:TicketInfo(R.string.plomeria,R.drawable.plomeria )
         object Albañileria:TicketInfo(R.string.albañileria,R.drawable.albannileria)
         object Carpinteria:TicketInfo(R.string.carpinteria,R.drawable.carpinteria)
         object Electricidad:TicketInfo(R.string.electricidad,R.drawable.electricista)
}
