package com.cezarfbf.genericapi.domain.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String id;
    @Getter @Setter private String email;
    @Getter @Setter private String password;
    @Getter @Setter private String lastName;
    @Getter @Setter private String firstName;
    @Getter @Setter private String avatar;
}
