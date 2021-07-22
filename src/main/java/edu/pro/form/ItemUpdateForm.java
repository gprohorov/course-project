package edu.pro.form;/*
  @author   george
  @project   course-project
  @class  ItemUpdateForm
  @version  1.0.0 
  @since 22.07.21 - 12.20
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemUpdateForm {
    private String id;
    private String name;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
