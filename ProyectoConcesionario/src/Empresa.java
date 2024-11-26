import java.util.HashMap;
import java.util.List;

public class Empresa {
    private String Nombre;
    private double facturacionEmpresa;

    private HashMap<String, Concesionario> grupo;

    public Empresa(String nombre, HashMap<String, Concesionario> grupo) {
        Nombre = nombre;
        this.facturacionEmpresa = 0;
        this.grupo = grupo;
    }

    public Empresa(String nombre) {
        Nombre = nombre;
        this.facturacionEmpresa = 0;
        grupo = new HashMap<>();
    }

    public void crearSede(String ciudad, int tamanyo) {
        if (grupo.containsKey(ciudad)) {
            System.out.println("Este concesionario ya existe");
            return;
        }
        grupo.put(ciudad, new Concesionario(tamanyo));
        System.out.println("Concesionario " + ciudad + " añadido a la empresa " + Nombre);
    }

    public void facturacionTotal() {
        for (Concesionario concesionario : grupo.values()) {
            facturacionEmpresa += concesionario.facturacionLocal;

        }
        System.out.println("La facturación total de la empresa es: " + facturacionEmpresa);
    }
    public Concesionario getConcesionario(String nombreConcesionario) {
        if (grupo.containsKey(nombreConcesionario)) {
            return grupo.get(nombreConcesionario);
        }
        return null;
    }




    public String getNombre () {
        return Nombre;
    }

    public void setNombre (String nombre){
        Nombre = nombre;
    }

    public double getFacturacionEmpresa () {
        return facturacionEmpresa;
    }

    public void setFacturacionEmpresa ( double facturacionEmpresa){
        this.facturacionEmpresa = facturacionEmpresa;
    }

    public HashMap<String, Concesionario> getGrupo () {
        return grupo;
    }

    public void setGrupo (HashMap < String, Concesionario > grupo){
        this.grupo = grupo;
    }
}


