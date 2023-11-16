package com.br.logistics.routeplanner.service

import com.br.logistics.routeplanner.dto.RoutePlannerResponse
import org.springframework.stereotype.Service

@Service
class RoutePlannerService {

    fun findBestRoute(): RoutePlannerResponse {
        return RoutePlannerResponse(message = "Hello World!")
    }
}