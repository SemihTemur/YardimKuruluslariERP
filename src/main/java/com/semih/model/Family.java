package com.semih.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "family")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Family extends BaseEntity {

    @Column(unique = true,nullable = false)
    private String familyName;

    private int familyMemberCount;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "family",cascade = {CascadeType.REMOVE,CascadeType.MERGE})
    private List<CashAid> cashAid;

    @OneToMany(mappedBy = "family",cascade = {CascadeType.REMOVE,CascadeType.MERGE})
    private List<InKindAid> inKindAid;

}
