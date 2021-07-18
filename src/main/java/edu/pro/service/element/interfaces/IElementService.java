package edu.pro.service.element.interfaces;/*
  @author   george
  @project   course-project
  @class  IElementService
  @version  1.0.0 
  @since 18.07.21 - 21.04
*/

import edu.pro.model.Element;
import edu.pro.model.Item;

import java.util.List;

public interface IElementService {

    Element create(Element element);
    Item get(String id);
    Item update(Item item);
    Item  delete(String id);
    List<Item> getAll();

}
