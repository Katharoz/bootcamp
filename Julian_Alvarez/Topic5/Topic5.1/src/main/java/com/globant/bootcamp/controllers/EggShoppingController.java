package com.globant.bootcamp.controllers;

import com.globant.bootcamp.entities.buildings.HenHouse;
import com.globant.bootcamp.entities.enums.EggType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/egg")
public class EggShoppingController implements ErrorController {

    @GetMapping("/get")
    public List<EggType> getEggs(){
        return HenHouse.listOfEggs;
    }

    @PostMapping("/post")
    public String addEgg(@RequestBody String color){
        if (color.equals("D"))   HenHouse.listOfEggs.add(EggType.D);
        else if (color.equals("O")) HenHouse.listOfEggs.add(EggType.O);
        else return "Post Error";

        return "an egg has been added";
    }

    @PutMapping("/put/{index}")
    public String putEgg(@PathVariable int index, @RequestBody String color){
        if (index < 0 || index > HenHouse.listOfEggs.size())    return "Index out of bounds";
        if (color.equals("D"))   HenHouse.listOfEggs.set(index, EggType.D);
        else if (color.equals("O")) HenHouse.listOfEggs.set(index, EggType.O);
        else return "Post Error";

        return "an egg has been modified at index " +index;
    }

    @DeleteMapping("/delete")
    public void deleteEgg(@RequestParam(value = "index") int index){
        HenHouse.listOfEggs.remove(index);
    }

}
