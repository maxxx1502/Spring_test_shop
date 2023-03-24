package ru.novikov.springtestshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String username;
    private String password;
    private String matching;
    private String email;


}
