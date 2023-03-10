package poke.dex.springdex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pt.figtreestudios.springpokeapi.proxy.pokeapi.PokeApiPokemon;

@RestController
public class AbilitiesController {
    
    @Autowired 
    PokeApiPokemon pokeApi;

    @GetMapping("/abilities")
    public ResponseEntity<?> getAll (){
       return ResponseEntity.status(HttpStatus.OK).body(pokeApi.getAbilities(1000, 10));
    }

    @GetMapping("/abilities/name/{name}")
    public ResponseEntity<?> getByName (@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(pokeApi.getAbilityByName(name));
    }

    @GetMapping("/abilities/id/{id}")
    public ResponseEntity<?> getByAbilityId (@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(pokeApi.getAbilityById(id));
    }
}
