/*
Copyright (c) 2023 Int13 Consulting Inc.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package ca.int13.googleai.api.client.classes;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class Parameters {
    @SerializedName("temperature")
    private double temperature;
    
    @SerializedName("maxOutputTokens")
    private int maxOutputTokens;
    
    @SerializedName("topP")
    private double topP;
    
    @SerializedName("topK")
    private double topK;

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the maxOutputTokens
     */
    public int getMaxOutputTokens() {
        return maxOutputTokens;
    }

    /**
     * @param maxOutputTokens the maxOutputTokens to set
     */
    public void setMaxOutputTokens(int maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens;
    }

    /**
     * @return the topP
     */
    public double getTopP() {
        return topP;
    }

    /**
     * @param topP the topP to set
     */
    public void setTopP(double topP) {
        this.topP = topP;
    }

    /**
     * @return the topK
     */
    public double getTopK() {
        return topK;
    }

    /**
     * @param topK the topK to set
     */
    public void setTopK(double topK) {
        this.topK = topK;
    }
    
}
