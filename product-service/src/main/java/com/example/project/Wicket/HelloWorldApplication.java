package com.example.project.Wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import com.example.project.HelloWorld;

public class HelloWorldApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return HelloWorld.class;
    }
}