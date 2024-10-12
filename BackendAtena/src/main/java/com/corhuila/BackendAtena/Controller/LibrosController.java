package com.corhuila.BackendAtena.Controller;

import com.corhuila.BackendAtena.Entity.Clientes;
import com.corhuila.BackendAtena.IService.IClientesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libros")
public class LibrosController extends ABaseController<Clientes, IClientesService> {
    public LibrosController(IClientesService service) {
        super(service, "Libros");
    }
}

