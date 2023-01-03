
package com.example.demojar.services;
import java.util.ArrayList;
import com.example.demojar.models.HabilidadesModel;
import com.example.demojar.repositories.HabilidadesRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HabilidadesService {
    @Autowired
    HabilidadesRepository usuarioRepository;
    public ArrayList<HabilidadesModel> obtenerHabilidades(){
        return (ArrayList<HabilidadesModel>) usuarioRepository.findAll();
    //findAll metodo de CrudRepository
   }
    public HabilidadesModel guardarHabilidades(HabilidadesModel usuario){
        return usuarioRepository.save(usuario);  //save metodo de CrudRepository
    }//**************** 2da etapa
    public Optional<HabilidadesModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }
    /*public ArrayList<HabilidadesModel>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }*/
    public boolean eliminarHabilidades(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
