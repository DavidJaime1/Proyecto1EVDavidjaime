import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Concesionario {
    private final int TAMANYO;
    public double facturacionLocal;
    public ArrayList<Coche> listadoCoches;

    public Concesionario(double facturacionLocal, int tamanyo) {
        this.facturacionLocal = facturacionLocal;
        this.TAMANYO = tamanyo;
        listadoCoches = new ArrayList<Coche>(TAMANYO);
    }

    public Concesionario(int tamanyo) {
        this.facturacionLocal = 0;
        this.TAMANYO = tamanyo;
        listadoCoches = new ArrayList<Coche>(TAMANYO);
    }

    public void adquirirCoche(Coche coche) {

        for (Coche coches : listadoCoches) {
            if (coches.getMatricula().equals(coche.getMatricula())) {
                System.out.println("El coche con la matricula " + coche.getMatricula() + "ya ha sido añadido");
                return;
            }
        }

        if (listadoCoches.size() + 1 > TAMANYO) {
            System.out.println("Concesionario lleno, no se puede introducir el coche");
            return;
        }

        listadoCoches.add(coche);
        System.out.println("Coche añadido correctamente.");

    }
}
