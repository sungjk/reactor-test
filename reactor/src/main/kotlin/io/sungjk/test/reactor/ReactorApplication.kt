package io.sungjk.test.reactor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactorApplication

fun main(args: Array<String>) {
	runApplication<ReactorApplication>(*args)
}

data class Result(val result: Double)
data class RandomNumber(val number: Double)
