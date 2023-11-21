package com.br.logistics.routeplanner.service

import com.br.logistics.routeplanner.dto.route.response.RouteResponse
import org.springframework.stereotype.Service

@Service
class RoutePlannerService {

    fun findBestRoute(): RouteResponse {
        return RouteResponse(message = "Hello World!")
    }
}