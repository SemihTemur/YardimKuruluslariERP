package com.semih.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FamilyRequest {

    private String familyName;

    private int familyMemberCount;

    private String phoneNumber;

    private AddressRequest address;
}
