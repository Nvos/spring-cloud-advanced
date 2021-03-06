package czort

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class AdminServiceApplication

fun main(args: Array<String>) {
    runApplication<AdminServiceApplication>(*args)
}
