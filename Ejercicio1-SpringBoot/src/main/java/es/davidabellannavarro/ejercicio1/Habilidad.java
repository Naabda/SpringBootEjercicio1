package es.davidabellannavarro.ejercicio1;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.jetbrains.annotations.NotNull;

/**
 * The type Habilidad.
 */
public class Habilidad {

    /**
     * The Id.
     */
    public String id;
    //Atributos
    private String nombre;
    private int vida;
    private int energia;
    private String tipo;

    //Metodos

    /**
     * Instantiates a new Habilidad.
     */
//Constructor por defecto
    public Habilidad() {
        nombre = "ninguno";
        vida = 0;
        energia = 0;
        tipo = "ninguno";
    }

    /**
     * Instantiates a new Habilidad.
     *
     * @param nombre  the nombre
     * @param vida    the vida
     * @param energia the energia
     * @param tipo    the tipo
     */
//Constructor sobrecargado
    public Habilidad(String nombre, int vida, int energia, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
        this.tipo = tipo;
    }

    /**
     * Instantiates a new Habilidad.
     *
     * @param habilidad the habilidad
     */
//Constructor de copia
    public Habilidad(@NotNull Habilidad habilidad) {
        this.nombre = habilidad.nombre;
        this.vida = habilidad.vida;
        this.energia = habilidad.energia;
        this.tipo = habilidad.tipo;
    }

    //gets y sets

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets vida.
     *
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Sets vida.
     *
     * @param vida the vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Gets energia.
     *
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * Sets energia.
     *
     * @param energia the energia
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * Gets tipo.
     *
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets tipo.
     *
     * @param tipo the tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Metodo comparar

    /**
     * Es igual boolean.
     *
     * @param habilidad the habilidad
     * @return the boolean
     */
    public boolean esIgual(Habilidad habilidad) {
        boolean salida = false;

        if (this.nombre.equals(habilidad.nombre)) {
            salida = true;
        }

        return salida;
    }

    @Override
    public boolean equals(Object habilidad_entrada) {
        boolean salida = false;

        Habilidad habilidad = (Habilidad) habilidad_entrada;
        if (this.nombre.equals(habilidad.nombre)) {
            salida = true;
        }

        return salida;
    }

    /**
     * Visualizar basico.
     */
//Metodo para mostrar
    public void visualizarBasico() {
        System.out.println("---------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Tipo: " + tipo);
        System.out.println("---------------------------");
    }

    /**
     * Visualizar.
     */
    public void visualizar() {
        System.out.println("---------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Tipo: " + tipo);
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return this.nombre + ";" + this.vida + ";" + this.energia + ";" + this.tipo + ";";
    }
}