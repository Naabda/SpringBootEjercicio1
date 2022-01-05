package es.davidabellannavarro.ejercicio1;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Ejercicio 1 application.
 */
@SpringBootApplication
public class Ejercicio1Application implements CommandLineRunner {

    @Autowired
    private PersonajeRepository pRepo;
    @Autowired
    private HabilidadRepository hRepo;
    @Autowired
    private ItemRepository iRepo;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Ejercicio1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        pRepo.deleteAll();
        hRepo.deleteAll();
        iRepo.deleteAll();

        Habilidad confundus = new Habilidad( "Confundus", 100, 200, "Magia");
        Habilidad maximaVida = new Habilidad("Vida Maxima", 1000, 700, "Magia");
        Habilidad golpeHierro = new Habilidad("Golpe de Hierro", 200, 50, "Guerrero");
        Habilidad azotePatern = new Habilidad("Azote Paterno", 500, 100, "Guerrero");
        Habilidad grito = new Habilidad("Gritos Chirriante", 300, 150, "Orco");
        Habilidad fetido = new Habilidad("Ataque Fetido", 150, 50, "Orco");
        hRepo.save(confundus);
        hRepo.save(maximaVida);
        hRepo.save(golpeHierro);
        hRepo.save(azotePatern);
        hRepo.save(grito);
        hRepo.save(fetido);

        Habilidad[] habilidadesMago = {confundus, maximaVida};
        Habilidad[] habilidadesGuerrero = {golpeHierro, azotePatern};
        Habilidad[] habilidadesOrco = {grito, fetido};

        Item vara = new Item("Vara del poder", 100, "Magia");
        Item bola = new Item("Bola cristal", 600, "Magia");
        Item espada = new Item("Espada de Hierro", 120, "Guerrero");
        Item escudoM = new Item("Escudo Magno", 800, "Guerrero");
        Item arco = new Item("Arco madera", 150, "Orco");
        Item escudoA = new Item("Escudo Apestosa", 625, "Orco");
        iRepo.save(vara);
        iRepo.save(bola);
        iRepo.save(espada);
        iRepo.save(escudoM);
        iRepo.save(arco);
        iRepo.save(escudoA);

        Item[] equipoMago = {vara, bola};
        Item[] equipoGuerrero = {espada, escudoM};
        Item[] equipoOrco = {arco, escudoA};

        Personaje mago = new Personaje("Cornelius", "Mago", 1000, 2000, 750, 1000, 2390, habilidadesMago, equipoMago, false, false);
        Personaje guerrero = new Personaje("Excalibur", "Guerrero", 1500, 1000, 1000, 650, 1590, habilidadesGuerrero, equipoGuerrero, false, false);
        Personaje orco = new Personaje("Grimly", "Orco", 2000, 800, 1750, 750, 5000, habilidadesOrco, equipoOrco, true, true);

        pRepo.save(mago);
        pRepo.save(guerrero);
        pRepo.save(orco);

        System.out.println("Personajes creados: ");
        System.out.println(mago.toString());
        System.out.println(guerrero.toString());
        System.out.println(orco.toString());
        System.out.println("--------------------------------------");

        System.out.println("Buscamos a  Grimly: ");
        Personaje encontrado = pRepo.findByNombre("Grimly");
        System.out.println(encontrado.toString());
        System.out.println("--------------------------------------");

        System.out.println("Buscamos los items de tipo Guerrero: ");
        for(Item i:  iRepo.findItemsByTipo("Guerrero")){
            System.out.println(i.toString());
        }
        System.out.println("--------------------------------------");


        System.out.println("Buscamos las habilidades de tipo Mago: ");
        for(Habilidad h: hRepo.findHabilidadsByTipo("Magia")){
            System.out.println(h.toString());
        }
        System.out.println("--------------------------------------");

    }
}
