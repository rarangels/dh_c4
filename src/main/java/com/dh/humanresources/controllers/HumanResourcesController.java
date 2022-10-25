package com.dh.humanresources.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${app.realm}")
public class HumanResourcesController {
    @PostMapping("/altaEmpleado")
    @PreAuthorize("hasRole('ROLE_EMPLEADO_RH')")
    public String altaEmpleado() {
        return "Se dió de alta un empleado";
    }

    @PostMapping("/bajaEmpleado")
    @PreAuthorize("hasRole('ROLE_ADMIN_RH')")
    public String bajaEmpleado() {
        return "Se dió de baja un empleado";
    }

    @PostMapping("/editarInformacion")
    @PreAuthorize("hasRole('ROLE_EMPLEADO')")
    public String editarInformacion() {
        return "Se modificó la información personal del empleado";
    }
}
