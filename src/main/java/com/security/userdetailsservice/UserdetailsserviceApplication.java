package com.security.userdetailsservice;

import com.security.userdetailsservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UserdetailsserviceApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserdetailsserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User ("Gadibia", bCryptPasswordEncoder.encode("telekinesis")));
    }
}
