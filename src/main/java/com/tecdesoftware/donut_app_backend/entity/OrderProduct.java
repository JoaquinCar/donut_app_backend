package com.tecdesoftware.donut_app_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_products")
public class OrderProduct {
    @EmbeddedId
    private OrderProductPK id;
    private Integer quantity;



    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order;


    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    public OrderProductPK getId() {
        return id;
    }

    public void setId(OrderProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
