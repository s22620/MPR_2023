package pl.pjatk.daggi.demo.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Pizza {
    private String name;
    private Double price;
}
