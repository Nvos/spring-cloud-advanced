package czort

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
class ConfigurationApplication

fun main(args: Array<String>) {
    runApplication<ConfigurationApplication>(*args)
}
