package com.example.s_denni.googledevkotlin_submission4_denni_1

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

        onView(withId(list_laga_kamari))
            .check(matches(isDisplayed()))
//
//        onView(withId(list_laga_enjing))
//            .check(matches(isDisplayed()))
        onView(withId(list_laga_kamari)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(10))
        onView(withId(list_laga_kamari)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10, click()))
    }

    @Test
    fun testAppBehaviour() {
        onView(withId(nambihan_karesep))
            .check(matches(isDisplayed()))

    }

}