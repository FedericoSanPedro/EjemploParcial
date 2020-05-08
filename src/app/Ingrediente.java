package app;

public class Ingrediente {

    private static int contId = 1;
    private int id;
    private String nombre;
    private String descripcion;
    private int cant;
    private float precio;

    public Ingrediente(String nombre, String descripcion, int cant, float precio) {
        setId();
        setNombre(nombre);
        setDescripcion(descripcion);
        indicarCantidad(cant);
        setPrecio(precio);
    }
    
    public int getId() {
        return this.id;
    }

    private void setId() {
        this.id = contId++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return this.cant;
    }

    public void indicarCantidad(int cant) {
        this.cant = cant > 0 ? cant : 0;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

	public String toString() {
        return "Nombre: " + nombre + ", descripcion " + descripcion + ", cantidad: " + cant + ", precio: $" + precio + ".";
    }
}
