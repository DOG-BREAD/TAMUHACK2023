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
import java.lang.reflect.Array;
import java.util.*;
public class CBRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> teams = new ArrayList<Integer>();
        ArrayList<Integer> strengths = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>>  preferred = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>>  tolerated = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>>  noWay = new ArrayList<ArrayList<Integer>>();

        File files = new File("/Users/ibadmomin/Desktop/TAMUHACK/CBRE/src/cbre/data.txt");
        Scanner scan = new Scanner(files);

        ArrayList<Integer> prefTeamsList = new ArrayList<Integer>();
        ArrayList<Integer> tolTeamsList = new ArrayList<Integer>();
        ArrayList<Integer> noWayTeamsList = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> teamPref = new ArrayList<ArrayList<Integer>>();

        while (scan.hasNext()){
            String s = "";
            for (int i=0; i<5; i++){
                s += scan.nextLine() + "\n";
            }
            Scanner lineScan = new Scanner(s);
            int team = lineScan.nextInt();
            teams.add(team);
            int people = lineScan.nextInt();
            strengths.add(people);
            lineScan.nextLine();
            String prefTeamString = lineScan.nextLine();
            prefTeamString = prefTeamString.replace(" ", "");
            String[] prefTeamArr = prefTeamString.split(",");
            int[] prefTeams = new int[prefTeamArr.length];
            String tolTeamString = lineScan.nextLine();
            tolTeamString = tolTeamString.replace(" ", "");
            String[] tolTeamArr = tolTeamString.split(",");
            int[] tolTeams = new int[tolTeamArr.length];
            String noWayString = lineScan.nextLine();
            noWayString = noWayString.replace(" ", "");
            String[] noWayArr = noWayString.split(",");
            int[] noWayTeams = new int[noWayArr.length];

            //converts string of preferred teams to int
            for (int i=0; i<prefTeams.length; i++){
                prefTeams[i] = (Integer.parseInt(prefTeamArr[i]));
            }
            preferred.add(prefTeamsList);

            for (int i=0; i<tolTeams.length; i++){
                tolTeams[i] = (Integer.parseInt(tolTeamArr[i]));
            }
            tolerated.add(tolTeamsList);

            for (int i=0; i<noWayTeams.length; i++){
                noWayTeams[i] = (Integer.parseInt(noWayArr[i]));
            }

            System.out.println("team: "+ team);
            System.out.println("people: "+ people);
            System.out.println("preferred: "+ Arrays.toString(prefTeams));
            System.out.println("tolerated: "+ Arrays.toString(tolTeams));
            System.out.println("no way: "+ Arrays.toString(noWayTeams));

        }

        rooms(teams, strengths, preferred);
    }
    public String rooms(ArrayList<Integer> teams, ArrayList<Integer> strength, ArrayList<Integer> preferred){
    String floors[] = {"A","B","C","D","E"};
    System.out.print(teams.get(0));
//    int floorSpaces[] = new int[];
//    int floorSpace[] = {43,81,73,54,97};
//    int floorSpaceFilled[] = {0,0,0,0,0};
//    int teams[] = {22,45,34,51,11,37,42,16,29,56,49};
    boolean teamsFilled[] = new boolean[11];
    int i=0;
    for( i = 0; i < teamsFilled.length; i++){
        teamsFilled[i] = false;
    }
    return "";
}
}

