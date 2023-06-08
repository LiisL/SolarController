package ee.liis.solar.controller.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceForHourRepository extends CrudRepository<PriceForHour, Long> {

    Optional<PriceForHour> findByPriceTimestamp(Long timestamp);

}