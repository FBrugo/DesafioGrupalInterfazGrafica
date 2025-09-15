/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author caito
 */
public class CondorAndino extends Animal implements HabitatMontana {

    public CondorAndino(String nombre, double pesoKg, double velocidadMaxKmH, int energia) {
        super(nombre, pesoKg, velocidadMaxKmH, energia);
    }

    // --- Abstractos ---
    @Override
    public String sonido() {
        return getNombre() + " emite un graznido agudo.";
    }

    @Override
    public void mover(double metros) {
        if (consumir((int) (metros / 20))) {
            System.out.println(getNombre() + " planea " + metros + " metros.");
        }
    }

    @Override
    public void comer(String alimento) {
        System.out.println(getNombre() + " se alimenta de " + alimento + ".");
        recargar(15);
    }

    @Override
    public void descansar(int minutos) {
        System.out.println(getNombre() + " descansa en un risco " + minutos + " minutos.");
        recargar(minutos / 3);
    }

    // --- Hábitat ---
    public void escalarRoca(int metros) {
        System.out.println(getNombre() + " sobrevuela rocas de " + metros + " metros.");
    }

    public void buscarRefugioRocoso() {
        System.out.println(getNombre() + " descansa en una saliente rocosa.");
    }

    public void resistirFrio(int gradosBajoCero) {
        System.out.println(getNombre() + " soporta corrientes heladas de -" + gradosBajoCero + "°C.");
    }

    // --- Propio ---
    public void vigilar() {
        System.out.println(getNombre() + " vigila el valle desde gran altura.");
    }

    public void descenderEnEspiral(int metros) {
        if (consumir(10)) {
            System.out.println(getNombre() + " desciende en espiral " + metros + " metros.");
        }
    }
}

