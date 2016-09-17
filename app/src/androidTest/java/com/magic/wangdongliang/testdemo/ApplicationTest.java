package com.magic.wangdongliang.testdemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;

/**
 * Created by wangdongliang on 16/9/17.
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
    @Rule
    public ActivityTestRule<MainActivity> mMainActivity =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void combineString() {

        ClassUnderTest classUnderTest = new ClassUnderTest(mMainActivity.getActivity());

        String result = classUnderTest.combineString("Jack!");

        assertEquals(result, "Hello world! Jack!");
    }

    @Test
    public void minusTest() {
        assertEquals(mMainActivity.getActivity().minus(3, 2), 1);
    }

    @Test
    public void onTextViewClickedTest() {
        onView(withId(R.id.input_et)).perform(typeText("hello world"), closeSoftKeyboard());
        onView(withId(R.id.clickme_tv)).perform(click()).check(matches(withText("Submit success!")));
    }
}
