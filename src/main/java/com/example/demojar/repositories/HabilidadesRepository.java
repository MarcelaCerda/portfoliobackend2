
package com.example.demojar.repositories;
import com.example.demojar.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import java.util.ArrayList;
@Repository
public interface HabilidadesRepository extends CrudRepository<HabilidadesModel,Long>{
   //CrudRepository hace toda la magia de Spring
//**************2da etapa ***********************
//public abstract ArrayList<HabilidadesModel> findByPrioridad(Integer prioridad);
}
