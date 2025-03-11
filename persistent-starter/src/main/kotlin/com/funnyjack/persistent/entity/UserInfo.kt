package com.funnyjack.persistent.entity

import jakarta.persistence.*
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import java.util.*

@Entity
class UserInfo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 11, nullable = false)
    val username: String,
    @Column(length = 11, nullable = false)
    val password: String,
  )

interface UserInfoRepository : PagingAndSortingRepository<UserInfo, Long>, CrudRepository<UserInfo, Long>
