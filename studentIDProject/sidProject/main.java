package studentIDProject.sidProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

/**
 * TODO:
 * -git setup
 * -*Write into a print file/read it also* - Kelly/Terry
 * -*connect to spring boot(database)* - Josh
 * -*search system(looking for key or value)*
 * -*remove function* - Chris/Terry
 * -edit key only
 * -*sort alphabetical*
 * -get date of birth also(brainstorm)
 * -UI
 */
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
            try{
                FileWriter fw = new FileWriter("sidProject/SID.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                    for(Map.Entry<String, UUID> entry : hm.entrySet())
                    {
                        String key = entry.getKey();
                        String value = String.valueOf(entry.getValue());
                        bw.write("Student name: "+key+ " Student ID: "+value);
                        bw.newLine();
                    }
                    bw.close();
                    fw.close();
                System.out.println("Data is written to a file");
            }catch(IOException e){
                System.out.println("Error writing to file: "+ e.getMessage());

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

