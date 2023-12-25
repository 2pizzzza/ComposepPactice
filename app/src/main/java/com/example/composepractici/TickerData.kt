package com.example.composepractici
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TickerData(
    @SerialName("s") val symbol: String,
    @SerialName("c") val price: String,
)
