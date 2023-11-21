package com.br.logistics.routeplanner.dto.route.response

data class RouteResponse(
        val results: List<RouteResult>,
        val errors: List<String>,
        val processingTimeDesc: String,
        val responseCode: String
) {
    constructor(message: String) : this(
            emptyList(),
            listOf(message),
            "",
            ""
    )
}

