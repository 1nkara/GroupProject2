package Task8;

public class CarDemo {

        public static void main(String[] args) {
            Car car = new Car(15000, "Black");
            System.out.println("Car Price: " + car.calculateSalePrice());

            Truck truck = new Truck(20000, "White", 3500);
            System.out.println("Truck Price: " + truck.calculateSalePrice());

            Sedan sedan = new Sedan(17000, "Silver", 25);
            System.out.println("Sedan Price: " + sedan.calculateSalePrice());
        }
    }

