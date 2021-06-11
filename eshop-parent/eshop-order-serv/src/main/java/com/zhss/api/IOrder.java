package com.zhss.api;

import java.util.List;

public interface IOrder {

    List<String> queryOrderByOrderId(Long orderId);

    default void createOrder() {
        System.out.println("buy is a aphone");
    }
}
