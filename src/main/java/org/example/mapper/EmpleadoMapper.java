package org.example.mapper;

import org.example.dto.EmpleadoDTO;
import org.example.dto.PersonaDTO;
import org.example.model.Empleado;
import org.example.model.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpleadoMapper {

    EmpleadoMapper INSTANCE = Mappers.getMapper(EmpleadoMapper.class);
    EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

    Empleado  empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
}
