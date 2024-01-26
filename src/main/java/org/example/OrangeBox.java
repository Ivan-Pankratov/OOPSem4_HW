package org.example;

public class OrangeBox extends Box<Orange>{

    public OrangeBox(float weight) {
        super(weight);
    }

    @Override
    public void addFruit(Orange orange, int count) {
        setWeight((getWeight()+count* orange.getWeight()));
    }

    @Override
    public void addBox(Box<Orange> box) {
            box.setWeight(getWeight()+box.getWeight());
            setWeight(0);
    }

    @Override
    public String toString() {
        return String.format("Вес коробки с апельсинами %s кг", getWeight());
    }
}
