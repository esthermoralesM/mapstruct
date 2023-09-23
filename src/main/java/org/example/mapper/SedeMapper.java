package org.example.mapper;

import org.example.dto.PersonaDTO;
import org.example.dto.SedeDTO;
import org.example.model.Persona;
import org.example.model.Sede;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SedeMapper {

    SedeMapper INSTANCE = Mappers.getMapper(SedeMapper.class);

    //@Mapping(source = "nombre", target = "nombreCompleto")
    SedeDTO sedeToSedeDTO(Sede sede);

    Sede sedeDTOToSede(SedeDTO personaDTO);
}
