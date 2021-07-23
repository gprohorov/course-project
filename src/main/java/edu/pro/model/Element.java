package edu.pro.model;/*
  @author   george
  @project   course-project
  @class  Element
  @version  1.0.0 
  @since 18.07.21 - 21.02
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Element {
    @Id
    private String id;
    private String name;
    private Item item;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Element(String name, Item item, String desc) {
        this.name = name;
        this.item = item;
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;
        Element element = (Element) o;
        return getId().equals(element.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
