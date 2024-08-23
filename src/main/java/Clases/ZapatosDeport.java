
package Clases;

/**
 *
 * @author Jero
 */
public class ZapatosDeport {

 
    private String nombre;
    private String modelo;
    private double talla;
    private double precio;

    // Constructor
    public ZapatosDeport(String nombre, String modelo, double talla, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para talla
    public double getTalla() {
        return talla;
    }

    // Setter para talla
    public void setTalla(double talla) {
        this.talla = talla;
    }

    // Getter para precio
    public double getPrecio() {
        return precio;
    }

    // Setter para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ZapatosDeport{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", talla=" + talla +
                ", precio=" + precio +
                '}';
    }
}
