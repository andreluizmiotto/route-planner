package com.br.logistics.routeplanner.dto.route.request

data class Mode(
        val type: String,
        val vehicle: String,
        val traffic: Traffic
)