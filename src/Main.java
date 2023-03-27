import java.util.*;

public class Main {
    public static void main(String[] args) throws NoLicenseException {
        Mechanic semen = new Mechanic<Car>("Семен Семеныч", "Рога и Копыта");
        Sponsor aeroflot = new Sponsor("Аэрофлот", 1_000_000);

        Car lada = new Car("Lada", "Granta", 1.7f, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8", 3.0f, Car.BodyType.HATCHBACK);
        Car bmw = new Car("BMW", "Z8", 3.5f, Car.BodyType.COUPE);
        Car kia = new Car("Kia", "Sportage", 4.0f, Car.BodyType.SUV);

        Truck laz = new Truck("ЛАЗ", "123", 2.0f, Truck.LoadCapacity.N1);
        Truck maz = new Truck("МАЗ", "5440", 13.4f, Truck.LoadCapacity.N2);
        Truck gaz = new Truck("ГАЗ", "345", 11.5f, Truck.LoadCapacity.N1);
        Truck kamaz = new Truck("КАМАЗ", "678", 16.0f, Truck.LoadCapacity.N3);

        Bus gazel = new Bus("ГАЗель", "3110", 3.5f, Bus.Capacity.SMALL);
        Bus paz = new Bus("ПАЗ", "6756", 2.5f, Bus.Capacity.AVERAGE);
        Bus belaz = new Bus("БЕЛаз", "3421", 3.7f, Bus.Capacity.LARGE);
        Bus sobol = new Bus("СОБОЛЬ", "3414", 4.8f, Bus.Capacity.ESPECIALLY_SMALL);

        DriverC<Truck> semenTruck = new DriverC<>("Семен Алексеевич Грузовиков", true, 2);
        DriverD<Bus> antonBus = new DriverD<>("Антон Антонович Автобусов", true, 5);

        ArrayList<String> list = new ArrayList<>();
        list.add("Иван Иванов");
        list.add("Петр Петров");
        list.add("Егор Сидоров");
        list.add("Александр Смирнов");
        list.add("Александр Смирнов");
        list.add("Петр Петров");

        System.out.println(Arrays.toString(list.toArray()));

        Set<String> set = new HashSet<>();
        set.add("Иван Иванов");
        set.add("Петр Петров");
        set.add("Егор Сидоров");
        set.add("Александр Смирнов");
        set.add("Александр Смирнов");
        set.add("Петр Петров");


        System.out.println(Arrays.toString(set.toArray()));
    }


            }

