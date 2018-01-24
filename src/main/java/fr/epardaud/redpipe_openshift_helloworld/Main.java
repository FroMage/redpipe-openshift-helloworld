package fr.epardaud.redpipe_openshift_helloworld;

import io.vertx.core.json.JsonObject;
import net.redpipe.engine.core.Server;

public class Main {
	  public static void main( String[] args ){
	    new Server()
	     .start(new JsonObject().put("http_port", 8080), HelloResource.class)
	     .subscribe(
	        v -> System.err.println("Server started"),
	        x -> x.printStackTrace());
	  }
	}