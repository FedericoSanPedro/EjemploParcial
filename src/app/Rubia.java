package app;

public class Rubia extends TipoCerveza{

    private  final float valorPorcComp = 1.10f;

    public Rubia(String nombre, String descripcion, float abv, float precio, boolean gluten, Receta receta) {
        super(nombre, descripcion, abv, precio, gluten, receta);
        super.setPorcComp(this.valorPorcComp);
    }

    public String toString() {
        return  "Rubia: " + super.toString();
    }

    @Override
    public float calcularCostoFab() {
        return super.calcularCostoFab() * this.valorPorcComp;
    }
}

