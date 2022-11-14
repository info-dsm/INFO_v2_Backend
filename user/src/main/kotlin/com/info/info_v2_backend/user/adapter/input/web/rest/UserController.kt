package com.info.info_v2_backend.user.adapter.input.web.rest

import com.info.info_v2_backend.user.adapter.input.web.rest.dto.response.CommonUserDetails
import com.info.info_v2_backend.user.application.port.`in`.LoadCommonUserDetailsUsecase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val loadCommonUserDetailsUsecase: LoadCommonUserDetailsUsecase
) {

    @GetMapping
    fun loadCommonUserDetails(@RequestParam userEmail: String): CommonUserDetails? {
        return loadCommonUserDetailsUsecase.load(userEmail)
    }

    @GetMapping("/exist")
    fun existsUserByEmail(@RequestParam userEmail: String): String? {
        return loadCommonUserDetailsUsecase.load(userEmail)?.username
    }

}