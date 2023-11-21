package com.br.logistics.routeplanner.controller

import com.br.logistics.routeplanner.dto.route.response.RouteResponse
import com.br.logistics.routeplanner.service.RoutePlannerService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/webservices/api/v1/")
class RoutePlannerController(private val service: RoutePlannerService) {

    @GetMapping("/find-best-route")
    fun findBestRoute(): ResponseEntity<RouteResponse> {
        return try {
            ResponseEntity.ok(service.findBestRoute())
        } catch (exception: Exception) {
            println("Error: ${exception.message}")
            ResponseEntity.internalServerError().body(
                    RouteResponse(message = "Error: ${exception.message}"))
        }
    }

}