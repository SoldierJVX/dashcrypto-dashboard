package com.dashcrypto.dashboard.models;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Coin {
    private BigInteger id;

    private String symbol;

    private BigInteger number;

    private String partner_symbol;

    private BigInteger data_avaliable_from;
}
