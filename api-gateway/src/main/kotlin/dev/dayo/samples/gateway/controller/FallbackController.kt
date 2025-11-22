package dev.dayozoe.samples.gateway.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import dev.dayozoe.samples.gateway.model.GatewayResponse
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/fallback")
class FallbackController {

    private var id: Int = 0

    @PostMapping("/test")
    fun fallback(): Mono<GatewayResponse> = Mono.just(GatewayResponse(++id, "I'm fallback!"))
}