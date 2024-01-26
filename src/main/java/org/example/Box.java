package org.example;
import java.util.Comparator;

public abstract class Box <T extends Fruit> {

    public boolean compare(Box o) {
        if (o != null){  return (getWeight()== o.getWeight());}
        return false;
    }
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Box(float weight) {
        this.weight = weight;
    }

    public abstract void addFruit(T fruit, int count);

    public abstract void addBox(Box<T> box);

}
