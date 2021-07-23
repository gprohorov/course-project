package edu.pro.service.element.interfaces;/*
  @author   george
  @project   course-project
  @class  IElementService
  @version  1.0.0 
  @since 18.07.21 - 21.04
*/

import edu.pro.model.Element;
import edu.pro.model.Element;

import java.util.List;

public interface IElementService {

    Element create(Element element);
    Element get(String id);
    Element update(Element element);
    Element  delete(String id);
    List<Element> getAll();

}
