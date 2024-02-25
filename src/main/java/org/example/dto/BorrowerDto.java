package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerDto {
    private String id;
    private String name;
    private String address;
    private String dob;
    private String contact;
}
