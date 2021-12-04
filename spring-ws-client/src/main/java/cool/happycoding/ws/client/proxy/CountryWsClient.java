package cool.happycoding.ws.client.proxy;

import cool.happycoding.code.ws.client.annotation.WsClient;
import cool.happycoding.ws.client.wsdl.GetCountryRequest;
import cool.happycoding.ws.client.wsdl.GetCountryResponse;

/**
 * description
 *
 * @author pengzhenchen 2021/10/23 3:16 下午
 */
@WsClient(url = "http://localhost:8080/ws", action = "http://happycoding.cool/ws/server/schema/GetCountyRequest", pathToPackages = "cool.happycoding.ws.client.wsdl")
public interface CountryWsClient {

    /**
     * 根据名称获取国家
     * @param request country name
     * @return response
     */
    GetCountryResponse getCountry(GetCountryRequest request);
}
