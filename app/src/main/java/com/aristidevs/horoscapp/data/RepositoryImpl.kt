package com.aristidevs.horoscapp.data

import com.aristidevs.horoscapp.data.network.HoroscopeApiService
import com.aristidevs.horoscapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String) {
        val response = runCatching { apiService.getHoroscope(sign) }.isSuccess
    }
}