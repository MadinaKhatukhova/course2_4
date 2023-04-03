import java.util.Objects;

public class Mechanic<T extends Transport> {
   public static void addMechanic(String subaru, String олег_валентинович) {
    }

   String name;

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean doService(T transport){
        return transport.passDiagnostics();
    }

    public void doRepair(T transport){
        transport.passRepair();
    }

}

