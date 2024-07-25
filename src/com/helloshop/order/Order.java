package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.User.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
