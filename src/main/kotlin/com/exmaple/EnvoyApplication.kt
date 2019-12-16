package com.exmaple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EnvoyApplication

fun main(args: Array<String>) {
    runApplication<EnvoyApplication>(*args)
}
