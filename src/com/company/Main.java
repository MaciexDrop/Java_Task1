package com.company;

public class Main {

    public static void main(String[] args) {

        ContactsManager myContactManager = new ContactsManager();

        Contact wujekJuzek = new Contact();
            wujekJuzek.name = "Juzek";
            wujekJuzek.number = "123456789";
            myContactManager.addContact(wujekJuzek);
        Contact ciotkaHalina = new Contact();
            ciotkaHalina.name = "Halynka";
            ciotkaHalina.number = "13892948";
            myContactManager.addContact(ciotkaHalina);
        Contact brajan = new Contact();
            brajan.name = "Brajanusz";
            brajan.number = "11111111";
            myContactManager.addContact(brajan);
        Contact kolegaPraca = new Contact();
            kolegaPraca.name = "Malina";
            kolegaPraca.number = "667662152";
            myContactManager.addContact(kolegaPraca);
        Contact dzesika = new Contact();
            dzesika.name = "Jessicca";
            dzesika.number = "000000000";
            myContactManager.addContact(dzesika);

        myContactManager.searchContact("Juzek");
        System.out.println(wujekJuzek.number);

    }
}
