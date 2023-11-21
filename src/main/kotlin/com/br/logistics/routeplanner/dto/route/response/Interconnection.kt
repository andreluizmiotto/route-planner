package com.br.logistics.routeplanner.dto.route.response

data class Interconnection(
        val fromWaypoint: String,
        val toWaypoint: String,
        val distance: Double,
        val time: Double,
        val rest: Double,
        val waiting: Double
)