/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author fedee
 */

public class DesafioGrupal {
    public static void main(String[] args) {
        Puma p = new Puma("Puma", 60, 80, 55);
        CondorAndino c = new CondorAndino("Cóndor", 12, 90, 60);
        Iguana i = new Iguana("Iguana", 4, 15, 50);
        Cabra b = new Cabra("Cabra", 35, 40, 70);

        System.out.println("=== INTERACCIONES ===\n");

        System.out.println("El puma corre 120m por la cornisa buscando alimento.");
        p.mover(120);

        System.out.println("La cabra, al sentirse en peligro, intenta escapar.");
        b.saltoPreciso(2);
        b.buscarRefugioRocoso();

        System.out.println("Mientras tanto, el cóndor planea alto en el cielo.");
        c.mover(600);
        System.out.println("El mismo vigila el valle desde una gran altura.");
        c.vigilar();
        System.out.println("El ave desciende en espiral unos 300m.");
        c.descenderEnEspiral(300);

        System.out.println("\nLa pequeña iguana, al sentir miedo, decide pasar desapercibida.");
        System.out.println("La misma se camufla con el color de la roca.");
        i.camuflarse();
        System.out.println("Y se esconde en una grieta cálida.");
        i.buscarRefugioRocoso();

        
        p.resistirFrio(10);
        b.resistirFrio(10);
        c.resistirFrio(10);
        i.resistirFrio(10);

        System.out.println("\n=== ENERGÍA FINAL ===");
        System.out.println("Puma: " + p.getEnergia());
        System.out.println("Cabra: " + b.getEnergia());
        System.out.println("Cóndor: " + c.getEnergia());
        System.out.println("Iguana: " + i.getEnergia());
    }
}

    

