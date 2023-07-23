package com.dicoding.courseshedule.ui.list

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.home.HomeActivity
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(HomeActivity::class.java)


    @Test
    fun testAddCourseMenuClick() {
        // Perform click on Add Course (+) menu
        onView(withId(R.id.action_add)).perform(click())

        // Check if AddCourseActivity is displayed
        onView(withId(R.id.ed_course_name)).check(matches(isDisplayed()))
    }
}
