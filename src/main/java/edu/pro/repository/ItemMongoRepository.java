package edu.pro.repository;/*
  @author   george
  @project   course-project
  @class  ItemMongoRepository
  @version  1.0.0 
  @since 23.07.21 - 10.52
*/

import edu.pro.model.Item;
import org.springframework.data.mongodb.core.MongoAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMongoRepository extends MongoRepository<Item, String> {
}
