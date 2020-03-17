/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.List;

public class Partition {

    private Hospital hospital;
    private int capacity;
    private List<Element> elements;

    public Partition(Hospital hospital, int capacity) {
        this.hospital = hospital;
        this.capacity = capacity;
        this.elements = new ArrayList<>();

    }

    public void addElement(Element element) {
        getElements().add(element);
    }

    public boolean isNotFull() {
        return getElements().size() < getCapacity();
    }

    /**
     * @return the hospital
     */
    public Hospital getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the elements
     */
    public List<Element> getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

}
