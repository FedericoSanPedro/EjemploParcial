package app;

public class Negra extends TipoCerveza{

    private  final float valorPorcComp = 1.20f;

    public Negra(String nombre, String descripcion, float abv, float precio, boolean gluten, Receta receta) {
        super(nombre, descripcion, abv, precio, gluten, receta);
        super.setPorcComp(this.valorPorcComp);
    }

    public String toString() {
        return  "Negra: " + super.toString();
    }

    @Override
    public float calcularCostoFab() {
        return super.calcularCostoFab() * this.valorPorcComp;
    }
}
