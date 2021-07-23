package edu.pro.service.element.impls;/*
  @author   george
  @project   course-project
  @class  ElementServiceImpl
  @version  1.0.0 
  @since 23.07.21 - 12.15
*/

import edu.pro.model.Element;
import edu.pro.model.Item;
import edu.pro.repository.ElementMongoRepository;
import edu.pro.repository.FakeElementRepository;
import edu.pro.service.element.interfaces.IElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ElementServiceImpl implements IElementService {

    @Autowired
    FakeElementRepository fakeElementRepository;

    @Autowired
    ElementMongoRepository mongoRepository;

      @PostConstruct
    void init(){
        List<Element> list = fakeElementRepository.getAll();
          System.out.println(list);
          mongoRepository.saveAll(list);
    }


    @Override
    public Element create(Element element) {
        return null;
    }

    @Override
    public Element get(String id) {
        return null;
    }

    @Override
    public Element update(Element element) {
        return null;
    }

    @Override
    public Element delete(String id) {
        return null;
    }

    @Override
    public List<Element> getAll() {
        return mongoRepository.findAll();
    }
}
