package herencia;

public class Usuario extends Persona {
    String correo;
    String contrasena;
    public Usuario(String nombre,int edad,String sexo,String correo,String contrasena){
        super (nombre,edad,sexo);
        this.correo= correo;
        this.contrasena=contrasena;
    }
    public void ingresar(){
        System.out.println("nombre "+nombre+" edad: "+edad+" genero: "+sexo+" tu correo es: "+correo+" tu contraseña: "+contrasena);
    }
}
    