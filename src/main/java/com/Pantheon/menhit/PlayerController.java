package com.Pantheon.menhit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/players")
@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @PostMapping("/add")
    public @ResponseBody String addNewPlayer(@RequestBody Players player){
        repository.save(player);
        return "Player Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Players> getAllPlayers(){
        return repository.findAll();
    }

}
