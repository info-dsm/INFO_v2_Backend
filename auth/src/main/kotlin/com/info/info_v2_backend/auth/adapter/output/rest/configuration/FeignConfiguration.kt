package com.info.info_v2_backend.auth.adapter.output.rest.configuration

import com.info.info_v2_backend.common.auth.HeaderProperty
import com.info.info_v2_backend.common.user.Role
import feign.RequestInterceptor
import feign.RequestTemplate
import feign.codec.Decoder
import feign.codec.Encoder
import feign.jaxb.JAXBContextFactory
import feign.jaxb.JAXBDecoder
import feign.jaxb.JAXBEncoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeignConfiguration {
    @Bean
    fun requestInterceptor(): RequestInterceptor? {
        return RequestInterceptor { requestTemplate: RequestTemplate ->
            requestTemplate.header(
                HeaderProperty.AUTH_LEVEL,
                Role.SYSTEM.mean)
        }
    }

    @Bean
    fun encoder(): Encoder? {
        return JAXBEncoder(
            JAXBContextFactory.Builder()
                .withMarshallerJAXBEncoding("UTF-8")
                .build()
        )
    }

    @Bean
    fun decoder(): Decoder? {
        return JAXBDecoder(
            JAXBContextFactory.Builder()
                .withMarshallerJAXBEncoding("UTF-8")
                .build()
        )
    }

}