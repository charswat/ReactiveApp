package ClienteWeb;
import java.util.List;


import aplicacionReactiva.Usuario;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public class ClienteWebUsuarios {
    private WebClient client = WebClient.create("http://localhost:8080");
    // trae todos los Usuarios
    private Mono<ClientResponse> result = client.get()
            .uri("/user")
            .accept(MediaType.APPLICATION_JSON_UTF8)
            .exchange();

    public List<Usuario> getResult() {
        Flux<Usuario> userList = result.flatMapMany(res -> res.bodyToFlux(Usuario.class));
        return userList.collectList().block();
    }
}
