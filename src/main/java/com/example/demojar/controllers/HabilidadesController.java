package com.example.demojar.controllers;
import java.util.ArrayList;
import java.util.Optional;
import com.example.demojar.models.HabilidadesModel;
import com.example.demojar.services.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/habilidades")         // mapea     /habilidades
public class HabilidadesController {
    @Autowired
    HabilidadesService usuarioService;
    @CrossOrigin   // para solucionar error “cors”
    @GetMapping()      //trae todos los habilidades y lo mapea  /habilidades
    public ArrayList<HabilidadesModel> obtenerHabilidades(){
        return usuarioService.obtenerHabilidades();
    }
    @CrossOrigin
    @PostMapping()    //   graba un usuario
    public HabilidadesModel guardarHabilidades(@RequestBody HabilidadesModel usuario){
        return this.usuarioService.guardarHabilidades(usuario);
    }
 
    @CrossOrigin
    @GetMapping( path = "/{id}")    // trae un usuario segun id
    public Optional<HabilidadesModel> obtenerHabilidadesPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }
    //@CrossOrigin
    //@GetMapping("/query")        // trae los habilidades con determinada prioridad
    //public ArrayList<HabilidadesModel> obtenerHabilidadesPorPrioridad(@RequestParam("prioridad") Integer prioridad){
    //    return this.usuarioService.obtenerPorPrioridad(prioridad);
    //}
    @CrossOrigin
    @DeleteMapping( path = "/{id}")   // borra un usuario con determinado id  
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarHabilidades(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
