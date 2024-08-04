package dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "partOfSpeech",
        "definitions",
        "synonyms",
        "antonyms"
})
@Generated("jsonschema2pojo")
public class Meaning {

    @JsonProperty("partOfSpeech")
    private String partOfSpeech;
    @JsonProperty("definitions")
    private List<Definition> definitions;
    @JsonProperty("synonyms")
    private List<String> synonyms;
    @JsonProperty("antonyms")
    private List<Object> antonyms;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("partOfSpeech")
    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    @JsonProperty("partOfSpeech")
    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    @JsonProperty("definitions")
    public List<Definition> getDefinitions() {
        return definitions;
    }

    @JsonProperty("definitions")
    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @JsonProperty("synonyms")
    public List<String> getSynonyms() {
        return synonyms;
    }

    @JsonProperty("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    @JsonProperty("antonyms")
    public List<Object> getAntonyms() {
        return antonyms;
    }

    @JsonProperty("antonyms")
    public void setAntonyms(List<Object> antonyms) {
        this.antonyms = antonyms;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}