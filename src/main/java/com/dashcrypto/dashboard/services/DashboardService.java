package com.dashcrypto.dashboard.services;

import com.dashcrypto.dashboard.models.ResponseCryptoCompare;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DashboardService {

    private final String API_KEY_CRYPTO_COMPARE = "2dae40a2431d5394b68921ddbaaedcabfb330e991fad3de56b9c8fb66adff73e";
    private final String API_URL_CRYPTO_COMPARE = "https://min-api.cryptocompare.com/data";

    private final String PATH_COIN_LIST = "/blockchain/list";

    private final RestTemplate restTemplate;

    public DashboardService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> getListCryptos() {
        try {
            ResponseCryptoCompare responseCryptoCompare = restTemplate.getForObject(
                    API_URL_CRYPTO_COMPARE +
                            PATH_COIN_LIST +
                            "?api_key=" +
                            API_KEY_CRYPTO_COMPARE,
                    ResponseCryptoCompare.class);
            return new ArrayList(responseCryptoCompare.getCoinMap().keySet());
        } catch (RestClientException e) {
            log.error("Error getting list cryptos", e);
            throw new HttpServerErrorException(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
}
