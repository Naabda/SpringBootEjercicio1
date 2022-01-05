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
 * The interface Item repository.
 */
@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemRepository extends MongoRepository<Item, String> {

    /**
     * Find by nombre item.
     *
     * @param nombre the nombre
     * @return the item
     */
    public Item findByNombre (String nombre);

    /**
     * Find items by tipo list.
     *
     * @param tipo the tipo
     * @return the list
     */
//public List<Item> findItemsByVida (int vida);
    public List<Item> findItemsByTipo (String tipo);

}