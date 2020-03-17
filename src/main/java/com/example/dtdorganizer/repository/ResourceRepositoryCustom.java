package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.model.ResourceType;

import java.util.List;

public interface ResourceRepositoryCustom {
    List<Resource> getAllByOffice();
    List<Resource> getAllByWorkMaterials();
    List<Resource> getAllByUtilities();
}
