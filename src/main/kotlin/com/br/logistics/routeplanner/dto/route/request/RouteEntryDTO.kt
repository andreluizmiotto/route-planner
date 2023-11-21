package com.br.logistics.routeplanner.dto.route.request

import java.time.OffsetDateTime

data class RouteEntryDTO(
        val start: Location,
        val destinations: List<Location>,
        val end: Location,
        val improveFor: String,
        val departure: OffsetDateTime,
        val mode: Mode
)