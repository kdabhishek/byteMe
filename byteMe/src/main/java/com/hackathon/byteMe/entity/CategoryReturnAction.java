package com.hackathon.byteMe.entity;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryReturnAction {
    private UUID id;
    private UUID categoryId;
    private UUID returnActionId;

}
