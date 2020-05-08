package app;

public abstract class TipoCerveza extends Cerveza{
	
	private boolean gluten;
	private Receta receta;
	private float porcComp;
	
	public TipoCerveza(String nombre, String descripcion, float abv, float precio, boolean gluten, Receta receta) {
		super(nombre, descripcion, abv, precio);
		setGluten(gluten);
		setReceta(receta);
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	public Receta getReceta() {
		return receta;
	}

    private void setReceta(Receta receta){

        this.receta = receta != null ? receta : new Receta();
    }

	public float getPorcComp() {
		return porcComp;
	}

	public void setPorcComp(float porcComp) {
		this.porcComp = porcComp;
	}


    public void fabricarConSinRec(Receta receta, boolean gluten){
        setGluten(gluten);
        setReceta(receta);
    }

    public float calcularCostoFab(){
        float total= 0;
        total = getReceta().CostoIngs();
        if(isGluten())
            total += total * 0.02;
        return total;
    }

    @Override
    public String toString() {

        return super.toString() + "Gluten: " + gluten + ", receta: " + receta + ", el costo de su fabricacion: $" + calcularCostoFab() + ".";
    }
	
}
