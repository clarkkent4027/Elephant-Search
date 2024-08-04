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
        "word",
        "phonetic",
        "phonetics",
        "meanings",
        "sourceUrls"
})
@Generated("jsonschema2pojo")
public class ElephantDTO {

    @JsonProperty("word")
    private String word;
    @JsonProperty("phonetic")
    private String phonetic;
    @JsonProperty("phonetics")
    private List<Phonetic> phonetics;
    @JsonProperty("meanings")
    private List<Meaning> meanings;
    @JsonProperty("sourceUrls")
    private List<String> sourceUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("word")
    public String getWord() {
        return word;
    }

    @JsonProperty("word")
    public void setWord(String word) {
        this.word = word;
    }

    @JsonProperty("phonetic")
    public String getPhonetic() {
        return phonetic;
    }

    @JsonProperty("phonetic")
    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    @JsonProperty("phonetics")
    public List<Phonetic> getPhonetics() {
        return phonetics;
    }

    @JsonProperty("phonetics")
    public void setPhonetics(List<Phonetic> phonetics) {
        this.phonetics = phonetics;
    }

    @JsonProperty("meanings")
    public List<Meaning> getMeanings() {
        return meanings;
    }

    @JsonProperty("meanings")
    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }



    @JsonProperty("sourceUrls")
    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    @JsonProperty("sourceUrls")
    public void setSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
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