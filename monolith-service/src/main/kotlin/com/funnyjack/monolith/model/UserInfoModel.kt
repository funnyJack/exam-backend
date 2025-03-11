package com.funnyjack.monolith.model

import com.funnyjack.persistent.dsl.combineSpecification
import com.funnyjack.persistent.dsl.equal
import com.funnyjack.persistent.dsl.like
import com.funnyjack.persistent.entity.UserInfo
import com.hkmci.web.bms2.persistent.domain.SearchFilterCombineOperation
import org.springframework.data.jpa.domain.Specification

data class UserInfoSearchFilter(
    val usernameLike: String? = null,
) {
    fun toSpecification(
        searchFilterCombineOperation: SearchFilterCombineOperation
    ): Specification<UserInfo> {
        val usernameLike = usernameLike?.ifBlank { null }
        return combineSpecification(
            listOf(
                usernameLike?.let { UserInfo::username.like("%$it%") },
            ),
            searchFilterCombineOperation.toOperation()
        )
    }
}

data class UserInfoViewModel(
    val id: Long,
    val username: String,
    val password: String
)

fun UserInfo.toViewModel() = UserInfoViewModel(
    id = id!!,
    username = username,
    password = password,
)
