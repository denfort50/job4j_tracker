package ru.job4j.stream;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int volume;
    private int hp;
    private int maxSpeed;
    private long vin;
    private int price;
    private boolean sportCar;

    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", volume=" + volume
                + ", hp=" + hp
                + ", maxSpeed=" + maxSpeed
                + ", vin=" + vin
                + ", price=" + price
                + ", sportCar=" + sportCar
                + '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private String color;
        private int year;
        private int volume;
        private int hp;
        private int maxSpeed;
        private long vin;
        private int price;
        private boolean sportCar;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildYear(int year) {
            this.year = year;
            return this;
        }

        Builder buildVolume(int volume) {
            this.volume = volume;
            return this;
        }

        Builder buildHp(int hp) {
            this.hp = hp;
            return this;
        }

        Builder buildMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        Builder buildVin(long vin) {
            this.vin = vin;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        Builder buildSportCar(boolean sportCar) {
            this.sportCar = sportCar;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.color = color;
            car.year = year;
            car.volume = volume;
            car.hp = hp;
            car.maxSpeed = maxSpeed;
            car.vin = vin;
            car.price = price;
            car.sportCar = sportCar;
            return car;
        }

        public static void main(String[] args) {
            Car car = new Builder().buildBrand("Toyota")
                    .buildModel("Supra")
                    .buildColor("Yellow")
                    .buildYear(2005)
                    .buildVolume(3499)
                    .buildHp(550)
                    .buildMaxSpeed(335)
                    .buildVin(6487951235849561324L)
                    .buildPrice(100000)
                    .buildSportCar(true)
                    .build();
            System.out.println(car);
        }
    }
}


