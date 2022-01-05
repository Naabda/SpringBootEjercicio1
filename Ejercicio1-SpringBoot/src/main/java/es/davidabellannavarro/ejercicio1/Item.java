package es.davidabellannavarro.ejercicio1;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.jetbrains.annotations.NotNull;

/**
 * The type Item.
 */
public class Item {

    /**
     * The Id.
     */
    public String id;
    //Atributos
    private String nombre;
    private int vida;
    private String tipo;

    //Metodos

    /**
     * Instantiates a new Item.
     */
//Constructor por defecto
    public Item() {
        nombre = "ninguno";
        vida = 0;
        tipo = "ninguno";
    }

    /**
     * Instantiates a new Item.
     *
     * @param nombre the nombre
     * @param vida   the vida
     * @param tipo   the tipo
     */
//Constructor sobrecargado
    public Item(String nombre, int vida, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
    }

    /**
     * Instantiates a new Item.
     *
     * @param item the item
     */
//Constructor de copia
    public Item(@NotNull Item item) {
        this.nombre = item.nombre;
        this.vida = item.vida;
        this.tipo = item.tipo;
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
     * @param item the item
     * @return the boolean
     */
    public boolean esIgual(@NotNull Item item) {
        boolean salida = false;

        if (this.nombre.equals(item.nombre)) {
            salida = true;
        }

        return salida;
    }

    @Override
    public boolean equals(Object habilidad_entrada) {
        boolean salida = false;

        Item item = (Item) habilidad_entrada;
        if (this.nombre.equals(item.nombre)) {
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
        System.out.println("Tipo: " + tipo);
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return this.nombre + ";" + this.vida + ";" + this.tipo + ";";
    }
}