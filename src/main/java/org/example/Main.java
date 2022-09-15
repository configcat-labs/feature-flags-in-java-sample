package org.example;
import com.configcat.*;

public class Main {
    public static void main(String[] args) {

        ConfigCatClient client = ConfigCatClient.newBuilder()
                .build("YOUR-SDK-KEY");

        boolean bonus = client.getValue(Boolean.class, "bonus", false);

        System.out.println("bonus's value from ConfigCat: " + bonus);

        displaySalaries(bonus);

    }

    public static void displaySalaries(boolean bonus){
        String[] employees = {"Ada Lovelace", "Alan Turing", "Edsger Dijkstra", "Grace Hopper"};

        int[] salaries = {2500, 1700, 2450, 3500};

        if(bonus){
            for (int i =0; i<employees.length; i++)
            {
                System.out.println(employees[i] + ": " + (salaries[i] + 0.1*salaries[i]));
            }
        }
        else{
            for (int i =0; i<employees.length; i++)
            {
                System.out.println(employees[i] + ": " + salaries[i]);
            }
        }
    }
}