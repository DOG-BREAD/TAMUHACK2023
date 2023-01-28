/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbre;

/**
 *
 * @author theje
 */
import java.io.*;
import java.util.*;

public class CBRE {

    /**
     * @param args the command line arguments
     */
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
        boolean teamsFilled[] = new boolean[11];

        String floorPlan[] = {"team", "team", "team", "team", "team"};
        for (int i = 0; i < teamsFilled.length; i++) {
            teamsFilled[i] = false;
        }
        //int prefferences;
        //while(){

        //sort teams largest to smallest
        while (true) {
            for (int i = 0; i < floors.length; i++) {
                for (int j = 0; j < teams.length; j++) {
                    if ((floorSpaceFilled[i] < floorSpace[i]) && (teams[j] + floorSpaceFilled[i] < floorSpace[i]) && (teamsFilled[j] == false)) {
                        floorPlan[i] += " " + teams[j];
                        teamsFilled[j] = true;
                        floorSpaceFilled[i] += teams[j];

                    }
                }
            }
            // if t
            break;
        }
        for(int i = 0; i < floorPlan.length; i++){
            System.out.println(floorPlan[i]);
        }
        //}
        return;
    }
}
