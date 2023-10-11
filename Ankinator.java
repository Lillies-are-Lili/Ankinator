/**
 * @author LillianNgohuynh
 * @date 10/14/2022
 * @due 12/04/2022
 * Guess The Person! Application
 */

package com.mycompany.finalproject2;

import java.util.ArrayList; //importing needed classes
import java.util.HashMap;
import java.util.Scanner;

public class FinalProject2 {

    public static void main(String[] args) {
        boolean y = true;   //defining variables for the HashMap class below.
        boolean n = false; 
       
        HashMap c1 = new HashMap(); //defining the classmates and their properties to be used in the database.
         c1.put("name","Connor Haubrich");c1.put("play", y);c1.put("AF",n);c1.put("AL",y);c1.put("EF",n);c1.put("EL",n);c1.put("IF",n);c1.put("IL",y);
        HashMap c2 = new HashMap();
         c2.put("name","Mark Kurner");c2.put("play", y);c2.put("AF", y);c2.put("AL",n);c2.put("EF",n);c2.put("EL", y);c2.put("IF",n);c2.put("IL",n);
        HashMap c3 = new HashMap();
        c3.put("name", "Jeanne Macapagal");c3.put("play", y);c3.put("AF", y);c3.put("AL", y);c3.put("EF", y);c3.put("EL", n);c3.put("IF", n);c3.put("IL",n);
        HashMap c4 = new HashMap();
        c4.put("name", "Derrick Mcintyre");c4.put("play", y);c4.put("AF", n);c4.put("AL", n);c4.put("EF", y);c4.put("EL", y);c4.put("IF", y);c4.put("IL",y);
        HashMap c5 = new HashMap();
        c5.put("name", "Lillian Ngohuynh");c5.put("play", y);c5.put("AF", y);c5.put("AL", n);c5.put("EF", n);c5.put("EL", n);c5.put("IF", y);c5.put("IL",n);
        HashMap c6 = new HashMap();
        c6.put("name", "Professor Pete Ortega");c6.put("play", y);c6.put("AF", n);c6.put("AL", y);c6.put("EF", y);c6.put("EL", y);c6.put("IF", n);c6.put("IL",n);
        HashMap c7 = new HashMap();
        c7.put("name", "Blair Patterson");c7.put("play", y);c7.put("AF", y);c7.put("AL", y);c7.put("EF", n);c7.put("EL", y);c7.put("IF", y);c7.put("IL",n);
        HashMap c8 = new HashMap();
        c8.put("name", "Huy Pham");c8.put("play", y);c8.put("AF", n);c8.put("AL", y);c8.put("EF", n);c8.put("EL", n);c8.put("IF", n);c8.put("IL",n);
        HashMap c9 = new HashMap();
        c9.put("name", "Nicholas Rodriguez");c9.put("play", y);c9.put("AF", y);c9.put("AL", n);c9.put("EF", n);c9.put("EL", y);c9.put("IF", y);c9.put("IL",y);
        HashMap c10 = new HashMap();
        c10.put("name", "Danyael Vera");c10.put("play", y);c10.put("AF", y);c10.put("AL", y);c10.put("EF", y);c10.put("EL", y);c10.put("IF", n);c10.put("IL",n);
        HashMap c11 = new HashMap();
        c11.put("name", "Christian Villarreal");c11.put("play", y);c11.put("AF", y);c11.put("AL", y);c11.put("EF", n);c11.put("EL", y);c11.put("IF", y);c11.put("IL",y);
        HashMap c12 = new HashMap();
        c12.put("name", "Anthony Zinsmeyer");c12.put("play", y);c12.put("AF", y);c12.put("AL", n);c12.put("EF", n);c12.put("EL", y);c12.put("IF", n);c12.put("IL",y);
        HashMap c13 = new HashMap();
        c13.put("name", "Suleman Zuberi");c13.put("play", y);c13.put("AF", y);c13.put("AL", n);c13.put("EF", y);c13.put("EL", y);c13.put("IF", n);c13.put("IL",y);
           
        ArrayList database = new ArrayList();   //adding the individuals to the database, using the ArrayList class.
        database.add(c1);database.add(c2);database.add(c3);database.add(c4);database.add(c5);
        database.add(c6);database.add(c7);database.add(c8);database.add(c9);database.add(c10);
        database.add(c11);database.add(c12);database.add(c13);
        
        Scanner sc = new Scanner(System.in);    //taking user input to ask the user the questions.
        
        System.out.println("Are you ready to play, Guess The Person?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "play", database);  //made a method where the answer is the user's input,
        
        System.out.println("Does your person have an 'A' in their first name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "AF", database); //it will also accept the argument for the question, do you want to play, and
        
        System.out.println("Does your person have an 'A' in their last name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "AL", database);    //of course the database argument has to be added as well.
        
        System.out.println("Does your person have an 'E' in their first name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "EF", database);
        
        System.out.println("Does your person have an 'E' in their last name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "EL", database);
        
        System.out.println("Does your person have an 'I' in their first name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "IF", database);
        
        System.out.println("Does your person have an 'I' in their last name?\nNOTE: Type 1 for YES, 2 for NO");
        input(sc.nextInt(), "IL", database);
        
    }
    
    public static void input(int answer, String property, ArrayList database){  //define the method to be called.
       boolean ans;     //this method checks the answer from the user matches one of the keys. 
        if (answer == 1){   //the keys that do not match will be eliminated from the database.
            ans = true;
        }
        else{
            ans = false;      //this boolean statement converts the answers, 1 and 2, to true and false.
        }
        ArrayList remove = new ArrayList(); //instantiate variable, remove. Need to iterate through the database.
        for(Object d: database){    //using an enhanced for loop, if the user describes a person that isnt what they're thinking of
            HashMap person = (HashMap) d;   //it will be added to the remove variable so
            boolean prop = (boolean)person.get(property);   //that the application can further 
            if (prop != ans){   //filter out the wrong possibilities
                remove.add(person);
            }
        }
        for (Object ch: remove){    //using another enhanced for loop to remove the different
           database.remove(ch);     //possibilities from the database
        }
        if (database.size() == 1){  //if the database size is 1, meaning only 1 possibility left,
            
            HashMap person = (HashMap)database.get(0); 
            String name = (String)person.get("name");  //get the person's name from the database
            System.out.println("The person you're thinking of is " + name + "!"); //and then print the name.
            System.exit(0);
        }     
    }
}