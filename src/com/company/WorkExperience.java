package com.company;

import java.util.ArrayList;

public class WorkExperience {

    private String JobTitle;
    private String CompanyName;
    private String YearFrom;
    private String YearTo;
    private ArrayList<Duty> dutyArrayList;

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    private Duty duty;

    public WorkExperience()
    {
        duty= new Duty();
    }

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

    public ArrayList<Duty> getDutyArrayList() {
        return dutyArrayList;
    }

    public void setDutyArrayList(ArrayList<Duty> dutyArrayList) {
        this.dutyArrayList = dutyArrayList;
    }

    public void addDuty(Duty duty)
    {
        dutyArrayList.add (  duty);
    }
}
