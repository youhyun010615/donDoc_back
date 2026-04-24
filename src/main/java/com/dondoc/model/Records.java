package com.dondoc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Records {
    private long id; // Pk
    private long userId; // Fk -> users.id
    private long categoryId; //Fk -> categroies.id
    private long amount;
    private String description;
    private String memo;
    private String record_data;
    private String createdAt;
}
