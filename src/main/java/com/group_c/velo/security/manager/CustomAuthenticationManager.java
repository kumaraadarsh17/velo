package com.group_c.velo.security.manager;

import com.group_c.velo.entity.User;
import com.group_c.velo.service.UserService;
import com.group_c.velo.service.UserServiceImplementation;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {
    private UserService userServiceImplementation;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        User user = userServiceImplementation.getUser(Long.valueOf(authentication.getName()));
        if(!bCryptPasswordEncoder.matches(authentication.getCredentials().toString(), user.getPassword())){
            throw new BadCredentialsException("wrong password");
        }
        return new UsernamePasswordAuthenticationToken(user.getRollNumber(), user.getPassword());
    }
}
