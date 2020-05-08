package app;

public class Main {

	public static void main(String[] args) {

        Ingrediente ing1 = new Ingrediente("Manzana", "fruta", 2, 10);
        Ingrediente ing2 = new Ingrediente("Pera", "fruta", 5, 5);
        Ingrediente ing3 = new Ingrediente("Naranja", "fruta", 3, 20);
        Ingrediente ing4 = new Ingrediente("Uva", "fruta", 20, 3);
        Ingrediente ing5 = new Ingrediente("alcohol", "liquido", 7, 50);

   
        Receta receta1 = new Receta("Colorada", "Colombia" );
        Receta receta2 = new Receta("Bob Esponja", "Brasil");
        Receta receta3 = new Receta("Locura total", "Chile");

        receta1.agregarIng(ing1);
        receta1.agregarIng(ing2);
        receta1.agregarIng(ing3);
        receta2.agregarIng(ing1);
        receta3.agregarIng(ing1);
        receta3.agregarIng(ing5);
        receta3.agregarIng(ing2);
        receta2.agregarIng(ing3);
        receta2.quitarIngrediente(ing3.getId());
        receta2.agregarIng(ing4);

      
        Rubia rubia = new Rubia("Stela","Para acompañar con amigos", 7, 110, false, receta2);
        Roja roja = new Roja("Brahma","Para tus momentos solitarios", 8, 100, true, receta1);
        Negra negra= new Negra("Corona","Para pasar un buen rato en pareja", 10, 120, true, receta3);

      
        Fabrica fab = new Fabrica("Ambev", "Alvarado 1589");

        fab.agregarCerveza(rubia);
        fab.agregarCerveza(roja);
        fab.agregarCerveza(negra);

        fab.listarCervezas();
        fab.quitarCerveza(rubia.getId());
        fab.listarCervezas();
	}

}
