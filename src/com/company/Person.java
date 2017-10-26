package com.company;

public class Person {
    private String FullName;
    private String EmailAddress;
   // private String educationalAchivement;
    private Education education;
   // private String experiance;
    private WorkExperience workExperience;
   // private String skillRating;


    private Skill skill;

    public Person()
    {
        education= new Education();
        workExperience = new WorkExperience ();
        skill= new Skill ();
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

//   public String getEducationalAchivement() {
//        return educationalAchivement;
//    }

//    public void setEducationalAchivement(String educationalAchivement) {
//        this.educationalAchivement = educationalAchivement;
//    }

//    public String getExperiance() {
//        return experiance;
//    }
//
//    public void setExperiance(String experiance) {
//        this.experiance = experiance;
//    }

//    public String getSkillRating() {
//        return skillRating;
//    }
//
//    public void setSkillRating(String skillRating) {
//        this.skillRating = skillRating;
//    }
}
