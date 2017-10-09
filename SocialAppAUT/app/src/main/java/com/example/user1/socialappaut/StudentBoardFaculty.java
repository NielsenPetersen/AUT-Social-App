package com.example.user1.socialappaut;

/**
 * Class to hold the faculties of AUT
 *
 * Created by Darcy on 4/10/2017.
 */

public class StudentBoardFaculty {

    private String faculty;
    private final String DCT = "DESIGN AND CREATIVE TECHNOLOGIES";
    private final String HES = "HEALTH AND ENVIRONMENTAL SCIENCE";
    private final String BEL = "BUSINESS ECONOMICS AND LAW";
    private final String CS = "CULTURE AND SOCIETY";
    private final String MID = "TE ARA POUTAMA";

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

        else if(faculty.equals("HES"))
        {
            this.faculty = HES;
        }

        else if(faculty.equals("BEL"))
        {
            this.faculty = BEL;
        }

        else if(faculty.equals("CS"))
        {
            this.faculty = CS;
        }

        else if(faculty.equals("MID"))
        {
            this.faculty = MID;
        }
    }
}
