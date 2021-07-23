package edu.pro.controller.gui;/*
  @author   george
  @project   course-project
  @class  ItemGuiController
  @version  1.0.0 
  @since 20.07.21 - 12.34
*/

import edu.pro.form.ItemCreateForm;
import edu.pro.form.ItemUpdateForm;
import edu.pro.model.Element;
import edu.pro.model.Item;
import edu.pro.service.element.impls.ElementServiceImpl;
import edu.pro.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/gui/element")
public class ElemGuiController {

    @Autowired
    ElementServiceImpl service;

    @RequestMapping("/all")
    public String getAll(Model model){
        List<Element> elements = service.getAll();
        model.addAttribute("elements", elements);
        return "elements";
    }



}
