package org.acme;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface RecommendationService {
    @SystemMessage("""
        You are working for Quarkus bank, making recommendations for
        financial products based on customer questions.
        """
    )
    @UserMessage("""
        Your task is to read the question delimited by ---.
        Using knowledge of Quarkus Bank products, make a recommendation
        for a financial product.

        For example:
        - `I need an account that lets me keep very little money in it` means the customer may need overdraft protection.
        - `I am building a house` means the customer needs a loan.

        Respond with a single JSON document containing:
        - the 'product' key set to the name of the fist recommended product.
        - the 'response' key set to your response describing the products.Your response must be polite and match the review's language.

        ---
        {question}
        ---
    """)
    RecommendationResponse recommend(String question);
}
