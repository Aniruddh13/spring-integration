package ani.spring.integration.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class OrderConfirmation {

    private String confirmationId;
    private float amount;
    private Date orderDate;

}
