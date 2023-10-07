package pl.pjatk.daggi.demo.pizza;

import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.pjatk.daggi.demo.pizza.model.Order;
import pl.pjatk.daggi.demo.pizza.model.Pizza;

import java.util.List;

@NoArgsConstructor
public class PizzaService {

    private List<Pizza> pizzaList = List.of(
      (new Pizza("Margherita", 40.0)),
        (new Pizza("Funghi", 42.5)),
        (new Pizza("Szpinakowa", 44.0)),
        (new Pizza("Wegetariańska", 46.5)),
        (new Pizza("Full Wypas", 55.0)));

    private int currentOrderNumber = 1;
    private static final Logger logger = LogManager.getLogger(PizzaService.class);

    public Order makeOrder(Pizza pizza){
        logger.info("makeOrder( argument: " + pizza + " )" );
        if (!pizzaList.contains(pizza)){
            throw new PizzaNotFoundException("Nie ma takiej pizzy w menu.");
        }

        Order order = new Order(currentOrderNumber, pizza, pizza.getPrice());
        currentOrderNumber ++;

        return order;
    }

    public List<Pizza> getAvailablePizzas(){
        logger.info("getAvailablePizzas()");
        return pizzaList;
    }

}
