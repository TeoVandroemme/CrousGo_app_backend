package com.imt.fw.crousgo_app_backend.resources;

import com.imt.fw.crousgo_app_backend.entities.Categorie;
import com.imt.fw.crousgo_app_backend.repositories.CategorieRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("allergen")
public class CategorieResource {

    @Autowired
    private CategorieRepository allergenRepository;

    @GET
    @Produces(value = "application/json")
    public List<Categorie> getCategorie() {
        return allergenRepository.findAll();
    }
}
