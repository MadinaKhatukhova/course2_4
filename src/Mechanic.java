import java.util.HashMap;
import java.util.Objects;

public class Mechanic<T extends Transport> {


       public boolean doService(T transport){
        return transport.passDiagnostics();
    }

    public void doRepair(T transport){
        transport.passRepair();
    }


    static HashMap<String, String> Mechanic;

    public static void addMechanic(String kay, String meaning){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mechanic that = (Mechanic) o;
        return Objects.equals(Mechanic, that.Mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Mechanic);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + Mechanic;
    }
}


