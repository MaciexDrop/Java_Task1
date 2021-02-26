package com.company;
//adding class which will store contacts in an array, and keep number of the last added contact
public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;
    //parametrised constructor
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for (int i=0;i<friendsCount;i++){
            if (myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
