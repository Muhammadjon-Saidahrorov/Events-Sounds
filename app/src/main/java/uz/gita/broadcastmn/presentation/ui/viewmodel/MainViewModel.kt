package uz.gita.broadcastmn.presentation.ui.viewmodel

import uz.gita.broadcastmn.data.EventData

interface MainViewModel {

    fun getEvents(): List<EventData>

    fun enableEvent(id: Int)
    fun disableEvent(id: Int)
}