package org.example.mapper;

import org.example.dto.PersonaDTO;
import org.example.dto.SedeDTO;
import org.example.model.Persona;
import org.example.model.Sede;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonaMapper {

    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);
    PersonaDTO personaToPersonaDTO(Persona persona);

    Persona personaDTOToPersona(PersonaDTO personaDTO);
}
