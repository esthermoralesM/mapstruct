package org.example;

import org.example.dto.EmpleadoDTO;
import org.example.dto.PersonaDTO;
import org.example.dto.SedeDTO;

import org.example.mapper.EmpleadoMapper;
import org.example.mapper.PersonaMapper;
import org.example.mapper.SedeMapper;
import org.example.model.Empleado;
import org.example.model.Persona;
import org.example.model.Sede;
import org.mapstruct.factory.Mappers;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Sede sede = new Sede();
        sede.setId(1);
        sede.setNombre("Sede ejemplo");

        SedeDTO sedeDTO = SedeMapper.INSTANCE.sedeToSedeDTO(sede);
        System.out.println(sedeDTO.getId());
        System.out.println(sedeDTO.getNombre());

        Persona persona = new Persona();
        persona.setId(1L);
        persona.setNombre("Esther");
        persona.setApellido("Morales Mozas");
        persona.setDireccion("Coll Cardús 20");
        persona.setTelefono("98444444");

        PersonaDTO personaDTO = PersonaMapper.INSTANCE.personaToPersonaDTO(persona);
        System.out.println(personaDTO.getApellido());

        Empleado empleado = new Empleado();
        Date fechaActual = new Date();
        empleado.setFechaIngreso(fechaActual);
        empleado.setId(2);
        empleado.setNombre("Puri");
        empleado.setSede(sede);

        EmpleadoDTO empleadoDTO = EmpleadoMapper.INSTANCE.empleadoToEmpleadoDTO(empleado);
        System.out.println(empleadoDTO.getFechaIngreso());
        System.out.println(empleadoDTO.getSede().getNombre());
    }
}