package com.boraji.tutorial.spring.controller;

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

import com.boraji.tutorial.spring.model.User;
import com.boraji.tutorial.spring.service.UserService;

@CrossOrigin(origins="*")
@RestController
public class UserController {

   @Autowired
   private UserService memberService;

   /*---Add new user---*/
   @PostMapping("/signup")
   public ResponseEntity<?> save(@RequestBody User user) {
	   System.out.println(user.getEmail());
	   System.out.println(user.getName());
	   System.out.println(user.getProvider());
	   System.out.println(user.getProvider_id());
	   System.out.println(user.getProvider_pic());
	      
	   long id = memberService.save(user);
     
	   return ResponseEntity.ok().body(user);
   }
}