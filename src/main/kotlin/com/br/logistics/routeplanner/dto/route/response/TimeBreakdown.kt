package com.br.logistics.routeplanner.dto.route.response

data class TimeBreakdown(
        val driving: Int,
        val service: Int,
        val rest: Int,
        val waiting: Int
)