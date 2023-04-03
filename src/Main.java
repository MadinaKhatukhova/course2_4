import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoLicenseException {

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
        Mechanic mechanic = new Mechanic();
        Mechanic.addMechanic("Subaru","Олег Валентинович");
        Mechanic.addMechanic("Chevrolet","Игорь Сергеевич");
        Mechanic.addMechanic("Dodge","Евгений Виссарионович");
        Mechanic.addMechanic("Jeep","Никита Покров");
        Mechanic.addMechanic("Pontiac","Юрий Могучий");
        Mechanic.addMechanic("Cadillac","Евгений Васильевич");
        Mechanic.addMechanic("Tesla","Леонид Петрович");
        System.out.println(mechanic);
        Map<Transport, List<Mechanic>> map = new HashMap<>();
        Mechanic[] ivan = new Mechanic[0];
        map.put(lada, List.of(ivan));
        Mechanic[] semen = new Mechanic[0];
        map.put(maz, List.of(semen));
        map.put(kamaz, List.of(semen));
        map.put(lada, List.of(ivan));
        map.put(paz, List.of(semen));
        for (Transport transport: map.keySet()) {
            System.out.println("В мапе присутствует транспорт модели " + lada);
        }
        for (Transport transport: map.keySet()) {
            System.out.println("В мапе присутствует транспорт модели " + paz);
        }
        for ( Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        CollectionMapStringInteger collectionMapStringInteger= new CollectionMapStringInteger();
        collectionMapStringInteger.addMap("Str1", 3);
        collectionMapStringInteger.addMap("Str2", 2);
        collectionMapStringInteger.addMap("Str1", 5);
        System.out.println(collectionMapStringInteger);
    }


    public static void getEvenNumbers(Set<Integer> integerSet, List<Integer> integerList) {
        for (Integer integer : integerSet) {
            if (integer % 2 == 0) {
                integerList.add(integer);
            }
        }
    }


    }

