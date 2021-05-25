import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HelloLambda implements RequestHandler<String, String> {

  Gson gson = new GsonBuilder().setPrettyPrinting().create();

  public String handleRequest(String event, Context context) {
    LambdaLogger logger = context.getLogger();
    // process event
    logger.log("EVENT: " + gson.toJson(event));
    logger.log("EVENT TYPE: " + event.getClass().toString());
    return "Success";
  }
}
