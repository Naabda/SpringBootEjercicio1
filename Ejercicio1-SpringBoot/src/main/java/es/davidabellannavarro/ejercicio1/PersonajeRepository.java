package es.davidabellannavarro.ejercicio1;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

/**
 * The interface Personaje repository.
 */
@RepositoryRestResource(collectionResourceRel = "personaje", path = "personaje")
public interface PersonajeRepository extends MongoRepository<Personaje, String> {

    /**
     * Find by nombre personaje.
     *
     * @param nombre the nombre
     * @return the personaje
     */
    public Personaje findByNombre (String nombre);

    /**
     * Find personajes by clase list.
     *
     * @param clase the clase
     * @return the list
     */
    public List<Personaje> findPersonajesByClase (String clase);
    //public List<Personaje> findPersonajesByVida_max (int vida_max);
    //public List<Personaje> findPersonajesByEnergia_max (int energia_max);
    //public List<Personaje> findPersonajesByMonedas (int monedas);
    //public List<Personaje> findPersonajesByNumequipo (int numequipo);

}