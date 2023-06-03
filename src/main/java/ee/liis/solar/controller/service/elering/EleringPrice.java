package ee.liis.solar.controller.service.elering;

import lombok.Data;

@Data
public class EleringPrice {

    private Long priceTimestamp;
    private Double price;
}
