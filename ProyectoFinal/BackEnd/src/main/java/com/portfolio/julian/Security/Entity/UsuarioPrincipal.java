
/* Esta clase tendra toda la seguridad e implementara la interface userdetail
a la cual despues se importara todos los metodos*/
package com.portfolio.julian.Security.Entity;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
}
