package org.college.algoritmization.data_structures.vector;

public class MyVector {
    private String[] elements;
    private int capacity_multiplier;

    private static final int DEFAULT_CAPACITY_MULTIPLIER = 2;

    public MyVector()
    {
        elements = new String[10];
        capacity_multiplier = DEFAULT_CAPACITY_MULTIPLIER;
    }

    public MyVector(int initial_size)
    {
        elements = new String[initial_size];
        capacity_multiplier = DEFAULT_CAPACITY_MULTIPLIER;
    }

    public MyVector(int initial_size, int capacity_multiplier)
    {
        this.elements = new String[initial_size];
        this.capacity_multiplier = capacity_multiplier;
    }

    private void checkCapacity()
    {
        int size = getSize();
        int capacity = getCapacity();

        if (size == capacity) {
            String[] new_elements = new String[capacity * capacity_multiplier];
            System.arraycopy(elements, 0, new_elements, 0, size);

            elements = new_elements;
        }
    }

    public void addElement(String element, int id){
        if (id < 0 || id >= getSize() + 1) {
            throw new IndexOutOfBoundsException(id);
        }
        if (element == null) {
            throw new IllegalArgumentException("'element' is null!");
        }

        checkCapacity();

        for (int i = id; i < getSize(); i++) {
            elements[id + 1] = elements[id];
        }

        elements[id] = element;
    }

    public void deleteElement(int id){
        if (id < 0 || id >= getCapacity()) {
            throw new IndexOutOfBoundsException(id);
        }

        elements[id] = null;
        for (int i = id + 1; i < getCapacity(); i++) {
            elements[i - 1] = elements[i];
        }
    }

    public String getElement(int id)
    {
        if (id < 0 || id >= getCapacity()) {
            throw new IndexOutOfBoundsException(id);
        }

        return elements[id];
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
