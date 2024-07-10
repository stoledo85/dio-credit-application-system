package me.dio.credit.application.system.repository

import me.dio.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository //Só para carater de estudo, pois nao é necessario
interface CreditRepository: JpaRepository<Credit, Long>