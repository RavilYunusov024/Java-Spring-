package com.example.new_Mook.Model;

import lombok.*;

import java.math.BigDecimal;

@Data

public class ResponseDTO {

    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private BigDecimal balance;
    private BigDecimal maxLimit;

}
