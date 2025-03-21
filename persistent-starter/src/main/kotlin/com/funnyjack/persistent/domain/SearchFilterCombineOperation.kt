package com.hkmci.web.bms2.persistent.domain

import org.springframework.data.jpa.domain.Specification

enum class SearchFilterCombineOperation {
    AND,
    OR;

    fun <T> toOperation(): Specification<T>.(Specification<T>) -> Specification<T> =
        when (this) {
            AND -> Specification<T>::and
            OR -> Specification<T>::or
        }
}
