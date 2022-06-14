package com.example.dictionary.models;

import java.util.List;

public class Meanings {
    String partOfSpeech= "";
    List<Definitions> definition=null;

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<Definitions> getDefinition() {
        return definition;
    }

    public void setDefinition(List<Definitions> definition) {
        this.definition = definition;
    }
}
