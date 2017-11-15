package org.grow.collection.tasks.data;

public class Apple {
    private Integer weight;
    private Color color;
    
    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
    
    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public boolean isRed() {
        return Color.RED.equals(color);
    }
    
    public boolean isLightWeight() {
        return weight < 100;
    }

    @Override
    public String toString() {
        return "Apple [weight=" + weight + ", color=" + color + "]";
    }
}
