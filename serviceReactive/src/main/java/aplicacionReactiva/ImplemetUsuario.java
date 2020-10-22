package aplicacionReactiva;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public class ImplemetUsuario implements UsuariosPublicos {
    Map<Integer, Usuario> userMap = new ConcurrentHashMap<Integer, Usuario>();
    public ImplemetUsuario(){
        userMap.put(1, new Usuario(1, "Charlie", "Perez", "chalie@hotmail.com"));
        userMap.put(2, new Usuario(2, "Thomas", "Diaz", "thommy@gmial.com"));
        userMap.put(3, new Usuario(3, "Diego", "Duarte", "dgoUsa@outlook.com"));
        userMap.put(4, new Usuario(4, "Pedro", "Camargo", "pedrito@outlook.com"));
        userMap.put(5, new Usuario(5, "Lucas", "Velez", "lukaku@hotmail.com"));
        userMap.put(6, new Usuario(6, "Mathias", "Ramos", "matty@gmail.com"));
        userMap.put(7, new Usuario(7, "Eva", "Cortina", "evita@outlook.com"));
    }

    @Override
    public Mono<Usuario> getUseriosById(int id) {
        return Mono.justOrEmpty(userMap.get(id));
    }

    @Override
    public Flux<Usuario> getAllUserios() {
        // trae como String
        return Flux.fromStream(userMap.values().stream());
    }

}
