public class Servicio {
    // Atributos (3-5 mínimo requeridos)
    private String codigoServicio;
    private String nombre;
    private double precio;
    private int duracionMinutos;

    // Constructor completo
    public Servicio(String codigoServicio, String nombre, double precio, int duracionMinutos) {
        this.codigoServicio = codigoServicio;
        this.nombre = nombre;
        this.precio = precio;
        this.duracionMinutos = duracionMinutos;
    }

    // Método de negocio: Simula un cálculo (comportamiento)
    public double calcularPrecioConDescuento(double porcentaje) {
        // Retorna el precio aplicando el descuento
        return this.precio - (this.precio * porcentaje);
    }

    // Método para mostrar información
    public void mostrarDetalles() {
        System.out.println("Servicio: " + nombre + " (" + duracionMinutos + " min) | Precio Base: $" + precio);
    }
    
    // Getters necesarios para la prueba
    public double getPrecio() { return precio; }
}