package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/recommendation")
public class RecommendationResource {

    @Inject
    RecommendationService service;

    @POST
    public RecommendationResponse respond(String question) {
        return service.recommend(question);
    }

}
