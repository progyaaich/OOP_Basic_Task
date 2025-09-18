class TrafficLight {
    String color;
    int duration;

    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
    }

    boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        System.out.println("Is Red? " + light.isRed());
        light.changeColor("Green", 45);
        System.out.println("Is Green? " + light.isGreen());
    }
}
