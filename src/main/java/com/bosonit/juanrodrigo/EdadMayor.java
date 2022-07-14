package com.bosonit.juanrodrigo;

import org.springframework.web.bind.annotation.*;

@RestController
public class EdadMayor {
    @RequestMapping(value = "name", method = RequestMethod.POST)
    @ResponseBody
    public Persona  edadmasuno (@RequestBody Persona persona){
        return persona.edadmasuno(persona);
    }
}
