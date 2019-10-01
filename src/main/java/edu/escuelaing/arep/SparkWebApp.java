package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.LinkedList;
import org.apache.log4j.BasicConfigurator;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebApp {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        port(getPort());
        get("/", (req, res) -> index(req, res));
        get("/respuesta", (req, res) -> respuesta(req, res));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080; //returns default port if heroku-port isn't set (i.e. on localhost)
    }   

    private static String index(Request rq, Response rp) {
        String pagina = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>\n"
                + "<h1>Calculadora de cuadrados </h1>\n"
                + "<p>Dado un numero n, este programa calcula el cuadrado del numero</p>\n"
                + "<form action=\"/respuesta\">"
                + "Ingrese un numero:<br>\n"
                + "<input type=\"text\" name=\"value\" placeholder=\"numero\"><br>\n"
                + "<input type=\"submit\" value=\"Calcular\">\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>\n";
        return pagina;
    }

    private static String respuesta(Request rq, Response rp) throws IOException {
        String path = "https://fz9rdx89za.execute-api.us-east-1.amazonaws.com/Beta?value=" + rq.queryParams("value");

        URL url = new URL(path);
        String data = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                data += inputLine;
            }
        } catch (IOException x) {
        }
        

        String pagina = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h1>Resultados</h1>\n"
                +  rq.queryParams("value") + " al  cuadrado es:"+ data +"<br>"//+ media 
                + "</body>"
                + "</html>";
        return pagina;
    }

}
