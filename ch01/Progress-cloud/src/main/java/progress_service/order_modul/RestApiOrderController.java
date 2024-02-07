package progress_service.order_modul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RestApiOrderController {
    private List<Ordering> orderList = new ArrayList<>();

    @GetMapping ("/orderList")
    Iterable <Ordering> getOrderList() {
        return orderList;
    }

    @GetMapping ("/orderList/{id}")
    Optional <Ordering> getOrderingById(@PathVariable int id) {
        for (Ordering o: orderList) {
            if (o.getId()==id) {
                return Optional.of(o);
            }
        } return Optional.empty();
    }
}
