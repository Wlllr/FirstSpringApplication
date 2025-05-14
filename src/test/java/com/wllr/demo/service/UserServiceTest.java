package com.wllr.demo.service;

import com.wllr.demo.model.User;
import com.wllr.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        User user = new User();
        user.setId(1L);

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> result = service.findById(1L);
        assertTrue(result.isPresent());
        assertEquals(1L, result.get().getId());
    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("Weller");

        service.save(user);

        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        verify(repository).save(captor.capture());

        assertEquals("Weller", captor.getValue().getName());
    }

    @Test
    void testDelete() {
        service.delete(1L);
        verify(repository).deleteById(1L);
    }
}
