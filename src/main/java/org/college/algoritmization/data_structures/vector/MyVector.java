package org.college.algoritmization.data_structures.vector;

public class MyVector {
    private String[] elements;

    public MyVector()
    {
        elements = new String[10];
    }

    public MyVector(int initial_size)
    {
        elements = new String[initial_size];
    }

    public void addElement(String element, int id){

    }

    public void deleteElement(int id){

    }

    public String getElement()
    {
        return "";
    }

    public int getSize()
    {
        int size = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (elements[i] != null) {
                size++;
            }
        }

        return size;
    }

    public int getCapacity()
    {
        return elements.length;
    }
}
