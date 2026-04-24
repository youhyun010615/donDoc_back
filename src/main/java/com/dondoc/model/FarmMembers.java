package com.dondoc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmMembers {
    private long id;
    private long userId;  // FK -> user.id
    private long farmId;  // Fk -> farms.id
    private  String joined_at;
}
