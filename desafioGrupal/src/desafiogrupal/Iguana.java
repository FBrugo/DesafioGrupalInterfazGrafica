/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author rodri
 */
public class Iguana extends Animal implements HabitatMontana {
    
    public Iguana(String nombre, double pesoKg, double velocidadMaxKmH, int energia) {
        super(nombre, pesoKg, velocidadMaxKmH, energia);
    }

    // --- Abstractos ---
    @Override
    public String sonido() {
        return getNombre() + " hace un leve siseo.";
    }

    @Override
    public void mover(double metros) {
        if (consumir((int) (metros / 15))) {
            System.out.println(getNombre() + " se desplaza " + metros + " metros entre rocas.");
        }
    }

    @Override
    public void comer(String alimento) {
        System.out.println(getNombre() + " mastica " + alimento + ".");
        recargar(10);
    }

    @Override
    public void descansar(int minutos) {
        System.out.println(getNombre() + " toma sol " + minutos + " minutos.");
        recargar(minutos / 4);
    }

    // --- Hábitat ---
    public void escalarRoca(int metros) {
        System.out.println(getNombre() + " trepa rocas de " + metros + " metros.");
    }

    public void buscarRefugioRocoso() {
        System.out.println(getNombre() + " se esconde en una grieta cálida.");
    }

    public void resistirFrio(int gradosBajoCero) {
        System.out.println(getNombre() + " busca calor para resistir -" + gradosBajoCero + "°C.");
    }

    // --- Propio ---
    public void camuflarse() {
        System.out.println(getNombre() + " se camufla con el color de las piedras.");
    }
}