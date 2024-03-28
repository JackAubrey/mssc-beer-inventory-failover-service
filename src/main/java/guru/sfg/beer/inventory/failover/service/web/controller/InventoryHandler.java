package guru.sfg.beer.inventory.failover.service.web.controller;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
public class InventoryHandler {
    public Mono<ServerResponse> listInventory(ServerRequest request) {
        log.debug("########## listInventory");
        BeerInventoryDto dto = BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(new UUID(0,0))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(List.of(dto)), List.class);
    }
}
