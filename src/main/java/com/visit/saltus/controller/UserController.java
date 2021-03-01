package com.visit.saltus.controller;

import com.visit.saltus.model.User;
import com.visit.saltus.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController
{
    @Autowired
    UserRepository repository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> doLogin(@RequestBody User user)
    {
        User registeredUser = repository.findUserByPhone(user.getPhone(),user.getPassword());
        if(registeredUser != null)
        {
            registeredUser.setPassword("");
            return new ResponseEntity<>(registeredUser, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("", HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> doLoginRegister(@RequestBody User user)
    {
        String Phone = user.getPhone();

        User registeredUser = repository.findUserByPhoneOnly(Phone);
        if(registeredUser != null)
        {
            if (!registeredUser.getEmail().equals("") && user.getEmail().equals(""))
            {
                user.setEmail(registeredUser.getEmail());
            }
            if (!registeredUser.getFirstname().equals("") && user.getFirstname().equals(""))
            {
                user.setFirstname(registeredUser.getFirstname());
            }
            if (!registeredUser.getLastname().equals("") && user.getLastname().equals(""))
            {
                user.setLastname(registeredUser.getLastname());
            }
            if (!registeredUser.getPhone().equals("") && user.getPhone().equals(""))
            {
                user.setPhone(registeredUser.getPhone());
            }
            if (!registeredUser.getImage().equals("") && user.getImage().equals(""))
            {
                user.setImage(registeredUser.getImage());
            }
            user.setId(registeredUser.getId());
            repository.save(user);
            return new ResponseEntity<>(registeredUser, HttpStatus.CONFLICT);
        }
        else
        {
            repository.save(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/edituser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> doEditUser(@RequestBody User user)
    {

        User registeredUser = repository.findUserById(user.getId());
        if(registeredUser != null)
        {
            if (!registeredUser.getEmail().equals("") && user.getEmail().equals(""))
            {
                user.setEmail(registeredUser.getEmail());
            }
            if (!registeredUser.getFirstname().equals("") && user.getFirstname().equals(""))
            {
                user.setFirstname(registeredUser.getFirstname());
            }
            if (!registeredUser.getLastname().equals("") && user.getLastname().equals(""))
            {
                user.setLastname(registeredUser.getLastname());
            }
            if (!registeredUser.getPhone().equals("") && user.getPhone().equals(""))
            {
                user.setPhone(registeredUser.getPhone());
            }
            if (!registeredUser.getImage().equals("") && user.getImage().equals(""))
            {
                user.setImage(registeredUser.getImage());
            }
            user.setPassword(registeredUser.getPassword());
            user.setId(registeredUser.getId());
            repository.save(user);
            return new ResponseEntity<>(registeredUser, HttpStatus.OK);
        }
        else
        {
            //repository.save(user);
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
    }



}
