package com.springboot.dynamoDB.ExpenseTracker.Service;

import com.springboot.dynamoDB.ExpenseTracker.DTO.UserDTO;
import com.springboot.dynamoDB.ExpenseTracker.Entity.User;
import com.springboot.dynamoDB.ExpenseTracker.Exceptions.EntityNotFoundException;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {


    //create
    public User addUser(User user);

    //retrieve
    public List<User> getUsers() throws EntityNotFoundException;


    //retrieve
   public User getUserById(String id) throws EntityNotFoundException;


    //update
    public User updateUser(String id, UserDTO userDTO) throws EntityNotFoundException;

    //delete
    public User deleteUser(String id) throws EntityNotFoundException;

    public User getUserByEmail(String email);
}
