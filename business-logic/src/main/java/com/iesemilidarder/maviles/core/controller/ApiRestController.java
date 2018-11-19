package com.iesemilidarder.maviles.core.controller;

import com.iesemilidarder.maviles.core.MyBeanWrapper;
import com.iesemilidarder.maviles.core.data.MyBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ApiRestController {

    // Para buscar todos los elementos

    @RequestMapping("/getAll")
    public List<MyBean> getAll() {
        return MyBeanWrapper.getItems();
    }

    // Para filtrar por Nombre

    @RequestMapping("/getName/{name}")
    public MyBean getName(@PathVariable String name) {

        return MyBeanWrapper.getName(name);
    }

    @RequestMapping("/addItem")
    public MyBean addItem(

            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String date,
            @RequestParam Double price
    ) {

        MyBean item = new MyBean();
        item.setName(name);
        item.setDescription(description);
        item.setDate(date);
        item.setPrice(7.5);
        MyBeanWrapper.addItem(item);
        return  item;

    }
}
