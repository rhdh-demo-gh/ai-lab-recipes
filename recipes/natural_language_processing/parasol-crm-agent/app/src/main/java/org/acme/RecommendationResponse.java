package org.acme;
import com.fasterxml.jackson.annotation.JsonCreator;

public record RecommendationResponse(String product, String response) {

    @JsonCreator
    public RecommendationResponse {
    }

}