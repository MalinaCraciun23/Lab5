/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import com.github.javafaker.Faker;

/**
 *
 * @author mike
 */
public class Problem {

    static public void match() {

        Faker faker = new Faker();
        Resident[] residents = {new Resident(faker.name().fullName())};
        Hospital[] hospitals = {new Hospital(faker.funnyName().name())};

        System.out.println(residents[0]);
        System.out.println(hospitals[0]);
    }

}
