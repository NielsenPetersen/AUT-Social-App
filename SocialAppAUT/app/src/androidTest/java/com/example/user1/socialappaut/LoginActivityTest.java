package com.example.user1.socialappaut;

import android.support.test.rule.ActivityTestRule;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Darcy on 25/09/2017.
 */

@RunWith(JUnit4.class)
public class LoginActivityTest {



    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule
            = new ActivityTestRule<LoginActivity>(LoginActivity.class);
}
