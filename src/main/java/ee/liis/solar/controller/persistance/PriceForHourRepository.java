package ee.liis.solar.controller.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceForHourRepository extends CrudRepository<PriceForHour, Long> {

}