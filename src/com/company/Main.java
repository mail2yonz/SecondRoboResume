/*
Yonatan Mengesha
Java Boot Camp

java challenge 3
 */



package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //creating a static variable of  Person object
    static Person person;

    //creating a static variable of the Education object
    static Education education;
    static WorkExperience experience;
    static Skill skill;
    static Duty duty;
    public static void main(String[] args) {
	// write your code here


        String answer="Yes";

        String Stop="Stop";

        int educationalCount=1;
        int experienceCount=0;
        int skillCount=1;

        person= new Person();
        Scanner keyboard= new Scanner (System.in);

        System.out.print ("Enter the Persons FullName: " );
        person.setName ( keyboard.nextLine () );


        System.out.print ("Enter the Persons Email: " );
        person.setEmailAddress ( keyboard.nextLine () );





             do{


                 educationalCount++;





                 if( educationalCount!=10)
                 {


                     if(!Stop.equalsIgnoreCase(answer))
                     {
                         education= new Education();
                         System.out.println ("Enter the Persons Educational Achievement(Diploma/Degree/Masters...: ");

                         education.setEducationalLevel (keyboard.nextLine ());


                         System.out.print("Enter the university you graduated from: " );
                         education.setSchool ( keyboard.nextLine () );


                         System.out.print ("Enter the year of graduation: " );
                         education.setGraduationYear (  keyboard.nextLine ());

                         person.addEducation ( education );



//                     if(!answer.equalsIgnoreCase ( "yes" )&&!answer.equalsIgnoreCase ( "No" ))
//                     {
//                         System.out.println ("Invalid Entry Please Enter yes/No" );
//                     }
                    }


                     System.out.println ("Do you want to Enter another Educational Achievement?(Yes/Stop)" );
                     answer= keyboard.nextLine ();


                }



             }while( educationalCount< 11 && !Stop.equalsIgnoreCase (answer) );//








         do{

             experienceCount++;


             if(experienceCount!=10)
             {

                  if(!Stop.equalsIgnoreCase(answer))
                  {


                      experience= new WorkExperience ();


                      System.out.print ("Enter the Persons Job Title: " );
                      experience.setJobTitle (  keyboard.nextLine ());

                      System.out.print ("Enter the  Company the person worked for: " );
                      experience.setCompanyName (  keyboard.nextLine ());

                      System.out.println ("Enter the Starting date of your experience: " );

                      experience.setYearFrom ( keyboard.nextLine () );

                      System.out.println ("Enter the Day you left the Job: "  );
                      experience.setYearTo ( keyboard.nextLine () );


                      //do while loop to enter the duties of the person
                      do{
//
                              System.out.print ("Enter Duties of the person:  " );
                            //  duty.setDutyName (   keyboard.nextLine ());

                               experience.setDuty ( keyboard.nextLine () );


                         experience.addDuty ( experience.getDuty () );





                          System.out.println ("Do you want add Duties?(yes/No)" );
                          //Add an if statement for no
                          answer = keyboard.nextLine () ;



                      }while(answer.equalsIgnoreCase ( "yes" ));




                      person.addExperiance ( experience );






                  }
                 System.out.println ("Do you want to Enter  Experience?(Yes/Stop)" );
                 answer= keyboard.nextLine ();

             }
         }while(!Stop.equalsIgnoreCase(answer) && experienceCount< 11);





        do{

             skillCount++;

            if(skillCount!=20)
            {
                if(!Stop.equalsIgnoreCase (answer ))
                {
                    skill= new Skill ();

                    System.out.println ("Enter the persons Skill type: " );
                    skill.setSkillType ( keyboard.nextLine () );

                    System.out.print ("Enter the Persons Skill with rating:(Advanced/Intermediate/Fundamental): " );
                    skill.setLevelOfSkill ( keyboard.nextLine () );

                    person.addSkills ( skill );


                }

                System.out.println ("Do you want to Enter  Skill?(yes/Stop)" );
                answer=keyboard.nextLine ();

            }




        }while(!Stop.equalsIgnoreCase (answer ) && skillCount<21);

        //calling the printing method
         printing();



    }

    //This lets us see the output
    public static void printing()
    {

        System.out.println ( person.getName ());
        System.out.println (person.getEmailAddress () );
        System.out.println ( );
        System.out.println ("Education" );

        for(Education edu:person.getEducationArrayList ())
        {
            System.out.println (edu.getEducationalLevel () );
            System.out.println (edu.getSchool () +"," +edu.getGraduationYear () );
        }

        System.out.println ( );

        System.out.println ("Experiance " );

        for(WorkExperience workExp: person.getExperienceArrayList ())
        {
            System.out.println (workExp.getJobTitle () );
            System.out.println (workExp.getCompanyName () + "   " +workExp.getYearFrom () +"-" + workExp.getYearTo ());

             for(String due: workExp.getArrayListDuty ())
             {
                 System.out.println ("   -"+due);

             }

        }
        System.out.println ( );

        System.out.println ("Skills" );

        for(Skill skill: person.getSkillArrayList ())
        {
            System.out.println (skill.getSkillType () +" ," +skill.getLevelOfSkill () );
        }

    }
}
