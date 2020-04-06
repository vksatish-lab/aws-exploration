package com.vadaks.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.vadaks.aws.model.Request;
import com.vadaks.aws.model.Student;

/**
 * Sample lamda function & api gateway usage.
 */
public class StudentApp implements RequestHandler<Request, Student> {

    public Student handleRequest(
            Request request, Context context) {
        context.getLogger().log("Request received... - " + request.getHttpMethod());
        switch (request.getHttpMethod()) {
            case "GET":
                return new Student(request.getId(), "Satish");
            case "POST":
                return request.getStudent();
            default:
                context.getLogger().log("Invalid method... - " + request.getHttpMethod());
                return null;
        }
    }
}

