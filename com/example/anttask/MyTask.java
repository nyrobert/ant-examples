package com.example.anttask;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MyTask extends Task {
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    public void execute() throws BuildException {
        System.out.println(message);
    }
}
