package com.br.logistics.routeplanner.dto.route.response

data class RouteResult(
        val waypoints: List<Waypoint>,
        val distance: String,
        val time: String,
        val interconnections: List<Interconnection>,
        val description: String,
        val timeBreakdown: TimeBreakdown
)