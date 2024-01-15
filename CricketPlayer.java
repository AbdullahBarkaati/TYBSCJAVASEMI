package com.example.demo;

import java.util.Scanner;

public class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totruns;
    double bat_avg;

    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totruns = totruns;
    }

    public static void calculateAvg(CricketPlayer[] players) {
        for (CricketPlayer player : players) {
            double inning = player.no_of_innings + 0.0;
            player.bat_avg = player.totruns / inning;
        }
    }

    public static void sort(CricketPlayer[] players) {
        CricketPlayer player;
        for (int i=0; i<players.length; i++) {
            for (int j=i+1; j<players.length; j++) {
                if(players[i].bat_avg > players[j].bat_avg) {
                    player = players[i];
                    players[i] = players[j];
                    players[j] = player;
                }
            }
        }
    }

    public void display() {
        System.out.println("Player Details----");
        System.out.println("Name : "+ name + " No Of Innings : "+no_of_innings);
        System.out.println("Total Runs : "+ totruns + " No Of Notouts : "+no_of_times_notout);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, inning, runs, notout;
        String name;
        System.out.println("Enter Total Number Of Players");
        n = sc.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter Player Details [name, No Of Innings, Total Runs, Notout");
            name = sc.next();
            inning = sc.nextInt();
            runs = sc.nextInt();
            notout = sc.nextInt();
            players[i] = new CricketPlayer(name, inning, notout, runs);
        }
        calculateAvg(players);
        sort(players);
        for (CricketPlayer player:players) {
            player.display();
        }
    }
}
