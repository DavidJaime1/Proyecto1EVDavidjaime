public class Coche {
    private String Marca;
    private String Modelo;
    private String Matricula;
    private int Anyo;
    private double Precio;
    private int Kms;

    public Coche(String marca, String modelo, String matricula, int anyo, double precio, int kms) {
        Marca = marca;
        Modelo = modelo;
        Matricula = matricula;
        Anyo = anyo;
        Precio = precio;
        Kms = kms;
    }

    public Coche() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getAnyo() {
        return Anyo;
    }

    public void setAnyo(int anyo) {
        Anyo = anyo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getKms() {
        return Kms;
    }

    public void setKms(int kms) {
        Kms = kms;
    }

    public void Descuento(int descuento, Coche coche){
        if (descuento< 1 || descuento> 50 ){
            System.out.println("ERROR: Debe especificar un valor entre 1 y 50");
            return;
        }
        double descuentoVehiculo = coche.Precio * descuento / 100;
        coche.Precio = coche.Precio - descuentoVehiculo;

    }

    @Override
    public String toString() {
        return "Coche{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Matricula='" + Matricula + '\'' +
                ", Anyo=" + Anyo +
                ", Precio=" + Precio +
                ", Kms=" + Kms +
                '}';
    }
}
