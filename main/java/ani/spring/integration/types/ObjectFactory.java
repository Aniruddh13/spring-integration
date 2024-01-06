package ani.spring.integration.types;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
@NoArgsConstructor
public class ObjectFactory {
    public ClientDataRequest createClientDataRequest() {
        return new ClientDataRequest();
    }
    public ClientDataResponse createClientDataResponse() {
        return new ClientDataResponse();
    }
}
