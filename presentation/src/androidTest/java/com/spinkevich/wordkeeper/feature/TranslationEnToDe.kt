package com.spinkevich.wordkeeper.feature

import android.app.Activity
import android.content.Intent
import org.junit.Assert.*

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.spinkevich.wordkeeper.R
import com.spinkevich.wordkeeper.feature.MainActivity
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.CoreMatchers.startsWith
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.EnumSet.allOf

@RunWith(AndroidJUnit4ClassRunner::class)
class TranslationEnToDe{



    @Test
    fun testActivity_translationToButtonDE() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //Text to be translated is Hello
        //Hello is entered in the edittext
        onView(withId(R.id.text_for_translation)).perform(typeText("Hello"))
        //have to add wait o that translation is completed
        //Thread.sleep(10000)
        onView(withId(R.id.to_language)).perform(click())
        Thread.sleep(5000)
        //changing translation from Ru to DE
        onView(withText("German")).perform(click())
        Thread.sleep(5000)
        onView(withText("Hallo")).check(matches(isDisplayed()))

    }

    }
