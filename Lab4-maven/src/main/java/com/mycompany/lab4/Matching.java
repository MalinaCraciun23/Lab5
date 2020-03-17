/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.List;
import java.util.Map;

public class Matching {

    private Partition[] partitions;
    private Element[] elements;
    private Map<Resident, List<Hospital>> resPrefMap;
    private Map<Hospital, List<Resident>> hosPrefMap;

    public Matching(Partition[] partitions, Element[] elements) {
        this.partitions = partitions;
        this.elements = elements;
    }

    /**
     * @return the partitions
     */
    public Partition[] getPartitions() {
        return partitions;
    }

    /**
     * @param partitions the partitions to set
     */
    public void setPartitions(Partition[] partitions) {
        this.partitions = partitions;
    }

    /**
     * @return the elements
     */
    public Element[] getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(Element[] elements) {
        this.elements = elements;
    }

}
