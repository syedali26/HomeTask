package com.spinkevich.wordkeeper.feature

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.spinkevich.wordkeeper.R
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)

class TranslationEnToEe{
    //Test will fail as Estonian language not integated and it changed to FIN
    //Translation To button is changed from RU to EE
    //Hello String is typed
    //Hello String is Translated to EE
    @Test
    fun testActivity_translationToButtonEstonian() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //Text to be translated is Hello
        //Hello is entered in the edittext
        Espresso.onView(ViewMatchers.withId(R.id.text_for_translation))
            .perform(ViewActions.typeText("Hello"))
        //have to add wait o that translation is completed
        //Thread.sleep(10000)
        Espresso.onView(ViewMatchers.withId(R.id.to_language)).perform(ViewActions.click())
        Thread.sleep(5000)
        //changing translation from Ru to EE
        Espresso.onView(ViewMatchers.withText("Estonian")).perform(ViewActions.click())
        Thread.sleep(5000)
        Espresso.onView(ViewMatchers.withText("Tere"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }
}