package com.bosonit.juanrodrigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
    @GetMapping("user/{nombre}")

    @ResponseBody

    public String saludar ( @PathVariable  String nombre){
        return "hola " + nombre;
    }


}
