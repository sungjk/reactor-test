package io.sungjk.test.randomservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RandomServiceApplication

fun main(args: Array<String>) {
	runApplication<RandomServiceApplication>(*args)
}
