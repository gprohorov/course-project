package edu.pro.controller.rest;/*
  @author   george
  @project   course-project
  @class  ItemRestController
  @version  1.0.0 
  @since 18.07.21 - 19.43
*/

import edu.pro.model.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {
    private LocalDateTime time = LocalDateTime.now();
    private List<Item> list = new ArrayList<>(
            Arrays.asList(
                    new Item("0", "name0", "desc0",time, time),
                    new Item("1", "name1", "desc1",time, time),
                    new Item("2", "name2", "desc2",time, time),
                    new Item("3", "name3", "desc3",time, time)
            )
    );


    //  CRUD   -  create   read  update   delete  - get all


    @RequestMapping("/all")
    public List<Item> getAll(){
        return list;
    }

    @RequestMapping("/{id}")
    public Item get(@PathVariable("id") String id){

        Item item = list.stream().filter(el -> el.getId().equals(id))
                .findAny().get();

        return item;
    }







}
