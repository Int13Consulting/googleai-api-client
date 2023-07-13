/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.googleai.api.client.classes;

import java.util.ArrayList;

/**
 *
 * @author mgamble
 */
public class Prediction {
    private CitationMetadata citationMetadata;
    private SafetyAttributes safetyAttributes;
    private ArrayList<String> categories;
    private String content;

    /**
     * @return the citationMetadata
     */
    public CitationMetadata getCitationMetadata() {
        return citationMetadata;
    }

    /**
     * @param citationMetadata the citationMetadata to set
     */
    public void setCitationMetadata(CitationMetadata citationMetadata) {
        this.citationMetadata = citationMetadata;
    }

    /**
     * @return the safetyAttributes
     */
    public SafetyAttributes getSafetyAttributes() {
        return safetyAttributes;
    }

    /**
     * @param safetyAttributes the safetyAttributes to set
     */
    public void setSafetyAttributes(SafetyAttributes safetyAttributes) {
        this.safetyAttributes = safetyAttributes;
    }

    /**
     * @return the categories
     */
    public ArrayList<String> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    
}
