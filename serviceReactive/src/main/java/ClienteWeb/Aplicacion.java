package ClienteWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"aplicacionReactiva"})
public class Aplicacion {
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
        ClienteWebUsuarios cliente = new ClienteWebUsuarios();
        System.out.println(cliente.getResult());
    }
}
