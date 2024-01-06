package ani.spring.integration.types;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "clientDataResponse")
@Getter
@Setter
public class ClientDataResponse {
    @XmlAttribute(required = true)
    protected BigDecimal amount;
    @XmlAttribute(required = true)
    protected String confirmationId;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
}
