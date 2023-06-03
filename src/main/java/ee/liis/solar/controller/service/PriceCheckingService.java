package ee.liis.solar.controller.service;

import ee.liis.solar.controller.persistance.PriceForHour;
import ee.liis.solar.controller.persistance.PriceForHourRepository;
import ee.liis.solar.controller.service.elering.EleringPrice;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceCheckingService {

    private final PriceForHourRepository priceForHourRepository;
    private final EleringService eleringService;


    @Scheduled(fixedDelay = 30_000)
    public void checkPrices() {
        System.out.println("Starting to check prices");
        List<EleringPrice> pricesFromElering = eleringService.getPricesForTheNext24h();

        for (EleringPrice eleringPrice: pricesFromElering) {
            boolean priceNotInDb = false;
            // TODO calculate priceNotInDb for real
            if (priceNotInDb) {
                PriceForHour price =  new PriceForHour();
                price.setPriceTimestamp(eleringPrice.getPriceTimestamp());
                price.setPrice(eleringPrice.getPrice());
                priceForHourRepository.save(price);
             }
        }

        System.out.println("Finished checking for prices");
    }

    @Scheduled(fixedDelay = 300_000)
    public void checkCurrentPrice() {
        System.out.println("Starting to check current price");
        Iterable<PriceForHour> allPrices = priceForHourRepository.findAll();
        System.out.println(allPrices);

        // TODO - ei peaks olema null, pean leidma listist
        PriceForHour priceRightNow = null;
        System.out.println(priceRightNow);

        // TODO saad sinnna sonoffi kas on või off

        System.out.println("Finished checking current price");
    }

}
