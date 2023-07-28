package studentIDProject.sidProject;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class main {


    public static class addStudent {

        public static void  addId()
        {
            HashMap<String, UUID> hm = new HashMap<>();

            Scanner kb = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            System.out.println("How many entries would you like to enter? ");
            int num = kb.nextInt();


            for(int i = 0; i < num; i++){
                System.out.println("Enter a student name: ");
                String a =  in.nextLine();
                UUID uuid = UUID.randomUUID();
                hm.put(a, uuid);

            }

            for(String sid : hm.keySet())
            {
                String userKey = sid;
                String userValue = String.valueOf(hm.get(sid));

                System.out.println("Student name: "+ userKey);
                System.out.println("Student ID: "+userValue);
            }
        }
    }

    public static void main(String[] args) {

        addStudent.addId();


    }
}
