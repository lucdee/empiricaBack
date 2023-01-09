package com.kdb.enrichment.service;


import com.kdb.enrichment.model.DataBaseDTO;

import java.util.List;

public interface DataBaseService {

    List<DataBaseDTO> findAll();

    DataBaseDTO findById(Long id);

    DataBaseDTO deleteById(Long id);

    DataBaseDTO adicionar(DataBaseDTO dataBaseDTO);
}
