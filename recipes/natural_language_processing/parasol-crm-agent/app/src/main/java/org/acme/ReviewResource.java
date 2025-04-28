package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/review")
public class ReviewResource {

    @Inject
    TriageService triage;

    record Review(String review) {
      // User text
    }

    @POST
    public TriagedReview triage(Review review) {
        return triage.triage(review.review());
    }

}
