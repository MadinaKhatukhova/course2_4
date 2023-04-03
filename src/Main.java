import jdk.internal.jimage.ImageStream;

import jdk.internal.org.objectweb.asm.tree.AbstractInsnNode;
import jdk.internal.org.objectweb.asm.tree.InsnList;
import sun.net.www.MessageHeader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NoLicenseException {
        Mechanic semen = new Mechanic<Transport>();
        Mechanic ivan = new Mechanic<Transport>();
        Sponsor aeroflot = new Sponsor("Аэрофлот", 1_000_000);

        Car lada = new Car("Lada", "Grant", 1.7f, Car.BodyType.SEDAN);
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


        Map<Transport, List<Mechanic>> map = new HashMap<>();
        map.put(paz, List.of(semen));
        map.put(lada, List.of(ivan));
        map.put(maz, List.of(semen));
        map.put(kamaz, List.of(semen));
        map.put(lada, List.of(ivan));
        for (Transport transport: map.keySet()) {
            System.out.println("В мапе присутствует транспорт модели " + lada);
        }

        for (List<Mechanic> transport: map.values()) {
            System.out.println("В мапе присутствует механик  " + semen);
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

    public static void generateRandom(Set<Integer> integerSet) {
        Random random = new Random();
        int i = 0;
        while (i < 20) {
            integerSet.add(random.nextInt(1000));
            i++;
        }
    }

    }
