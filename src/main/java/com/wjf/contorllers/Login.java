package com.wjf.contorllers;

import lombok.Data;
import org.springframework.stereotype.Controller;

@Controller
@Data
public class Login {
    private String username;
    private String password;
    public String adminLogin(){
        if("admin".equals(username) && "123".equals(password)) {
            return "success";
        }
        return "error";
    }
}
