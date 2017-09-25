package com.example.user1.socialappaut;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert.*;

import static junit.framework.Assert.assertNotNull;


/**
 * Created by Darcy on 25/09/2017.
 */

@RunWith(JUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule
            = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void testEmptyUsernameTest(){
        Activity login = loginActivityActivityTestRule.getActivity();

        assertNotNull(login.findViewById(R.id.etStudentID));

        TextView username = (TextView)login.findViewById(R.id.etStudentID);



    }
}
