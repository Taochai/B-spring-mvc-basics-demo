package com.thoughtworks.capacity.gtb.demo5;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

  @NotNull(message = "id must not be null")
  private Integer id;
  @NotBlank(message = "type must not be blank")
  private String type;
  @NotBlank(message = "color must not be blank")
  private String color;
}

