package com.example.user1.socialappaut;

/**
 * Created by Darcy on 4/10/2017.
 */

public class StundentBoardFaculty {

    private String faculty;
    private String DCT;
    private String HES;
    private String BEL;
    private String CULTSOC;
    private String MID;

    public String getFaculty()
    {
        return this.faculty;
    }

    public void setFaculty(String faculty)
    {
        if(faculty.equals("DCT"))
        {
            this.faculty = DCT;
        }


    }
}
