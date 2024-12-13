package com.netology.tabbedapplication;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    String result = "Page: 2";

    @Test
    public void mainActivityTest() {

        ViewInteraction tabView1 = onView(withContentDescription("Tab 1"));
        tabView1.check(matches(isDisplayed()));
        tabView1.perform(click());

        ViewInteraction tabView2 = onView(withContentDescription("Tab 2"));
        tabView2.check(matches(isDisplayed()));
        tabView2.perform(click());

        ViewInteraction textView = onView(withText("Page: 2"));
        textView.check(matches(isDisplayed()));
        textView.check(matches(withText(result)));

    }
}
