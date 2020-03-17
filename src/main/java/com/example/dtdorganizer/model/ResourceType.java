package com.example.dtdorganizer.model;

import lombok.*;

//Enumerator that specifies the available types of Resource items
@Getter
@AllArgsConstructor
public enum ResourceType {
    Office,
    WorkMaterials,
    Utilities
}
