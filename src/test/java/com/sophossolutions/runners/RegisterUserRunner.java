package com.sophossolutions.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        glue = "com/sophossolutions/stepdefinitions",
        features = {
                "C:\\Users\\juan.sanchezc\\IdeaProjects\\ProyectoPaginaRopa\\src\\test\\resources\\features\\RegisterUser.feature",
                "C:\\Users\\juan.sanchezc\\IdeaProjects\\ProyectoPaginaRopa\\src\\test\\resources\\features\\LoginUser.feature",
                "C:\\Users\\juan.sanchezc\\IdeaProjects\\ProyectoPaginaRopa\\src\\test\\resources\\features\\ValidationPages.feature"
                    },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TestCase6"
)

public class RegisterUserRunner {
}
