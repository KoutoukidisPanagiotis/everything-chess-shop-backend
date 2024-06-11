package com.everythingchess.shop.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "role")
@Data
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "role_name")
    private String roleName;

    @Override
    public String getAuthority() {
        return "ROLE_" + roleName;
    }
}
