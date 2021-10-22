package cool.happycoding.ws.server.endpoint;

import cool.happycoding.ws.server.repository.CountryRepository;
import cool.happycoding.ws.server.schema.GetCountryRequest;
import cool.happycoding.ws.server.schema.GetCountryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static cool.happycoding.ws.server.common.Constants.TARGET_NAMESPACE;

/**
 * description
 *
 * @author pengzhenchen 2021/10/22 9:56 下午
 */
@Endpoint
@RequiredArgsConstructor
public class CountryEndpoint {

    private final CountryRepository countryRepository;

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }
}
