package com.corhuila.BackendAtena.Service;

import com.corhuila.BackendAtena.Entity.Usuarios;
import com.corhuila.BackendAtena.IRepository.IBaseRepository;
import com.corhuila.BackendAtena.IRepository.IUsuariosRepository;
import com.corhuila.BackendAtena.IService.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService extends ABaseService<Usuarios> implements IUsuariosService {
    @Override
    protected IBaseRepository<Usuarios, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUsuariosRepository repository;
}
