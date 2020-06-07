package com.rsp;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AppHandler implements RequestHandler<Map<String, String>, String> {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public String handleRequest(Map<String, String> input, Context context) {
        LambdaLogger logger = context.getLogger();
        String response = new String("200 OK AAAHHH");
        // log execution details
        logger.log("ENVIRONMENT VARIABLES: " + gson.toJson(System.getenv()));
        return response;
    }

}