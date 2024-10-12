package com.corhuila.BackendAtena.Service;

import com.corhuila.BackendAtena.Entity.Clientes;
import com.corhuila.BackendAtena.IRepository.IBaseRepository;
import com.corhuila.BackendAtena.IRepository.IClientesRepository;
import com.corhuila.BackendAtena.IService.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService extends ABaseService<Clientes> implements IClientesService {
    @Override
    protected IBaseRepository<Clientes, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IClientesRepository repository;
}
