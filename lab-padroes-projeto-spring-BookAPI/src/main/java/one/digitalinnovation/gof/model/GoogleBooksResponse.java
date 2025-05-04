package one.digitalinnovation.gof.model;

import lombok.Data;
import java.util.List;

@Data
public class GoogleBooksResponse {
    private List<Item> items;

    @Data
    public static class Item {
        private VolumeInfo volumeInfo;
    }

    @Data
    public static class VolumeInfo {
        private String title;
        private List<String> authors;
        private String publisher;
        private Integer pageCount;
        private String publishedDate;
        private String description;
        private List<IndustryIdentifier> industryIdentifiers;
    }

    @Data
    public static class IndustryIdentifier {
        private String type;  // "ISBN_10" ou "ISBN_13"
        private String identifier;
    }
}
