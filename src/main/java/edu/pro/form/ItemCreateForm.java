package edu.pro.form;/*
  @author   george
  @project   course-project
  @class  ItemForm
  @version  1.0.0 
  @since 22.07.21 - 11.42
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCreateForm {
    private String name;
    private String desc;

}
