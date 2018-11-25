package com.example.s_denni.googledevkotlin_submission4_denni_1.presenters

import com.example.s_denni.googledevkotlin_submission4_denni_1.TestContextProvider
import com.example.s_denni.googledevkotlin_submission4_denni_1.interfaces.LagaDetailView
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.KlubSepakBola
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.KlubSepakBolaResponse
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.ListOfMyLaga
import com.example.s_denni.googledevkotlin_submission4_denni_1.models.MyLaga
import com.example.s_denni.googledevkotlin_submission4_denni_1.networks.DataRepository
import com.example.s_denni.googledevkotlin_submission4_denni_1.networks.TheSportDBApi
import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DetailKlubPresenterTest {
//    @Mock
//    private
//    lateinit var view: LagaDetailView
//
//    @Mock
//    private
//    lateinit var gson: Gson
//
//    @Mock
//    private
//    lateinit var apiRepository: DataRepository
//
//    private lateinit var presenter: DetailKlubPresenter
//
//    @Before
//    fun setUp(){
//        MockitoAnnotations.initMocks(this)
//
//        presenter = DetailKlubPresenter(view, apiRepository, gson, TestContextProvider())
//    }
//
//    @Test
//    fun testNimmLagaEnjing(){
//        var lagaEnjings: MutableList<MyLaga> = mutableListOf()
//        var klubSepakBolaResponseKenca: KlubSepakBolaResponse = null
//        var klubSepakBolaResponseKatuhu: KlubSepakBolaResponse = null
//        var lagaEnjings: MutableList<MyLaga> = mutableListOf()
//        var response = ListOfMyLaga(lagaEnjings)
//
//        GlobalScope.launch {
//            Mockito.`when`(
//                gson.fromJson(
//                    apiRepository
//                        .machenRequest(TheSportDBApi.nimmLastMatch()).await(),
//                    ListOfMyLaga::class.java
//                )
//            ).thenReturn(response)
//
//            presenter.nimmKlubDetail($id_schedule)
//
//            Mockito.verify(view).showLoading()
//            Mockito.verify(view).showEventList(lagaEnjings,klubSepakBolaResponseKenca,klubSepakBolaResponseKatuhu)
//            Mockito.verify(view).hideLoading()
//        }
//
//    }
}