package com.ironhack.accounts_micro.service;

import com.ironhack.accounts_micro.dto.AccountResponseDTO;
import com.ironhack.accounts_micro.model.Account;
import com.ironhack.accounts_micro.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public ResponseEntity<?> getAccountById(Long id) {
        Optional<Account> account = accountRepository.findById(id);

        if (account.isPresent()) {
            //UserDTO user = restTemplate.getForObject("http://users-micro/api/user/" + account.get().getOwnerId(), UserDTO.class);
            // comentamos el código para usar feignClient

            // INCLUIR AQUI EL FEIGN PARA HACER EL GET DE USER
            System.out.println("EL USUARIO ES: " + user);

            AccountResponseDTO response = new AccountResponseDTO(account.get(), user);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }


}
