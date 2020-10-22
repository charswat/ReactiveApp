package aplicacionReactiva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class ControladorUsuario {
    @Autowired
    private UsuariosPublicos usuariosPublicos;
    private String port;

    @GetMapping("/")
    public String getUser() {
        return "application is up on port : " + port;
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/user")
    public Flux<Usuario> listaUserios() {
        Flux<Usuario> usuario = usuariosPublicos.getAllUserios();
        return usuario;
    }
    @CrossOrigin(origins ="*")
    @GetMapping("/user/{id}")
    Mono<Usuario> BuscaId(@PathVariable int id) {
        return this.usuariosPublicos.getUseriosById(id);
    }
}
