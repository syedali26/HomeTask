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

class TranslationEnToRu{

    //Verify if English to Russian translation working
    @Test
    fun testActivity_translationEngToRus() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //Text to be translated is Hello
        //Hello is entered in the edittext
        Espresso.onView(ViewMatchers.withId(R.id.text_for_translation))
            .perform(ViewActions.typeText("Hello"))
        //have to add wait o that translation is completed
        Thread.sleep(10000)
        //Verifying traslation works from Eng to RU
        Espresso.onView(ViewMatchers.withText("привет"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        //onView(withId(R.id.to_language)).perform(click()).check(matches(isDisplayed()));

        //onView(withId(R.id.languages_list)).perform(click()).check(matches(withText("German")))
        //onView(withId(R.id.text_for_translation)).perform(typeText("Hello"))
        //onView(isRoot()).perform(waitForView(R.id.translation_group, 5000))
        //onView(withId(R.id.translation_group)).check(matches(withText("привет")));
    }
}