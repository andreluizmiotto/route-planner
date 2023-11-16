package com.br.logistics.routeplanner.controller

import com.br.logistics.routeplanner.dto.RoutePlannerResponse
import com.br.logistics.routeplanner.service.RoutePlannerService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("/webservices/api/v1/")
class RoutePlannerController(private val service: RoutePlannerService) {

    @GetMapping("/find-best-route")
    fun findBestRoute(): ResponseEntity<RoutePlannerResponse> {
        return try {
            val response = service.findBestRoute()
            ResponseEntity.ok(response)
        } catch (exception: Exception) {
            println("Error: ${exception.message}")
            ResponseEntity.internalServerError().body(
                    RoutePlannerResponse(message = "Error: ${exception.message}"))
        }
    }

}