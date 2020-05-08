package app;

public class Roja extends TipoCerveza{

    private  final float valorPorcComp = 1.15f;

    public Roja(String nombre,String descripcion, float abv, float precio, boolean gluten, Receta receta) {
        super(nombre, descripcion, abv, precio, gluten, receta);
        super.setPorcComp(this.valorPorcComp);
    }

    @Override
    public String toString() {
        return  "Roja: " + super.toString();
    }

    @Override
    public float calcularCostoFab() {
        return super.calcularCostoFab() * this.valorPorcComp;
    }
}