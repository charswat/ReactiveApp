package aplicacionReactiva;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuariosPublicos {
    Mono<Usuario> getUseriosById(int id);
    Flux<Usuario> getAllUserios();

}
