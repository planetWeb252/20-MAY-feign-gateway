package com.ironhack.accounts_micro.clients;

import com.ironhack.accounts_micro.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "users-micro")
public interface UserFeignClient {
    @GetMapping("/api/user/{id}")
    UserDTO getUserById(@PathVariable Long id);
}
