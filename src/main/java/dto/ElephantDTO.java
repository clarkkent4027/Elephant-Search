package dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "definition",
        "synonyms",
        "antonyms",
        "example"
})
@Generated("jsonschema2pojo")
public class ElephantDTO {

    @JsonProperty("definition")
    private String definition;
    @JsonProperty("synonyms")
    private List<Object> synonyms;
    @JsonProperty("antonyms")
    private List<Object> antonyms;
    @JsonProperty("example")
    private String example;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @JsonProperty("synonyms")
    public List<Object> getSynonyms() {
        return synonyms;
    }

    @JsonProperty("synonyms")
    public void setSynonyms(List<Object> synonyms) {
        this.synonyms = synonyms;
    }

}