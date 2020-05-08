package app;

import java.util.ArrayList;

public class Fabrica {

    private static int contId = 1;
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Cerveza> cervezas;

    public Fabrica(String nombre, String direccion) {
    	setId();
        setNombre(nombre);
        setDireccion(direccion);
        setCervezas(cervezas);
    }

	public ArrayList<Cerveza> getCervezas() {
        return this.cervezas;
    }

    public void setCervezas(ArrayList<Cerveza> cervezas) {
		this.cervezas = cervezas;
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

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void listarCervezas(){
        for (Cerveza cerveza : cervezas){
            System.out.println(cerveza.toString());
        }
    }

    public void agregarCerveza(Cerveza cerveza){
        if (!cerveza.getNombre().isEmpty())
        {
            if (!existeCervezaByNombre(cerveza.getNombre()))
                getCervezas().add(cerveza);
        }
    }

    public void quitarCerveza(int id){
        int posEncontrado = -1;
        for (Cerveza cerveza : getCervezas())
        {
            if (cerveza.getId() == id)
            {
                posEncontrado = getCervezas().indexOf(cerveza);
            }
        }
        if (posEncontrado > -1)
            getCervezas().remove(posEncontrado);
    }

    private boolean existeCervezaByNombre(String nombre){
        boolean existe = false;
        for (int i = 0; i < getCervezas().size() && !existe; i++)
        {
            if(getCervezas().get(i).getNombre().equals(nombre))
                existe = true;
        }

        return existe;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", direccion: " + direccion + ".";
    }
}
