package com.corhuila.BackendAtena.Service;

import com.corhuila.BackendAtena.Entity.Prestamos;
import com.corhuila.BackendAtena.IRepository.IBaseRepository;
import com.corhuila.BackendAtena.IRepository.IPrestamosRepository;
import com.corhuila.BackendAtena.IService.IPrestamosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamosService extends ABaseService<Prestamos> implements IPrestamosService {
    @Override
    protected IBaseRepository<Prestamos, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IPrestamosRepository repository;
}
