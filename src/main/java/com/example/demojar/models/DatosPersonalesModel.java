package com.example.demojar.models;
import java.util.ArrayList;
import jakarta.persistence.*;
@Entity
@Table(name = "datospersonales")
public class DatosPersonalesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String foto;

    @OneToMany(mappedBy="datosPersonales", fetch=FetchType.EAGER, cascade= CascadeType.ALL)
    private ArrayList<HabilidadesModel> habilidades=new ArrayList<>();
   

    /*
spring.datasource.url=jdbc:mysql://bucy5cjchqylcfpuhfmr-mysql.services.clever-cloud.com:3306/bucy5cjchqylcfpuhfmr
spring.datasource.username=ujmfz8vlfttkqgvy
spring.datasource.password=3Yh0wAnExPIxo1YIA1o5
spring.jpa.hibernate.ddl-auto=update 

    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/portfolio
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update   



*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
/*    public ArrayList<HabilidadesModel> getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(ArrayList<HabilidadesModel> habilidades) {
        this.habilidades = habilidades;
    }
*/

}
