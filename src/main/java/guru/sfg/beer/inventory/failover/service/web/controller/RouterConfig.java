package guru.sfg.beer.inventory.failover.service.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Slf4j
@Configuration
public class RouterConfig {
    public RouterConfig() {
        log.debug(">>>>>> RouterConfig");
    }

    @Bean
    public RouterFunction<ServerResponse> inventoryRoute(InventoryHandler handler) {
        log.debug(">>>>>> inventoryRoute");

        RouterFunction<ServerResponse> route = route(GET("/inventory-failover")
                .and(accept(MediaType.APPLICATION_JSON)), handler::listInventory);
        log.debug("Route = {}", route);
        return route;
    }
}
