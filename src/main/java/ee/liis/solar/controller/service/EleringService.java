package ee.liis.solar.controller.service;

import ee.liis.solar.controller.persistance.PriceForHour;
import ee.liis.solar.controller.persistance.PriceForHourRepository;
import ee.liis.solar.controller.service.elering.EleringPrice;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EleringService {


    public List<EleringPrice> getPricesForTheNext24h() {
        // TODO - query from elering APi
        // TODO implement
        return Collections.emptyList();
    };

}
