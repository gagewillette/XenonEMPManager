package me.GageWillette.XenonEMPManager.Utils;

import java.util.Date;

public class Employee
{
    private String firstName;
    private String lastName;
    private String fullName;
    private String bday;
    private long ssn;
    private boolean canServeAlc;
    private int ageInYears;

    public Employee (String firstName , String lastName , String bday , long ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.ssn = ssn;
    }

    public Employee (String firstName , String lastName , String bDay)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
    }


    /* List of getters and setters: (I want to die)

    getFirstName
    getLastName
    getName
    getBday
    getBdayString
    getSSN
    getSSNString
    canServeAlc
    getAge
    setSSN

    STATIC GETTERS AND SETTERS

    static getNumberOfEmployees
    static getEmployeesThatCanServeAlc
     */

    public String toString()
    {
        String str = firstName + " " + lastName; return str;
    }


}
