package br.com.tromanini.springdatamongodbreactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataMongodbReactiveApplication

fun main(args: Array<String>) {
	runApplication<SpringDataMongodbReactiveApplication>(*args)
}
