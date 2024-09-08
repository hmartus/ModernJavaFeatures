package com.tup.sample.iotdevicemgmt.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table( name = "devices" )
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String type;
    private String location;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
