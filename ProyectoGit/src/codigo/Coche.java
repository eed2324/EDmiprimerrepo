package codigo;

public class Coche {
    private static final double TASA_IMPUESTO = 0.10;
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    // Constructor
    public Coche(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar por pantalla la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }

    // Método para calcular el impuesto de un coche
    public double calcularImpuesto() {
        // Se asume un impuesto del 10% sobre el precio
        return precio * TASA_IMPUESTO;
    }
    
    public boolean anteriorA(int anio) {
    	return (this.año < anio);
    }
}
