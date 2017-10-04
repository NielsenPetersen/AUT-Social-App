package com.example.user1.socialappaut;

import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

<<<<<<< HEAD
    @Test
    public void loginNotEmpty()
    {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference user_table = database.getReference("User");

        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

        final String studentID = etStudentID.getText().toString().trim();

        user_table.addValueEventListener(new ValueEventListener() {

        //This checks the database to see if there is a matching student ID stored, If so
        if (dataSnapshot.child(etStudentID.getText().toString()).exists()) {

            noteDialog.dismiss();

            //This gets the users information if password is correct
            Users user = dataSnapshot.child(etStudentID.getText().toString()).getValue(Users.class);

            if (user.getPassword().equals(etPassword.getText().toString())) {

                Toast.makeText(LoginActivity, "Login Successful!", Toast.LENGTH_SHORT)
                        .show();

            } else {

                Toast.makeText(LoginActivity.this, "Invalid Password", Toast.LENGTH_SHORT)
                        .show();
            }

        } else{

            Toast.makeText(LoginActivity.this, "Invalid Student ID", Toast.LENGTH_SHORT)
                    .show();
        }
    }
        @Override
        public void onCancelled(DatabaseError databaseError) {

        }
    });
    }
});

    }

=======
>>>>>>> 0bfd04341ec47a3ea4dadfd3855ffc0ae471a1d7

}