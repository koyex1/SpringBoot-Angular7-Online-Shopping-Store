package me.zhulin.shopapi.service;

import me.zhulin.shopapi.entity.ProductInOrder;
import me.zhulin.shopapi.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    ProductInOrder update(String itemId, Integer quantity, User user);
}
