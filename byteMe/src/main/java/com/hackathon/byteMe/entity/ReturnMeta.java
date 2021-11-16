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
public class ReturnMeta {
    private UUID id;
    private String type;
    private String value;
    private UUID returnId;

}
