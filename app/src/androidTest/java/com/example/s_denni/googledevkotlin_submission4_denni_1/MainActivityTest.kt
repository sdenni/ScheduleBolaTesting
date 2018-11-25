package com.example.s_denni.googledevkotlin_submission4_denni_1

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.pressBack
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView
import com.example.s_denni.googledevkotlin_submission4_denni_1.R.id.*
import kotlinx.coroutines.delay
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testRecycleViewBehaviour(){

        Thread.sleep(5000)
        onView(withId(list_laga_kamari))
            .check(matches(isDisplayed()))
        Thread.sleep(5000)
        onView(withId(list_laga_kamari)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(10))
        Thread.sleep(5000)
        onView(withId(list_laga_kamari)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(13, click()))
        Thread.sleep(5000)

    }

    @Test
    fun testAppBehaviour() {
        //wait network for 5s
        Thread.sleep(5000)
        //cek if list laga kamari is displayed
        onView(withId(list_laga_kamari))
            .check(matches(isDisplayed()))
        //klik bottom menu kareseps
        onView(withId(kareseps))
            .perform(click())
        //wait select for 2.5s
        Thread.sleep(2500)
        //klik bottom menu kamari
        onView(withId(kamari))
            .perform(click())
        //wait network for 5s
        Thread.sleep(5000)
        //scroll recycle view ke posisi 10
        onView(withId(list_laga_kamari))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(10))
        //wait for 1s
        Thread.sleep(1000)
        //klik item view posisi ke 13
        onView(withId(list_laga_kamari))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(13, click()))
        //wait network for 5s
        Thread.sleep(5000)
        //clik favorite untuk menambahkan favorite
        onView(withId(nambihan_karesep))
            .perform(click())
        //wait for 1s
        Thread.sleep(1000)
//        onView(withId(home)).perform(click())
        //press back
        Espresso.pressBack()
        //wait for 1s
        Thread.sleep(1000)
        //klik bottom menu enjing
        onView(withId(enjing))
            .perform(click())
        //wait network for 5s
        Thread.sleep(5000)
        //cek if recycle view is displayed
        onView(withId(list_laga_enjing))
            .check(matches(isDisplayed()))
        //wait for 2.5s
        Thread.sleep(2500)
        //scroll recycle view ke posisi 5
        onView(withId(list_laga_enjing))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5))
        //wait for 1s
        Thread.sleep(1000)
        //klik item view posisi ke 3
        onView(withId(list_laga_enjing))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(3, click()))
        //wait network for 5s
        Thread.sleep(5000)
        //klik add favorite
        onView(withId(nambihan_karesep))
            .perform(click())
        //wait for 1s
        Thread.sleep(1000)
//        onView(withId(home)).perform(click())
        //press back
        Espresso.pressBack()
        //wait for 1s
        Thread.sleep(1000)
        //klik bottom menu kareseps
        onView(withId(kareseps))
            .perform(click())
        //wait select for 5s
        Thread.sleep(5000)
        //cek recycle view is displayed
        onView(withId(list_laga_kareseps))
            .check(matches(isDisplayed()))
        //wait for 1s
        Thread.sleep(1000)
        //klik item view recycle posisi ke 1
        onView(withId(list_laga_kareseps))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))
        //wait network for 5s
        Thread.sleep(5000)
        //klik favorite to remove
        onView(withId(nambihan_karesep))
            .perform(click())
        //wait for 1s
        Thread.sleep(1000)
        //press back
        Espresso.pressBack()
        //wait for 5s
        Thread.sleep(5000)


    }

}