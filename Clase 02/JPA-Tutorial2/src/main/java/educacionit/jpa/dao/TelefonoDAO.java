package educacionit.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import educacionit.jpa.entidades.Telefono;

@Repository
public interface TelefonoDAO extends CrudRepository<Telefono,Integer> {

}
