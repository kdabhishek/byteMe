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
public class Return {
    private UUID id;
    private UUID productId;
    private int qty;
    private String remarks;
    private UUID linedId;
    private int returnQty;
    private UUID returnActionId;

}
