package uz.gita.broadcastmn.app

import android.app.Application
import uz.gita.broadcastmn.LocalStorage

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        LocalStorage.init(this)
    }

}