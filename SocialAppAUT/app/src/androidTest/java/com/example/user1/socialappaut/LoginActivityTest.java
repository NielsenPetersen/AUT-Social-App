package com.example.user1.socialappaut;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;


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
        TextView password = (TextView)login.findViewById(R.id.etPassword);
        Button button = (Button)login.findViewById(R.id.btnLogin);

        if(button.isActivated())
        {
            if(username.getText().toString().isEmpty() ||
                    password.getText().toString().isEmpty())
            {
                fail("The field cannot be empty");
            }

        }
    }
}
