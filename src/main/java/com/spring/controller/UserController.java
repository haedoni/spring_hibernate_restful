package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;


@RestController
@CrossOrigin(origins="*")
public class UserController {

   @Autowired
   private UserService memberService;

   /*---Add new user---*/
   @PostMapping("/signup")
   public ResponseEntity<?> save(@RequestBody User user) {	      
	   long id = memberService.save(user);
     
	   return ResponseEntity.ok().body(user);
   }
}