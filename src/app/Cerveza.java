package app;

public abstract class Cerveza {

	    private static int contId = 1;
	    private int id;
	    private String nombre;
	    private String descripcion;
	    private float abv;
	    private float precio;

	    public Cerveza(String nombre, String descripcion, float abv, float precio) {
	        setNombre(nombre);
	        setDescripcion(descripcion);
	        setAbv(abv);
	        setPrecio(precio);
	        setId();
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
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public float getAbv() {
	        return this.abv;
	    }

	    public void setAbv(float abv) {
	        this.abv = abv;
	    }

	    public float getPrecio() {
	        return this.precio;
	    }

	    public void setPrecio(float precio) {
	        this.precio = precio;
	    }

	    public abstract float calcularCostoFab();

	    @Override
	    public String toString() {

	        return "Nombre: " + nombre + ", ID: " + id + ", descripcion: " + descripcion + ", ABV: " + abv + ", precio: $" + precio + ".";
	    }
	
}
