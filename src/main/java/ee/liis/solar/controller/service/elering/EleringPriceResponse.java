package ee.liis.solar.controller.service.elering;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EleringPriceResponse {

    private boolean success;
    private EleringPriceData data;
}
