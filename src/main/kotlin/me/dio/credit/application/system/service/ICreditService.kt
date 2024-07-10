package me.dio.credit.application.system.service

import jakarta.persistence.Id
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit) : Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode:UUID):Credit
}