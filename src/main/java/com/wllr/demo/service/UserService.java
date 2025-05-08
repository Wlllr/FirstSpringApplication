package com.wllr.demo.service;

import com.wllr.demo.model.User;
import com.wllr.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    // essa notacao @Autowired é do Spring, o que ela faz é injetar um objeto(criar).
    // No caso o Spring esta criando um objeto UserRepository, que é uma interface.
    // Nao so cria como tambem automaticamente cria uma implementacao para a mesma.
    private UserRepository repository;

    public List<User> listAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
