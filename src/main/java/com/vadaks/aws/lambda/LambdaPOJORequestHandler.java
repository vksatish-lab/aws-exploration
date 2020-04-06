package com.vadaks.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.vadaks.aws.model.LambdaRequest;

/**
 * Hello world using lambda function
 */
public class LambdaPOJORequestHandler implements RequestHandler<LambdaRequest, String> {
    public String handleRequest(LambdaRequest input, Context context) {
        context.getLogger().log("Input: " + input.getName());
        return "Hello World - " + input.getName();
    }
}
