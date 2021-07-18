package edu.pro.service.item.interfaces;/*
  @author   george
  @project   course-project
  @class  IItemService
  @version  1.0.0 
  @since 18.07.21 - 20.21
*/

import edu.pro.model.Item;

import java.util.List;

public interface IItemService {

    //  CRUD
    Item create(Item item);
    Item get(String id);
    Item update(Item item);
    Item  delete(String id);
    List<Item> getAll();

}
