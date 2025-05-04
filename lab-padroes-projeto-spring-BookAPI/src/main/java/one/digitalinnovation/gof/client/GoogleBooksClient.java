package one.digitalinnovation.gof.client;

import one.digitalinnovation.gof.model.GoogleBooksResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "googleBooksClient", url = "https://www.googleapis.com/books/v1")
public interface GoogleBooksClient {
    @GetMapping("/volumes")
    GoogleBooksResponse searchBooks(
            @RequestParam("q") String query,
            @RequestParam(value = "maxResults", defaultValue = "1") int maxResults
    );
}

