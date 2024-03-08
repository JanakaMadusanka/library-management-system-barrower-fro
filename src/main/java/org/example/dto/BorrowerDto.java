package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerDto {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String dob;
    private String contact;
}
