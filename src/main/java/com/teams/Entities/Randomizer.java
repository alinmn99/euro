package com.teams.Entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {

    // Drive Function
    public static void main(String[] args) {

        // create a list
        List<String> list = new ArrayList<>();
        // 24 countrys
        list.add("Italy");
        list.add("Turkey");
        list.add("Switzerland");
        list.add("Wales");
        list.add("Belgium");
        list.add("Denmark");
        list.add("Finland");
        list.add("Russia");
        list.add("Austria");
        list.add("Macedonia");
        list.add("Netherlands");
        list.add("Ukraine");
        list.add("Croatia");
        list.add("Czech Republic");
        list.add("England");
        list.add("Scotland");
        list.add("Poland");
        list.add("Slovakia");
        list.add("Spain");
        list.add("Sweden");
        list.add("France");
        list.add("Germany");
        list.add("Hungary");
        list.add("Portugal");



        Randomizer obj = new Randomizer();

        // take a random element from list and print them
        System.out.println(obj.getRandomElement(list));
    }

    // Function select an element base on index
    // and return an element
    public String getRandomElement(List<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}