package ani.spring.integration.types;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "clientDataRequest")
@Getter
@Setter
public class ClientDataRequest {
    @XmlAttribute(required = true)
    protected String clientId;
    @XmlAttribute(required = true)
    protected String productId;
    @XmlAttribute(required = true)
    protected BigInteger quantity;
}
