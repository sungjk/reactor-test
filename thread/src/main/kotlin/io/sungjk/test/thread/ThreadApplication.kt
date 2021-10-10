package io.sungjk.test.thread

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThreadApplication

fun main(args: Array<String>) {
	runApplication<ThreadApplication>(*args)
}

data class RandomNumber(val number: Double)
data class Result(val result: Double)
