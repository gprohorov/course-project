package edu.pro.repository;/*
  @author   george
  @project   course-project
  @class  FakeElementRepository
  @version  1.0.0 
  @since 20.07.21 - 10.56
*/

import edu.pro.model.Element;
import edu.pro.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeElementRepository {

    @Autowired
    ItemMongoRepository itemMongoRepository;

    private LocalDateTime time = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("0", "name0", "desc0",time, time),
                    new Item("1", "name1", "desc1",time, time),
                    new Item("2", "name2", "desc2",time, time),
                    new Item("3", "name3", "desc3",time, time)
            )
    );
    private List<Element> list = new ArrayList<>(
            Arrays.asList(
                    new Element("0", "name0", items.get(0),"desc0",time, time),
                    new Element("1", "name1", items.get(0),"desc1",time, time),
                    new Element("2", "name2", items.get(0),"desc2",time, time),
                    new Element("3", "name3",items.get(0), "desc3",time, time)
            )
    );



    public Element create(Element element) {
        String id = UUID.randomUUID().toString();
        element.setId(id);
        element.setCreatedAt(LocalDateTime.now());
        element.setUpdatedAt(LocalDateTime.now());
        list.add(element);
        return element;
    }


    public Element get(String id) {
        Element Element = list.stream().filter(el -> el.getId().equals(id))
                .findAny().get();
        return Element;
    }


    public Element update(Element element) {
        String id = element.getId();
        Element elementToUpdate = this.get(id);
        element.setCreatedAt(elementToUpdate.getCreatedAt());
        int index = list.indexOf(elementToUpdate);
        element.setUpdatedAt(LocalDateTime.now());
        list.remove(elementToUpdate);
        list.add(index, element);

        return element;
    }


    public Element delete(String id) {

        Element Element =  this.get(id);
        list.remove(Element);

        return Element;
    }


    public List<Element> getAll() {
        return list;
    }




}
