package com.corhuila.BackendAtena.Service;

import com.corhuila.BackendAtena.Entity.Libros;
import com.corhuila.BackendAtena.IRepository.IBaseRepository;
import com.corhuila.BackendAtena.IRepository.ILibrosRepository;
import com.corhuila.BackendAtena.IService.ILibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrosService extends ABaseService<Libros> implements ILibrosService {
    @Override
    protected IBaseRepository<Libros, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ILibrosRepository repository;
}
