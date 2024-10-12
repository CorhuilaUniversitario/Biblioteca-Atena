package com.corhuila.BackendAtena.Controller;

import com.corhuila.BackendAtena.Entity.Clientes;
import com.corhuila.BackendAtena.IService.IClientesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/clientes")
public class ClientesController extends ABaseController<Clientes, IClientesService> {
    public ClientesController(IClientesService service) {
        super(service, "Clientes");
    }
}

