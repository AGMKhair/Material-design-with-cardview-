package com.example.sabbir.ispbilling;

/**
 * Created by sabbir on 3/19/2018.
 */

public class Artist {
   String id;
   String name;
   String Phone;


   public Artist()
   {

   }

    public Artist(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        Phone = phone;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return Phone;
    }
}
