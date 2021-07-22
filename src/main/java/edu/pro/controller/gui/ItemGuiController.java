package edu.pro.controller.gui;/*
  @author   george
  @project   course-project
  @class  ItemGuiController
  @version  1.0.0 
  @since 20.07.21 - 12.34
*/

import edu.pro.model.Item;
import edu.pro.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gui/item")
public class ItemGuiController {

    @Autowired
    ItemServiceImpl service;

    @RequestMapping("/all")
    public String getAll(Model model){
        List<Item> items = service.getAll();
        model.addAttribute("items", items);
        return "items";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable("id") String id){
        service.delete(id);
        List<Item> items = service.getAll();
        model.addAttribute("items", items);
        return "items";
    }

    @RequestMapping("/update/{id}")
    public String update(Model model,@PathVariable("id") String id){
        List<Item> items = service.getAll();
        model.addAttribute("items", items);
        return "items";
    }




}
