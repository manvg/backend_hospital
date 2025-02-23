package com.microservicio.backend_hospital.utilities;

import com.microservicio.backend_hospital.model.AlertaMedica;
import com.microservicio.backend_hospital.model.AlertaMedicaEntity;

public class AlertaMedicaMapper {

    public static AlertaMedica toDto(AlertaMedicaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new AlertaMedica(
            entity.getNombrePaciente(),
            entity.getRitmoCardiaco(),
            entity.getTemperatura(),
            entity.getPresionSistolica(),
            entity.getPresionDiastolica(),
            entity.getObservacion(),
            entity.getFechaRegistro()
        );
    }

    public static AlertaMedicaEntity toEntity(AlertaMedica dto) {
        if (dto == null) {
            return null;
        }
        AlertaMedicaEntity entity = new AlertaMedicaEntity();
        entity.setNombrePaciente(dto.getNombrePaciente());
        entity.setRitmoCardiaco(dto.getRitmoCardiaco());
        entity.setTemperatura(dto.getTemperatura());
        entity.setPresionSistolica(dto.getPresionSistolica());
        entity.setPresionDiastolica(dto.getPresionDiastolica());
        entity.setObservacion(dto.getObservacion());
        return entity;
    }
}