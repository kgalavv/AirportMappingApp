import java.util.List;

/**
 * This class contains the entirety of the Airport Path Application
 *
 * @author Kshitij Galav
 */
public class AirportPathApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Aiport Path App");
        List<AirportDataInterface> airports = new AirportLoader().loadFile("./Airports.csv");
        AirportBackEndInterface engine = new AirportBackEnd(airports);
        AirportFrontEndInterface ui = new AirportFrontEnd();
        ui.run(engine);
    }
}