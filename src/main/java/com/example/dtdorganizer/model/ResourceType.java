package com.example.dtdorganizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Enumerator that specifies the available types of Resource items
@Getter
@AllArgsConstructor
public enum ResourceType {
    Office,
    WorkMaterials,
    Utilities
}
