package com.core.javacodes.ArraysHashing;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJoins {

    public static void main(String[] args) {

        String[] batsmen = {
                "Rohit",
                "Virat",
                "Dhawan",
                "Shreyas",
                "Rishabh",
                "Shubhman"
        };

        String[] bowlers = {
                "Hardik",
                "Bhuvi",
                "Bumrah",
                "Chahal",
                "Jaddu"
        };

        //Traditional Approach
        // Determine the length of the combined array
        String[] team = new String[batsmen.length + bowlers.length];

        // Copy elements of batsmen into the team array
        int index = 0;
        for (String batsman : batsmen) {
            team[index++] = batsman;
        }

        // Copy elements of bowlers into the team array
        for (String bowler : bowlers) {
            team[index++] = bowler;
        }

        // Print the resulting array
        System.out.println(Arrays.toString(team));


        //Java 8
        Stream<String> sBat = Arrays.stream(batsmen);
        Stream<String> sBow = Arrays.stream(bowlers);

        String[] fullTeam = Stream.concat(sBat,sBow).toArray(size -> new String[size]);

        for (String s: fullTeam)
        {
            System.out.println(s);
        }
    }
}
