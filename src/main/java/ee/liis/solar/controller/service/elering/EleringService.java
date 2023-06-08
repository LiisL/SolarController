package ee.liis.solar.controller.service.elering;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EleringService {
    public static final String NPS_API_URL = "https://dashboard.elering.ee/api/nps/price";
    private final RestTemplate restTemplate = new RestTemplate();

    public List<EleringPrice> getPricesForTheNext24h() {
        EleringPriceResponse result = restTemplate.getForObject(NPS_API_URL, EleringPriceResponse.class);
        System.out.println("Got response from elering API: " + result);
        return result.getData().getEe();
    }

}
