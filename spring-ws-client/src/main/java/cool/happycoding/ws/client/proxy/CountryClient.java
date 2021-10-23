package cool.happycoding.ws.client.proxy;

import cool.happycoding.ws.client.wsdl.GetCountryRequest;
import cool.happycoding.ws.client.wsdl.GetCountryResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * description
 *
 * @author pengzhenchen 2021/10/23 10:53 上午
 */
@Slf4j
public class CountryClient extends WebServiceGatewaySupport {

    private static final String URI = "http://localhost:8080/ws";
    private static final String SOAP_ACTION = "http://happycoding.cool/ws/server/schema/GetCountyRequest";

    public GetCountryResponse getCountry(String country){
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);
        log.info("Requesting location for " + country);
        return (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(SOAP_ACTION));

    }

}
