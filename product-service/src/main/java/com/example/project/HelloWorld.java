package com.example.project;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class HelloWorld extends WebPage {

    public HelloWorld() {
        add(new Label("message", Model.of("Hello, Wicket!")));
    }
}
