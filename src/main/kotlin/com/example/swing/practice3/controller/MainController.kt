package com.example.swing.practice3.controller

import com.example.swing.practice3.view.MainForm
import org.springframework.stereotype.Controller
import javax.annotation.PostConstruct
import javax.swing.JFrame

@Controller
class MainController : JFrame("my title") {

    private var mainForm: MainForm? = null

    @PostConstruct
    fun initialize() {
        this.mainForm = MainForm()
        this.contentPane = mainForm!!.mainPanel
        this.defaultCloseOperation = EXIT_ON_CLOSE

        this.pack()

        this.isVisible = true
    }
}
