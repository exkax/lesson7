package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        //int [] num = {8, 7, 56, 6};
        Hero[] heroes = {warrior, medic, magic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}
