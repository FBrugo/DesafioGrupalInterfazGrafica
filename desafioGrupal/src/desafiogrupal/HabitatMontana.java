/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author fedee
 */
public interface HabitatMontana {
    void escalarRoca(int metros);
    void buscarRefugioRocoso();
    void resistirFrio(int gradosBajoCero);

    default String tipoTerreno() { return "Rocoso, con pendientes y aire fino"; }
}
