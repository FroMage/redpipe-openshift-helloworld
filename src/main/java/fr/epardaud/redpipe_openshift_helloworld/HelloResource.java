package fr.epardaud.redpipe_openshift_helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import rx.Single;

@Path("/")
public class HelloResource {
  @GET
  public String hello() {
    return "Hello World";
  }
  
  @Path("reactive")
  @GET
  public Single<String> helloReactive() {
    return Single.just("Hello Reactive World");
  }
}