package com.everythingchess.shop.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "`order`")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "order_status")
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public void addOrderItem(OrderItem orderItem) {
        if (orderItems == null) {
            orderItems = new ArrayList<>();
        }

        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

}
