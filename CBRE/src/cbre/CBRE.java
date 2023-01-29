/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbre;

/**
 *
 * @author samuel jacobs
 */
import java.io.*;
import java.util.*;

public class CBRE {

   
    public static void main(String[] args) {
        // TODO code application logic here
        CBRE main = new CBRE();
        main.ROOMS();
    }

    public void ROOMS() {
        String floors[] = {"A", "B", "C", "D", "E"};
        int floorSpace[] = {43, 81, 73, 54, 97};
        int floorSpaceFilled[] = {0, 0, 0, 0, 0};
        int teams[] = {22, 45, 34, 51, 11, 37, 42, 16, 29, 56, 49};
        int maxTeams = 0;
        boolean teamsFilled[] = new boolean[11];
        boolean teamCheck = true;
        String floorPlan[] = {"team", "team", "team", "team", "team"};
        for (int i = 0; i < teamsFilled.length; i++) {
            teamsFilled[i] = false;
        }
    
       
        int loopCount=  0;
        while (teamCheck) {
            loopCount +=1;
            for (int i = 0; i < floors.length; i++) {
                for (int j = 0; j < teams.length; j++) {
                    if ((floorSpaceFilled[i] < floorSpace[i]) && (teams[j] + floorSpaceFilled[i] < floorSpace[i]) && (teamsFilled[j] == false)) {
                        floorPlan[i] += " " + teams[j];
                        teamsFilled[j] = true;
                        maxTeams+=1;
                        floorSpaceFilled[i] += teams[j];

                    }
                }
            }
            teamCheck =false;
             for(int i = 0; i < teams.length; i++){
                if(teamsFilled[i] == false){
                    teamCheck = true;
                }
            }
             
            if(loopCount > teams.length){
                break;
            }
            for(int i =0; i < floors.length; i++){
                if(!((floorSpaceFilled[i] / floorSpace[i] *1.00) < .75)){
                    System.out.print("bad");
                    
                    
                }
            }
        }
        for(int i = 0; i < floorPlan.length; i++){
            System.out.println(floorPlan[i]);
            
        }
        System.out.println("Max Teams Used " + maxTeams);
        //}
        return;
    }
}
