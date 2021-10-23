package cool.happycoding.ws.client.rest;

import cool.happycoding.code.base.result.BaseResult;
import cool.happycoding.ws.client.proxy.CountryClient;
import cool.happycoding.ws.client.wsdl.GetCountryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author pengzhenchen 2021/10/23 10:52 上午
 */
@RestController
@RequiredArgsConstructor
public class CountryController {


    private final CountryClient countryClient;

    @GetMapping("getCountry/{country}")
    public BaseResult<GetCountryResponse> getCountry(@PathVariable String country){
        return BaseResult.success(countryClient.getCountry(country));
    }



}
