package edu.pro.controller.gui;/*
  @author   george
  @project   course-project
  @class  ItemGuiController
  @version  1.0.0 
  @since 20.07.21 - 12.34
*/

import edu.pro.form.ItemCreateForm;
import edu.pro.model.Item;
import edu.pro.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model,@PathVariable("id") String id){
        service.delete(id);

        return "redirect:/gui/item/all";
    }

    @RequestMapping("/update/{id}")
    public String update(Model model,@PathVariable("id") String id){
        List<Item> items = service.getAll();
        model.addAttribute("items", items);
        return "items";
    }

    @GetMapping("/create")
    public String create(Model model){
        ItemCreateForm formToCreate = new ItemCreateForm();
        model.addAttribute("form", formToCreate);
        return "item-create";
    }
        @PostMapping("/create")
    public String create( @ModelAttribute("form") ItemCreateForm form){
            Item item = new Item();
            item.setName(form.getName());
            item.setDesc(form.getDesc());
            service.create(item);

            return "redirect:/gui/item/all";
    }






}
