package app;

import java.util.ArrayList;

public class Receta {

    private static int contId = 1;
    private int id;
    private String nombre;
    private String pais;
    private ArrayList<Ingrediente> ingredientes;

    public Receta(String nombre, String pais) {
        setId();
        setNombre(nombre);
        setPais(pais);
        setIngredientes(ingredientes);
    }

    public Receta() {
    	setIngredientes(ingredientes);
    	}

	public void agregarIng(Ingrediente ingrediente) {
        if (ingrediente != null)
            ingredientes.add(ingrediente);
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
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

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id + ", Pais de origen: " + pais + ", cantidad de ingredientes: " + ingredientes + "."; 
    }

    public void quitarIngrediente(int id){
        int posEncontrado = -1;
        for (Ingrediente ing : getIngredientes())
        {
            if (ing.getId() == id)
            {
                posEncontrado = getIngredientes().indexOf(ing);
            }
        }
        if (posEncontrado > -1)
            getIngredientes().remove(posEncontrado);
    }

    public float CostoIngs() {
        float total = 0;
        if (getIngredientes() != null){
            for (Ingrediente ing : getIngredientes())
            {
                total += ing.getCant() * ing.getPrecio();
            }
        }
        return  total;
    }
}
