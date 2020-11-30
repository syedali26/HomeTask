package com.codingwithmitch.espressouitestexamples.ui.main

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.spinkevich.wordkeeper.R
import com.spinkevich.wordkeeper.feature.MainActivity
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    //Test to Verify if from area is visible

    @Test
    fun testActivity_inView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.from_area)).check(matches(isDisplayed()))
    }

    //Test to Verify if FROM and TO values are present by ID
    @Test
    fun testActivity_translateCheckById() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //checking if fromlanguage is showing
        onView(withId(R.id.from_language)).check(matches(isDisplayed()))
        //checking if tolanguage is showing
        onView(withId(R.id.to_language)).check(matches(isDisplayed()))
    }


    //Test to Verify if FROM and TO values are present by TEXT
    //This test will fail because GR is not present
    //Change GR to RU and it will pass
    @Test
    fun testActivity_translationCheckByText() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //checking if fromlanguage is showing
        onView(withText("EN")).check(matches(isDisplayed()))
        //checking if tolanguage is showing
        onView(withText("RU")).check(matches(isDisplayed()))
    }


    //Verify if Text to Translate field is working as expected and text can be inserted
    @Test
    fun testActivity_translationTextFieldWorking() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //Text to be translated is Hello
        //Hello is entered in the edittext
        onView(withId(R.id.text_for_translation)).perform(typeText("Hello"))
        //Now Verify if it is translated properly
        onView(withId(R.id.text_for_translation)).check(matches(withText("Hello")));

    }

    




    //Translation To button is changed from RU to DE
    //Hello String is typed
    //Hello String is Translated to German
  /*  @Test
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
*/




    //Translation To button is changed from RU to TU
    //Hello String is typed
    //Hello String is Translated to Turkish



    //

    /*
     Visibility
    @Test
    fun testVisibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.activity_main_title))
            .check(matches(isDisplayed())) // method 1

        onView(withId(R.id.activity_main_title))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method 2

        onView(withId(R.id.button_next_activity))
            .check(matches(isDisplayed()))
    }

    // Text
    @Test
    fun testTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.activity_main_title))
            .check(matches(withText(R.string.text_mainactivity)))
    }*/

}
















