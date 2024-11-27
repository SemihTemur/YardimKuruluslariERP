package com.semih.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CharityOrganizationRequest {

    private String organizationName;

    private String phoneNumber;

    private String email;

    private AddressRequest address;
}