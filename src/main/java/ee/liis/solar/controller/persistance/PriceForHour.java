package ee.liis.solar.controller.persistance;

import jakarta.persistence.*;
import lombok.Data;

@Data //It generates the getter methods for all the fields. It generates the setter methods for all the non-final fields. It generates the toString() method implementation.
@Table(name = "prices") //enter sql table name. allows you to specify the details of the table that will be used to persist the entity in the database.
@Entity
public class PriceForHour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long priceTimestamp;
    private Double price;

}
