package ar.edu.undav.soap.ws;
import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/player", new PlayerWebService());
	}

}
