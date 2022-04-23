package com.example.swing.practice3

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class SwingPractice3Application

fun main(args: Array<String>) {
    SpringApplicationBuilder(SwingPractice3Application::class.java)
        .headless(false)
        .web(WebApplicationType.NONE)
        .run("")
}
