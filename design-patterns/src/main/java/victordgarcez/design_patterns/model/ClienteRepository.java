package victordgarcez.design_patterns.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //strategy - design patterns
public interface ClienteRepository extends CrudRepository<Cliente, Long> {


}

