package com.funnyjack.monolith.service

import com.funnyjack.persistent.entity.UserInfo
import com.funnyjack.persistent.entity.UserInfoRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import kotlin.reflect.KClass

@Service
class UserInfoService(
    private val userInfoRepository: UserInfoRepository
) {
    fun get(id:Long) =  userInfoRepository.findById(id).orElseThrow {
        ResponseStatusException(HttpStatus.NOT_FOUND,"Request ${UserInfo::class.simpleName} not found")
    }
}