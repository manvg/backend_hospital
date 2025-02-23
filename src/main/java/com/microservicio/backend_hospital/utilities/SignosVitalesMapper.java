package com.microservicio.backend_hospital.utilities;

import com.microservicio.backend_hospital.model.SignosVitales;
import com.microservicio.backend_hospital.model.SignosVitalesPacienteEntity;

public class SignosVitalesMapper {

    public static SignosVitales toDto(SignosVitalesPacienteEntity entity) {
        if (entity == null) {
            return null;
        }
        return new SignosVitales(
            entity.getNombrePaciente(),
            entity.getRitmoCardiaco(),
            entity.getTemperatura(),
            entity.getPresionSistolica(),
            entity.getPresionDiastolica()
        );
    }

    public static SignosVitalesPacienteEntity toEntity(SignosVitales dto) {
        if (dto == null) {
            return null;
        }
        return new SignosVitalesPacienteEntity(
            0, // El ID se autogenera en la base de datos
            dto.getNombrePaciente(),
            dto.getRitmoCardiaco(),
            dto.getTemperatura(),
            dto.getPresionSistolica(),
            dto.getPresionDiastolica()
        );
    }
}