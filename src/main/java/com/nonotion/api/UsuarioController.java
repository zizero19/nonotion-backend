package com.nonotion.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.nonotion.nonotion.Entities.Usuario;
import com.nonotion.nonotion.Repository.RepositoryUsuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    RepositoryUsuario uRepository;

    /*
     * @PostMapping("/login")
     * public Usuario login(Usuario usuario){
     * Usuario usuarioAutenticacao =
     * uRepository.findByLoginAndSenha(usuario.getNome(), usuario.getSenha());
     * 
     * if (usuarioAutenticacao != null) {
     * usuarioAutenticacao.setStatus(true);
     * uRepository.save(usuarioAutenticacao);
     * 
     * return "fodase";
     * } else {
     * return "fodase";
     * }
     * 
     * }
     */

    // cadastro de usuario
    @PostMapping("/cadastro")
    public Usuario cadastro(Usuario usuario) {
        uRepository.save(usuario);
        return usuario;
    }
}
