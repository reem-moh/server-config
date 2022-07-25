package com.ServerConfig.ServerConfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ServerConfigApplication

fun main(args: Array<String>) {
	runApplication<ServerConfigApplication>(*args)
}
