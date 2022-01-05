package es.davidabellannavarro.ejercicio1;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.jetbrains.annotations.NotNull;

/**
 * The type Personaje.
 */
public class Personaje {

    /**
     * The Id.
     */
    public String id;
    //Atributos
    private String nombre;
    private String clase;
    private int vida_max;
    private int energia_max;
    private int vida_actual;
    private int energia_actual;
    private int monedas;

    private boolean npc;
    private boolean hostil;

    private int numequipo = 0;
    private int numhab = 0;

    //Metodos

    /**
     * Instantiates a new Personaje.
     */
//Constructor por defecto
    public Personaje() {
        nombre = "ninguno";
        clase = "ninguna";
        vida_max = 0;
        energia_max = 0;
        vida_actual = 0;
        energia_actual = 0;
        monedas = 0;

        npc = false;
        hostil = false;

    }

    /**
     * Instantiates a new Personaje.
     *
     * @param nombre         the nombre
     * @param clase          the clase
     * @param vida_max       the vida max
     * @param energia_max    the energia max
     * @param vida_actual    the vida actual
     * @param energia_actual the energia actual
     * @param monedas        the monedas
     * @param habilidades    the habilidades
     * @param equipo         the equipo
     * @param npc            the npc
     * @param hostil         the hostil
     */
//Constructor sobrecargado
    public Personaje(String nombre, String clase, int vida_max, int energia_max, int vida_actual, int energia_actual,
                     int monedas, Habilidad habilidades[], Item equipo[], boolean npc, boolean hostil) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida_max = vida_max;
        this.energia_max = energia_max;
        this.vida_actual = vida_actual;
        this.energia_actual = energia_actual;
        this.monedas = monedas;

        this.npc = npc;
        this.hostil = hostil;
    }

    /**
     * Instantiates a new Personaje.
     *
     * @param personaje the personaje
     */
//Constructor de copia
    public Personaje(@NotNull Personaje personaje) {
        this.nombre = personaje.nombre;
        this.clase = personaje.clase;
        this.vida_max = personaje.vida_max;
        this.energia_max = personaje.energia_max;
        this.vida_actual = personaje.vida_actual;
        this.energia_actual = personaje.energia_actual;
        this.monedas = personaje.monedas;
        this.npc = personaje.npc;
        this.hostil = personaje.hostil;
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
     * Gets clase.
     *
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * Sets clase.
     *
     * @param clase the clase
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Gets vida max.
     *
     * @return the vida max
     */
    public int getVida_max() {
        return vida_max;
    }

    /**
     * Sets vida max.
     *
     * @param vida_max the vida max
     */
    public void setVida_max(int vida_max) {
        this.vida_max = vida_max;
    }

    /**
     * Gets energia max.
     *
     * @return the energia max
     */
    public int getEnergia_max() {
        return energia_max;
    }

    /**
     * Sets energia max.
     *
     * @param energia_max the energia max
     */
    public void setEnergia_max(int energia_max) {
        this.energia_max = energia_max;
    }

    /**
     * Gets vida actual.
     *
     * @return the vida actual
     */
    public int getVida_actual() {
        return vida_actual;
    }

    /**
     * Sets vida actual.
     *
     * @param vida_actual the vida actual
     */
    public void setVida_actual(int vida_actual) {
        this.vida_actual = vida_actual;
    }

    /**
     * Gets energia actual.
     *
     * @return the energia actual
     */
    public int getEnergia_actual() {
        return energia_actual;
    }

    /**
     * Sets energia actual.
     *
     * @param energia_actual the energia actual
     */
    public void setEnergia_actual(int energia_actual) {
        this.energia_actual = energia_actual;
    }

    /**
     * Gets monedas.
     *
     * @return the monedas
     */
    public int getMonedas() {
        return monedas;
    }

    /**
     * Sets monedas.
     *
     * @param monedas the monedas
     */
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    /**
     * Is npc boolean.
     *
     * @return the boolean
     */
    public boolean isNpc() {
        return npc;
    }

    /**
     * Sets npc.
     *
     * @param npc the npc
     */
    public void setNpc(boolean npc) {
        this.npc = npc;
    }

    /**
     * Is hostil boolean.
     *
     * @return the boolean
     */
    public boolean isHostil() {
        return hostil;
    }

    /**
     * Sets hostil.
     *
     * @param hostil the hostil
     */
    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    //Metodo para comparar

    /**
     * Es igual boolean.
     *
     * @param personaje the personaje
     * @return the boolean
     */
    public boolean esIgual(@NotNull Personaje personaje) {
        boolean salida = false;

        if (this.nombre.equals(personaje.nombre)) {
            salida = true;
        }

        return salida;
    }

    @Override
    public boolean equals(Object per_entrada) {
        boolean salida = false;

        Personaje personaje = (Personaje) per_entrada;

        if (this.nombre.equals(personaje.nombre)) {
            salida = true;
        }

        return salida;
    }

    //Metodo para mostrar

    /**
     * Visualizar.
     */
    public void visualizar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Vida_max: " + vida_max);
        System.out.println("Energia_max: " + energia_max);
        System.out.println("Vida_actual: " + vida_actual);
        System.out.println("Energia_actual: " + energia_actual);
        System.out.println("Monedas: " + monedas);

        System.out.println();
        System.out.print("NPC: ");

        if (npc == true) {
            System.out.print("si");
        } else {
            System.out.print("no");
        }

        System.out.println();
        System.out.print("Hostil: ");

        if (hostil == true) {
            System.out.print("si");
        } else {
            System.out.print("no");
        }

        System.out.println();
    }

    /**
     * Visualizar basico.
     */
    public void visualizarBasico() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Vida_max: " + vida_max);
        System.out.println("Energia_max: " + energia_max);
        System.out.println("Vida_actual: " + vida_actual);
        System.out.println("Energia_actual: " + energia_actual);
        System.out.println("Monedas: " + monedas);
		/*
		for(int i = 0; i < this.habilidades.length; i++) {
			if(habilidades[i]!=null) {
				System.out.println();
				System.out.println("habilidad"+(i));
				habilidades[i].visualizar();
			}
		}
		System.out.println();
		
		for(int i = 0; i < this.equipo.length; i++) {
			if(equipo[i]!=null) {
				System.out.println();
				System.out.println("equipo"+(i));
				equipo[i].visualizarBasico();
			}
		}
		*/
        System.out.println();
        System.out.print("NPC: ");

        if (npc == true) {
            System.out.print("si");
        } else {
            System.out.print("no");
        }

        System.out.println();
        System.out.print("Hostil: ");

        if (hostil == true) {
            System.out.print("si");
        } else {
            System.out.print("no");
        }

        System.out.println();
    }

    /**
     * Tiene habilidad boolean.
     *
     * @param habilidad the habilidad
     * @return the boolean
     */
//Metodo tiene
    public boolean tiene_habilidad(Habilidad habilidad) {
        boolean salida = false;
        //No esta implementado, hay que implementar
        return salida;
    }

    /**
     * Tiene item boolean.
     *
     * @param equipo the equipo
     * @return the boolean
     */
    public boolean tiene_item(Item equipo) {
        boolean salida = false;
        //No esta implementado, hay que implementar
        return salida;
    }

    /**
     * Add equipo boolean.
     *
     * @param equipo the equipo
     * @return the boolean
     */
    public boolean addEquipo(Item equipo) {
        boolean salida = false;
        boolean encontrado = false;
        //No esta implementado, hay que implementar
        return salida;
    }

    /**
     * Eliminar equipo boolean.
     *
     * @param equipo the equipo
     * @return the boolean
     */
    public boolean eliminarEquipo(Item equipo) {
        boolean salida = false;
        int pos = 0;
        boolean encontrado = false;

        Item aux[] = new Item[5];
        int cont = 0;
        //No esta implementado, hay que implementar
        return salida;
    }

    /**
     * Add habilidad boolean.
     *
     * @param habilidad the habilidad
     * @return the boolean
     */
    public boolean addHabilidad(Habilidad habilidad) {
        boolean salida = false;
        boolean encontrado = false;
        //No esta implementado, hay que implementar
        return salida;
    }

    /**
     * Eliminar habilidad boolean.
     *
     * @param habilidad the habilidad
     * @return the boolean
     */
    public boolean eliminarHabilidad(Habilidad habilidad) {
        boolean salida = false;
        boolean encontrado = false;
        int pos = 0;
        //No esta implementado, hay que implementar
        return salida;
    }

    @Override
    public String toString() {
        String cad;
        String hab = "";
        boolean primero = false;

        return this.nombre + ";" + this.clase + ";" + this.vida_max + ";" + this.energia_max + ";" + this.vida_actual + ";"
                + this.energia_actual + ";" + this.monedas + ";" + this.npc + ";" + this.hostil + ";" + hab;
    }
}