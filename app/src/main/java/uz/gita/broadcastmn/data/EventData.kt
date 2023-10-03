package uz.gita.broadcastmn.data

data class EventData(
    val id: Int,
    val name: String,
    val action: String,
    val icon: Int,
    var state: Boolean = false
)