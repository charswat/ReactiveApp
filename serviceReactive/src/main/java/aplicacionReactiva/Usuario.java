package aplicacionReactiva;

public class Usuario {

        private long id;
        private String Nombre;
        private String Apellido;
        private String email;

        public Usuario() {

        }
        public Usuario(long id, String Nombre, String Apellido, String email) {
            this.id = id;
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.email = email;
        }
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }

