package com.company;

import java.util.ArrayList;

public class Person {
    private String FullName;
    private String EmailAddress;

    private Education education;
    private Skill skill;

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    private WorkExperience workExperience;
    private ArrayList<Education> educationArrayList;

    private ArrayList<WorkExperience> experienceArrayList;

    public ArrayList<Skill> getSkillArrayList() {
        return skillArrayList;
    }

    public void setSkillArrayList(ArrayList<Skill> skillArrayList) {
        this.skillArrayList = skillArrayList;
    }

    private ArrayList<Skill> skillArrayList;


    public ArrayList<Education> getEducationArrayList() {
        return educationArrayList;
    }

    public void setEducationArrayList(ArrayList<Education> educationArrayList) {
        this.educationArrayList = educationArrayList;
    }

    public ArrayList<WorkExperience> getExperienceArrayList() {
        return experienceArrayList;
    }

    public void setExperienceArrayList(ArrayList<WorkExperience> experienceArrayList) {
        this.experienceArrayList = experienceArrayList;
    }

    public Person()
    {
        education= new Education();
        workExperience = new WorkExperience ();
        skill= new Skill ();
        educationArrayList= new ArrayList<> ( );
        experienceArrayList= new ArrayList<>( );
        skillArrayList= new ArrayList<> (  );
    }

    public Person(Education education,WorkExperience workExperience, Skill skill)
    {
        this.education=education;
        this.workExperience=workExperience;
        this.skill= skill;
    }

    public String getName() {
        return FullName;
    }

    public void setName(String name) {
        this.FullName = name;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.EmailAddress = emailAddress;
    }

     public void addExperiance(WorkExperience workExperience)
     {
         experienceArrayList.add ( workExperience );
     }

     public void addEducation(Education education)
     {
         educationArrayList.add ( education );
     }

     public void addSkills(Skill skill)
     {
         skillArrayList.add ( skill );
     }

}
