package es.upm.master.agendix.modelo;

/**
 * Created by Walter on 19/01/2018.
 */

public class Contacto {

    private int id;
    private String Nombre;
    private String Apellido;
    private String Grupo;
    private String Telefono;
    private String Movil;
    private String Correo;
    private String Nota;
    private int Id_usu;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String apellido, String grupo, String telefono, String movil, String correo, String nota, int id_usu) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Grupo = grupo;
        Telefono = telefono;
        Movil = movil;
        Correo = correo;
        Nota = nota;
        Id_usu = id_usu;
    }

    public Contacto(int id, String nombre, String apellido, String grupo, String telefono, String movil, String correo, String nota) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Grupo = grupo;
        Telefono = telefono;
        Movil = movil;
        Correo = correo;
        Nota = nota;
    }

    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String movil) {
        Movil = movil;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public int getId_usu() {
        return Id_usu;
    }

    public void setId_usu(int id_usu) {
        Id_usu = id_usu;
    }
}
