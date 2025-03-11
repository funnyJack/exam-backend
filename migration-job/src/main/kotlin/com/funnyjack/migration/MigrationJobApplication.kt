package com.funnyjack.migration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MigrationJobApplication

fun main(args: Array<String>) {
    runApplication<MigrationJobApplication>(*args)
}
