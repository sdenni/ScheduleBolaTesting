package com.example.s_denni.googledevkotlin_submission4_denni_1.tools

import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import com.example.s_denni.googledevkotlin_submission4_denni_1.tools.ubahFormatTanggal

class HelperKtTest {

    @Test
    fun ubahFormatTanggal() {
//        val dateFormat = SimpleDateFormat("yyyy/MM/dd")
//        val date = dateFormat.parse("2018/11/24")
        val date = "2018-11-24"

        assertEquals("Sab, 24 November 2018", ubahFormatTanggal(date))
    }
}