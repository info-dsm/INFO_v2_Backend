package com.info.info_v2_backend.auth.adapter.output.rest.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.info.info_v2_backend.common.exception.BusinessException
import com.info.info_v2_backend.common.exception.ErrorCode
import com.info.info_v2_backend.common.exception.ErrorResponse
import feign.Response
import feign.codec.ErrorDecoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.lang.Exception


@Configuration
class FeignErrorDecoder(
): ErrorDecoder {
    private val objectMapper = ObjectMapper()

    @Bean
    override fun decode(methodKey: String?, response: Response): Exception {
        val response = parse(response)
        return BusinessException(response?.message,
            ErrorCode.values().filter { it.code == (response?.code ?: ErrorCode.FEIGN_ERROR.code) }.first()
        )
    }

    private fun parse(response: Response): ErrorResponse? {
        return runCatching {
            objectMapper.readValue(response.body().asInputStream(), ErrorResponse::class.java)
        }.getOrNull()
    }

}