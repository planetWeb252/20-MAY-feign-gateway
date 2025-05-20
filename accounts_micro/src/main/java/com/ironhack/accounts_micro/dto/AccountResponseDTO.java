package com.ironhack.accounts_micro.dto;

import com.ironhack.accounts_micro.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDTO {
    private Long id;
    private Long ownerId;
    private String isbn;
    private BigDecimal balance;
    private UserDTO user;

    public AccountResponseDTO(Account account, UserDTO user){
        setId(account.getId());
        setIsbn(account.getIsbn());
        setBalance(account.getBalance());
        setOwnerId(account.getOwnerId());
        setUser(user);
    }
}
