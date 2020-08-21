package edu.escuelaing.arem;


import Deviation.DeviationApp;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author daniel
 */
public class SparkWebApp {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Deviation</h2>"
                +"<h3>Esta aplicación implemeta una solución para calcular la desviación estandar y el promedio de una serie "
                + "de numeros se parados por comas o espacios, los calculos se hacen usando listas encadenadas de diseño propio</h3>"
                + "<form action=\"/results\">"
                + "  Valores:<br>"
                + "  <input type=\"text\" name=\"Valores\" value=\"1,2,3,4,5\">"
                + "  <br><br>"
                + "  <input type=\"submit\" name=\"Deviation\" value=\"Mean\">"
                + "  <br><br>"
                + "  <input type=\"submit\" name=\"Mean\" value=\"Deviation\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static double resultsPage(Request req, Response res) {
        DeviationApp app = new DeviationApp(req.queryParams("Valores"));
        if (req.queryParams("Deviation")==null){
            return app.deviation();
        }
        else if(req.queryParams("Mean")==null){
            return app.mean();
        }
        return 0;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}