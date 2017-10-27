
/*
Yonatan Mengesha
Java Boot Camp

java challenge 3
 */


package com.company;

import java.util.ArrayList;

public class WorkExperience {

    private String JobTitle;
    private String CompanyName;
    private String YearFrom;
    private String YearTo;
    private String duty;
    ArrayList<String> arrayListDuty;

    public WorkExperience()
    {
        arrayListDuty= new ArrayList<> (  );
    }



    public ArrayList<String> getArrayListDuty() {
        return arrayListDuty ;
    }

    public void setArrayListDuty(ArrayList<String> arrayDuty) {
        this.arrayListDuty = arrayDuty;
    }


    public void setDuty(String duty) {
        this.duty = duty;
    }
    public String getDuty()
    {
        return duty;
    }


   // private ArrayList<Duty> dutyArrayList;

//    public Duty getDuty() {
//        return duty;
//    }
//
//    public void setDuty(Duty duty) {
//        this.duty = duty;
//    }





    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getYearFrom() {
        return YearFrom;
    }

    public void setYearFrom(String yearFrom) {
        YearFrom = yearFrom;
    }

    public String getYearTo() {
        return YearTo;
    }

    public void setYearTo(String yearTo) {
        YearTo = yearTo;
    }

//    public ArrayList<Duty> getDutyArrayList() {
//        return dutyArrayList;
//    }
//
//    public void setDutyArrayList(ArrayList<Duty> dutyArrayList) {
//        this.dutyArrayList = dutyArrayList;
//    }

    public void addDuty(String  duty)
    {
        //dutyArrayList.add (  duty);

        arrayListDuty.add ( duty );

    }
}
