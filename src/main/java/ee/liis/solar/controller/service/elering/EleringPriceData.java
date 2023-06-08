package ee.liis.solar.controller.service.elering;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class EleringPriceData {

    private List<EleringPrice> ee;
    private List<EleringPrice> fi;
    private List<EleringPrice> lt;
}
