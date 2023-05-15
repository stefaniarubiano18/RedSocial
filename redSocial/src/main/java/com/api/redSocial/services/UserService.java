package com.api.redSocial.services;
import com.api.redSocial.models.UserModel;
import com.api.redSocial.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers()
    {
        return(ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user)
    {
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id)
    {
        return userRepository.findById(id);
    }

    public UserModel updateById(UserModel request, Long id)
    {
        UserModel user = userRepository.findById(id).get();

        user.setNombre(request.getNombre());
        user.setApellido(request.getApellido());
        user.setCelular(request.getCelular());
        user.setEmail(request.getEmail());
        user.setContrasena(request.getContrasena());
        user.setFecha_Nac(request.getFecha_Nac());
        user.setSexo(request.getSexo());

        return user;
    }

    public Boolean deleteUser (Long id)
    {
        try{
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
