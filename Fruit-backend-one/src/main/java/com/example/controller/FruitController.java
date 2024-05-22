package com.example.controller;

import com.example.entity.Fruit;
import com.example.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    //Mybatis-Plus 快速查询

    @GetMapping("/list")
    public List<Fruit> list(){
        return this.fruitService.list();
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Fruit fruit){
        return this.fruitService.save(fruit);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.fruitService.removeById(id);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Fruit fruit){
        return this.fruitService.updateById(fruit);
    }

    @GetMapping("/find/{id}")
    public Fruit find(@PathVariable("id") Integer id){
        return this.fruitService.getById(id);
    }



    //Mybatis-Plus xml查询
    @GetMapping("/listXml")
    public List<Fruit> listXml(){
        return this.fruitService.listXml();
    }

    @DeleteMapping("/deleteXml/{id}")
    public boolean deleteXml(@PathVariable("id") Integer id){
        return this.fruitService.deleteXml(id);
    }

    @GetMapping("/findXml/{id}")
    public Fruit findXml(@PathVariable("id") Integer id){
        return this.fruitService.findXml(id);
    }

    @PutMapping("/updateXml")
    public boolean updateXml(@RequestBody Fruit fruit){
        return this.fruitService.updateXml(fruit);
    }

    @PostMapping("/addXml")
    public boolean addXml(@RequestBody Fruit fruit){
        return this.fruitService.addXml(fruit);
    }

    //Mybatis-Plus 不同数据类型查询
}

