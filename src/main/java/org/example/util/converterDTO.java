package org.example.util;

import org.example.domain.libro;
import org.example.dto.libroDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class converterDTO {
    public ConverterDTO(){
        modelMapper = new ModelMapper();
    }
    private ModelMapper modelMapper;
    public libroDTO toDto(libro libro){
        libroDTO LibroDTO = modelMapper.map(libro, libroDTO.class);
        return libroDTO;
    }
