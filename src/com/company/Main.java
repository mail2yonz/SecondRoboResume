/*
Yonatan Mengesha
Java Boot Camp

java challenge 3
 */



package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Person person;
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
             experience= new WorkExperience ();

             if(experienceCount<=10)
             {

                  if(!Stop.equalsIgnoreCase(answer))
                  {





                      System.out.print ("Enter the Persons Job Title: " );
                      experience.setJobTitle (  keyboard.nextLine ());

                      System.out.print ("Enter the  Company the person worked for: " );
                      experience.setCompanyName (  keyboard.nextLine ());


                      //do while loop to enter the duties of the person
                      do{
                          duty= new Duty();
                          System.out.print ("Enter Duties Name the Person At that company " );
                          duty.setDutyName (   keyboard.nextLine ());

                          System.out.println ("Enter the Duties ID: " );
                          duty.setDutyID ( keyboard.nextLine () );


                          experience.addDuty ( duty );

                          System.out.println ("Do you want to Add more Duties?(yes/No)" );
                          //Add an if statement for no

                      }while(answer.equalsIgnoreCase ( "yes" ));


                      person.addExperiance ( experience );

                      System.out.println ("Do you want to Enter another Experience?(Yes/No)" );
                      answer= keyboard.nextLine ();


                  }




             }
         }while(!Stop.equalsIgnoreCase(answer) && experienceCount<=10);





        do{

             skillCount++;

            if(skillCount<=10)
            {
                if(!answer.equalsIgnoreCase ( "No" ))
                {
                    skill= new Skill ();

                    System.out.println ("Enter the persons Skill type: " );
                    skill.setSkillType ( keyboard.nextLine () );

                    System.out.print ("Enter the Persons Skill with rating:(Advanced/Intermediate/Fundamental): " );
                    skill.setLevelOfSkill ( keyboard.nextLine () );

                    person.addSkills ( skill );

                    System.out.println ("Do you want to Enter another Skill?(yes/no)" );
                    answer=keyboard.nextLine ();
                }



            }




        }while(answer.equalsIgnoreCase ( "yes" ) && skillCount<21);

        //calling the printing method
       //  printing();



    }

    //This lets us see the output
    public static void printing()
    {
        //Person person = new Person();
        System.out.println ("=================================================" );
        System.out.println ( person.getName ());
        System.out.println (person.getEmailAddress () );
        System.out.println ( );
        System.out.println ("Education" );


    }
}
