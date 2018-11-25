package com.example.s_denni.googledevkotlin_submission4_denni_1.presenters

import com.example.s_denni.googledevkotlin_submission4_denni_1.interfaces.MyLagaView
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.ListOfMyLaga
import com.example.s_denni.googledevkotlin_submission4_denni_1.networks.DataRepository
import com.example.s_denni.googledevkotlin_submission4_denni_1.networks.TheSportDBApi
import com.example.s_denni.googledevkotlin_submission4_denni_1.tools.CoroutineContextProvider
import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LagaKamariPresenter (private val view: MyLagaView,
                           private val apiRepository: DataRepository,
                           private val gson: Gson, private val context: CoroutineContextProvider = CoroutineContextProvider()) {

        fun nimmLagaKamari() {
            view.showLoading()

            GlobalScope.launch (context.main){
                val data = gson.fromJson(apiRepository
                    .machenRequest(TheSportDBApi.nimmLastMatch()).await(),
                    ListOfMyLaga::class.java)

                view.showEventList(data.events)
                view.hideLoading()
            }
        }

}