
package com.example.demojar.controllers;
import java.util.ArrayList;
import java.util.Optional;
import com.example.demojar.models.DatosPersonalesModel;
import com.example.demojar.services.DatosPersonalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/datospersonales")         // mapea     /datospersonales
public class DatosPersonalesController {
    @Autowired
    DatosPersonalesService datospersonalesService;
    @CrossOrigin   // para solucionar error “cors”
    @GetMapping()      //trae todos los datospersonales y lo mapea  /datospersonales
    public ArrayList<DatosPersonalesModel> obtenerDatosPersonales(){
        return datospersonalesService.obtenerDatosPersonales();
    }
    @CrossOrigin
    @PostMapping()    //   graba un datospersonales
    public DatosPersonalesModel guardarDatosPersonales(@RequestBody DatosPersonalesModel datospersonales){
        return this.datospersonalesService.guardarDatosPersonales(datospersonales);
    }
 
    @CrossOrigin
    @GetMapping( path = "/{id}")    // trae un datospersonales segun id
    public Optional<DatosPersonalesModel> obtenerDatosPersonalesPorId(@PathVariable("id") Long id) {
        return this.datospersonalesService.obtenerPorId(id);
    }
    //@CrossOrigin
    //@GetMapping("/query")        // trae los datospersonaless con determinada prioridad
    //public ArrayList<DatosPersonalesModel> obtenerDatosPersonalesPorPrioridad(@RequestParam("prioridad") Integer prioridad){
    //    return this.datospersonalesService.obtenerPorPrioridad(prioridad);
    //}
    @CrossOrigin
    @DeleteMapping( path = "/{id}")   // borra un datospersonales con determinado id  
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.datospersonalesService.eliminarDatosPersonales(id);
        if (ok){
            return "Se eliminó el datospersonales con id " + id;
        }else{
            return "No pudo eliminar el datospersonales con id" + id;
        }
    }
}


