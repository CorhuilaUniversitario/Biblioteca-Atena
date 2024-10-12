package com.corhuila.BackendAtena.Controller;

import com.corhuila.BackendAtena.Entity.Clientes;
import com.corhuila.BackendAtena.IService.IClientesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/prestamos")
public class PrestamosController extends ABaseController<Clientes, IClientesService> {
    public PrestamosController(IClientesService service) {
        super(service, "Prestamos");
    }
}

