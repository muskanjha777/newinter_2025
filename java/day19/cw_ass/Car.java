package day19;

public class Car {

    String model;
    int year;

    Car(String m, int y) {
        model = m;
        year = y;
    }

    // Copy constructor
    Car(Car c) {
        model = c.model;
        year = c.year;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda City", 2020);
        Car c2 = new Car(c1); // copy constructor

        c1.display();
        c2.display();
    }
}
