package com.commercial.app.domain.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponseDto {

    private Long orderId;

    private Date orderDate;

    private Date completeDate;

    private String status;

    private String orderNote;

    private int totalPayment;

    private String orderAddress;

    private String phoneNumber;

    private String paymentMethod;

    private String shippingMethod;

    private UserResponseDto user;

    private VoucherResponseDto voucher;
}
