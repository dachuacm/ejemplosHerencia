package ejercicio3;

public class Persona {
 private String nombre;
 private String apellidos;
 private String CURP;
 public Persona(String nombre, String apellidos, String cURP) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    CURP = cURP;
 }
 public String getNombre() {
    return nombre;
 }
 public void setNombre(String nombre) {
    this.nombre = nombre;
 }
 public String getApellidos() {
    return apellidos;
 }
 public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
 }
 public String getCURP() {
    return CURP;
 }
 public void setCURP(String cURP) {
    CURP = cURP;
 }

 


}
