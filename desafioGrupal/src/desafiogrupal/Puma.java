/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author carlo
 */
public class Puma extends Animal implements HabitatMontana{
     public Puma(String nombre, double pesoKg, double velocidadMaxKmH, int energia) {
        super(nombre, pesoKg, velocidadMaxKmH, energia);
    }

    // Abstracto de Animal
    @Override
    public String sonido() {
        return getNombre() + " ruge fuertemente.";
    }

    @Override
    public void mover(double metros) {
        if (consumir((int) (metros / 10))) {
            System.out.println(getNombre() + " corre " + metros + " metros por la montania.");
        }
    }

    @Override
    public void comer(String alimento) {
        System.out.println(getNombre() + " come " + alimento + ".");
        recargar(20);
    }

    @Override
    public void descansar(int minutos) {
        System.out.println(getNombre() + " descansa " + minutos + " minutos.");
        recargar(minutos / 2);
    }

    // Metodos del habitat ---
    public void escalarRoca(int metros) {
        System.out.println(getNombre() + " escala rocas por " + metros + " metros.");
    }

    public void buscarRefugioRocoso() {
        System.out.println(getNombre() + " se oculta entre las rocas.");
    }

    public void resistirFrio(int gradosBajoCero) {
        System.out.println(getNombre() + " soporta el frio de -" + gradosBajoCero + "°C.");
    }

    // Propio
    public void cazar(String presa) {
        if (consumir(15)) {
            System.out.println(getNombre() + " acecha y caza a " + presa + ".");
        }
        
    }
}
