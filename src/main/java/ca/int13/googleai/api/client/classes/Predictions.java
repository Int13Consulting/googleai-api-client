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
public class Predictions {
    private ArrayList<Prediction> predictions;

    /**
     * @return the predictions
     */
    public ArrayList<Prediction> getPredictions() {
        return predictions;
    }

    /**
     * @param predictions the predictions to set
     */
    public void setPredictions(ArrayList<Prediction> predictions) {
        this.predictions = predictions;
    }
}
