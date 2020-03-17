/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Resident[] residents = IntStream.rangeClosed(0, 3).mapToObj(i
                -> new Resident("R" + i)).toArray(Resident[]::new);
        Hospital[] hospitals = IntStream.rangeClosed(0, 2).mapToObj(i
                -> new Hospital("H" + i)).toArray(Hospital[]::new);
        List<Resident> residentList = Arrays.asList(residents);
        residentList = residentList.stream().sorted(Comparator.comparing(Resident::getName)).collect(Collectors.toList());
        Set<Hospital> hospitalSet = new TreeSet<>(Arrays.asList(hospitals));

        Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
        Map<Hospital, List<Resident>> hosPrefMap = new TreeMap<>();
        resPrefMap.put(residents[0], Arrays.asList(hospitals[0], hospitals[1], hospitals[2]));
        resPrefMap.put(residents[1], Arrays.asList(hospitals[0], hospitals[1], hospitals[2]));
        resPrefMap.put(residents[2], Arrays.asList(hospitals[0], hospitals[1]));
        resPrefMap.put(residents[3], Arrays.asList(hospitals[0], hospitals[2]));
        hosPrefMap.put(hospitals[0], Arrays.asList(residents[3], residents[0], residents[1], residents[2]));
        hosPrefMap.put(hospitals[1], Arrays.asList(residents[0], residents[2], residents[1]));
        hosPrefMap.put(hospitals[2], Arrays.asList(residents[0], residents[1], residents[3]));
        List<Hospital> target = Arrays.asList(hospitals[0], hospitals[2]);
        List<Resident> result = residentList.stream().filter(res -> resPrefMap.get(res).containsAll(target)).collect(Collectors.toList());
        List<Hospital> hResult = hospitalSet.stream().filter(hos -> hosPrefMap.get(hos).get(0).equals(residents[0])).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(hResult);

        Problem.match();

    }
}
