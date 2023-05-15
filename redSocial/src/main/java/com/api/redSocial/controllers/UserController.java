package com.api.redSocial.controllers;
import com.api.redSocial.models.UserModel;
import com.api.redSocial.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers()
    {
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user)
    {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable ("id") Long id)
    {
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id)
    {
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id)
    {
        boolean ok = this.userService.deleteUser(id);

        if(ok)
        {
            return "El usuario con el id" + id + "ha sido eliminado";
        }
        else{
            return "El usuario no se pudo eliminar";
        }
    }
}
