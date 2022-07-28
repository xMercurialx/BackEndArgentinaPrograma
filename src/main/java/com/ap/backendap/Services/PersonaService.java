package com.ap.backendap.Services;

import com.ap.backendap.Entity.Persona;
import com.ap.backendap.Exception.UserNotFoundException;
import com.ap.backendap.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public List<Persona> buscarPersona(){
        return personaRepo.findAll();
    }
    public Persona editarPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public void borrarPersona(Long id){personaRepo.deleteById(id);}

    public Persona buscarPersonaPorId(Long id){
        return  personaRepo.findById(id).orElseThrow(() ->new UserNotFoundException("usuario no encontrado"));
    }
}
