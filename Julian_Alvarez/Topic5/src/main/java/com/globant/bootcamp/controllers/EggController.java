package com.globant.bootcamp.controllers;

import com.globant.bootcamp.models.EggCarton;
import com.globant.bootcamp.models.EggType;
import com.globant.bootcamp.sevices.EggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/egg")
@RestController
public class EggController {

    @Autowired
    private EggService eggService;

    @GetMapping
    public List<EggCarton> getEggs(){
        return eggService.getCartons();
    }

    @PostMapping
    public void addEgg(@RequestParam ("amount") int amount, @RequestBody EggCarton carton){
        eggService.addEggs(amount, carton);
    }

    @PutMapping
    public void updateCarton(@RequestBody EggCarton carton){
        eggService.updateEgg(carton);
    }

    @DeleteMapping("/{amount}")
    public void deleteEgg(@PathVariable("amount") int amount, @RequestBody EggCarton carton){
        eggService.deleteEgg(amount, carton);
    }

}
