package org.example;

public class AppleBox extends Box<Apple>{

    public AppleBox(float weight) {
        super(weight);
    }

    @Override
    public void addFruit(Apple apple, int count) {
        setWeight((float) (getWeight()+count* apple.getWeight()));
    }

    @Override
    public void addBox(Box<Apple> box) {
            box.setWeight(getWeight()+box.getWeight());
            setWeight(0);
    }

    @Override
    public String toString() {
        return String.format("Вес коробки с яблоками %s кг", getWeight());
    }
}
