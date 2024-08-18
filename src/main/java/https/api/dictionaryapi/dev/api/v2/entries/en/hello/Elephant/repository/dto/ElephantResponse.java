package https.api.dictionaryapi.dev.api.v2.entries.en.hello.Elephant.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ElephantResponse {

    private List<Definition> definitions = null;

    @JsonProperty("definitions")
    public List<Definition> getDefinitions() {
        return definitions;
    }

    @JsonProperty("definitions")
    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }
}
