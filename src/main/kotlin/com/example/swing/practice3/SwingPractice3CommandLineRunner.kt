package com.example.swing.practice3

import com.example.swing.practice3.controller.MainController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.awt.EventQueue

@Component
class SwingPractice3CommandLineRunner : CommandLineRunner {

    @Autowired
    private lateinit var mainController: MainController

    override fun run(vararg args: String?) {
        EventQueue.invokeLater {
            mainController.isVisible = true
        }
    }
}
