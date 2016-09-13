import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/resume", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Job> newResume = request.session().attribute("jobs");
      if (newResume == null) {
        newResume = new ArrayList<Job>();
        request.session().attribute("jobs", newResume);
      }
      String title = request.queryParams("title");
      String company = request.queryParams("company");
      String city = request.queryParams("city");
      String state = request.queryParams("state");
      String description1 = request.queryParams("description1");
      String description2 = request.queryParams("description2");
      String description3 = request.queryParams("description3");
      String start = request.queryParams("start");
      String end = request.queryParams("end");
      Job myJob = new Job(title, company, city, state, description1, description2, description3, start, end);
      newResume.add(myJob);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



    get("/resume", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobs", request.session().attribute("jobs"));
      model.put("template", "templates/resume.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
