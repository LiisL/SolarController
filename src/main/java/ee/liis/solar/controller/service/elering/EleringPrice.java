package ee.liis.solar.controller.service.elering;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EleringPrice {

    private Long timestamp;
    private Double price;
}
