package me.GageWillette.XenonEMPManager.Utils;

import java.util.Date;

public class Employee
{
    private String firstName;
    private String lastName;
    private String fullName;
    private Date bday;
    private int ssn;
    private boolean canServerAlc;
    private int ageInYears;


    public Employee (String firstName , String lastName , Date bday , int ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.ssn = ssn;
    }
}
