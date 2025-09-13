/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author santi
 */
public class Cabra extends Animal implements HabitatMontana{
    
    public Cabra(String nombre, double pesoKg, double velocidadMaxKmH, int energia) {
        super(nombre, pesoKg, velocidadMaxKmH, energia);
    }

    // --- Abstractos ---
    @Override
    public String sonido() {
        return getNombre() + " bala con fuerza.";
    }

    @Override
    public void mover(double metros) {
        if (consumir((int) (metros / 12))) {
            System.out.println(getNombre() + " escala " + metros + " metros por la montaña.");
        }
    }

    @Override
    public void comer(String alimento) {
        System.out.println(getNombre() + " mastica " + alimento + ".");
        recargar(12);
    }

    @Override
    public void descansar(int minutos) {
        System.out.println(getNombre() + " descansa " + minutos + " minutos en la sombra.");
        recargar(minutos / 3);
    }

    // --- Hábitat ---
    public void escalarRoca(int metros) {
        System.out.println(getNombre() + " trepa una roca de " + metros + " metros.");
    }

    public void buscarRefugioRocoso() {
        System.out.println(getNombre() + " se refugia en una cornisa estrecha.");
    }

    public void resistirFrio(int gradosBajoCero) {
        System.out.println(getNombre() + " resiste el frío con su pelaje a -" + gradosBajoCero + "°C.");
    }

    // --- Propio ---
    public void saltoPreciso(int metros) {
        if (consumir(8)) {
            System.out.println(getNombre() + " salta " + metros + " metros para escapar.");
        }
    }

}
