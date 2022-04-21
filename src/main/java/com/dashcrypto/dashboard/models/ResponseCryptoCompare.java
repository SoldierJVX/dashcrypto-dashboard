package com.dashcrypto.dashboard.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ResponseCryptoCompare {

    @JsonProperty("Response")
    private String response;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("HasWarning")
    private String hasWarning;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Data")
    private Map<String,Coin> coinMap;

}
