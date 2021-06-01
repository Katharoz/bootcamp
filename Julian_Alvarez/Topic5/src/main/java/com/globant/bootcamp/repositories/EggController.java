package com.globant.bootcamp.repositories;

import com.globant.bootcamp.entities.EggType;
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
    public List<EggType> getEggs(){
        return eggService.getEggs();
    }

    @PostMapping
    public void addEgg(@RequestParam ("amount") int amount, @RequestBody String type){
        eggService.addEggs(amount-1, type);
    }

    @PutMapping("/{index}")
    public void updateEgg(@PathVariable("index") int index, @RequestBody String type){
        eggService.updateEgg(index, type);
    }

    @DeleteMapping("/{amount}")
    public void deleteEgg(@PathVariable("amount") int amount, @RequestBody String type){
        eggService.deleteEgg(amount, type);
    }

}
