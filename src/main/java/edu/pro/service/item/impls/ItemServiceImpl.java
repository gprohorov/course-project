package edu.pro.service.item.impls;/*
  @author   george
  @project   course-project
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 18.07.21 - 20.27
*/

import edu.pro.model.Item;
import edu.pro.repository.FakeItemRepository;
import edu.pro.repository.ItemMongoRepository;
import edu.pro.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    FakeItemRepository fakeRepository;

    @Autowired
    ItemMongoRepository mongoRepository;

    @PostConstruct
    void init(){
        List<Item> items = mongoRepository.findAll();
        if(items.isEmpty()) {
            items = fakeRepository.getAll();
            mongoRepository.saveAll(items);
        }
    }

    @Override
    public Item create(Item item) {
     item.setCreatedAt(LocalDateTime.now());
     item.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(item);
    }

    @Override
    public Item get(String id) {
        return mongoRepository.findById(id).orElse(null);
    }

    @Override
    public Item update(Item item) {
        item.setUpdatedAt(LocalDateTime.now());
        return mongoRepository.save(item);
    }

    @Override
    public Item delete(String id) {
        Item item = mongoRepository.findById(id).get();
        mongoRepository.deleteById(id);
        return item;
    }

    @Override
    public List<Item> getAll() {

        return mongoRepository.findAll();
    }
}
