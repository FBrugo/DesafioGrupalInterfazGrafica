/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiogrupal;

/**
 *
 * @author fedee
 */


public abstract class Animal {
    private String nombre;
    private double pesoKg;
    private double velocidadMaxKmH;
    private int energia;

    protected Animal(String nombre, double pesoKg, double velocidadMaxKmH, int energia) {
        setNombre(nombre);
        setPesoKg(pesoKg);
        setVelocidadMaxKmH(velocidadMaxKmH);
        setEnergia(energia);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre.trim();
    }

    public double getPesoKg() { return pesoKg; }
    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0) throw new IllegalArgumentException("Peso debe ser > 0");
        this.pesoKg = pesoKg;
    }

    public double getVelocidadMaxKmH() { return velocidadMaxKmH; }
    public void setVelocidadMaxKmH(double velocidadMaxKmH) {
        if (velocidadMaxKmH < 0) throw new IllegalArgumentException("Velocidad no puede ser negativa");
        this.velocidadMaxKmH = velocidadMaxKmH;
    }

    public int getEnergia() { return energia; }
    public void setEnergia(int energia) {
        if (energia < 0) energia = 0;
        if (energia > 100) energia = 100;
        this.energia = energia;
    }

    
    protected boolean consumir(int costo) {
        if (energia >= costo) { setEnergia(energia - costo); return true; }
        System.out.println("⚠️ " + nombre + " sin energía (" + energia + "/" + costo + ").");
        return false;
    }
    protected void recargar(int delta) { setEnergia(energia + delta); }

    
    public abstract String sonido();
    public abstract void mover(double metros);
    public abstract void comer(String alimento);
    public abstract void descansar(int minutos);
}
