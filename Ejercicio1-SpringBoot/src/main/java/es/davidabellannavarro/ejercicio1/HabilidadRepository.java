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
 * The interface Habilidad repository.
 */
@RepositoryRestResource(collectionResourceRel = "habilidad", path = "habilidad")
public interface HabilidadRepository extends MongoRepository<Habilidad, String> {
    /**
     * Find by nombre habilidad.
     *
     * @param nombre the nombre
     * @return the habilidad
     */
    public Habilidad findByNombre (String nombre);

    /**
     * Find habilidads by tipo list.
     *
     * @param tipo the tipo
     * @return the list
     */
//public List<Habilidad> findHabilidadsByVida (int vida);
    //public List<Habilidad> findHabilidadsByEnergia (int energia);
    public  List<Habilidad> findHabilidadsByTipo (String tipo);

}