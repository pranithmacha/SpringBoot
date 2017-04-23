package com.mac.Controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Collection;



@Controller
public class MainController {

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String home(){
        String homePage = "";
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // String username = auth.getName();
        Collection<SimpleGrantedAuthority> grantedAuthorities = (Collection<SimpleGrantedAuthority>)auth.getAuthorities();
        for(SimpleGrantedAuthority grantedauth: grantedAuthorities){
            String roleName = grantedauth.toString();
            if(roleName.equals("ROLE_ADMIN")){
                homePage = "admin-home";
                break;
            }
            else if(roleName.equals("ROLE_USER")){
                homePage = "user-home";
                break;
            }
        }
        return homePage;
    }

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value="/register", method= RequestMethod.POST)
    public String createUser(){
        return "register";
    }

    @RequestMapping(value="/admin", method= RequestMethod.GET)
    public String getAdmin(){
        return "admin";
    }

}
