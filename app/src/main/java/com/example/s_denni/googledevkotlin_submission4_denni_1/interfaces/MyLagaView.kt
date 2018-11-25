package com.example.s_denni.googledevkotlin_submission4_denni_1.interfaces

import com.example.s_denni.googledevkotlin_submission4_denni_1.models.MyLaga

interface MyLagaView {
    fun showLoading()
    fun hideLoading()
    fun showEventList(myLaga: List<MyLaga>)
}