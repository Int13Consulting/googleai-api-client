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

import java.util.ArrayList;

/**
 *
 * @author mgamble
 */
public class PredictRequest {
    private ArrayList<Instance> instances;
    private Parameters parameters;

    /**
     * @return the instances
     */
    public ArrayList<Instance> getInstances() {
        return instances;
    }

    /**
     * @param instances the instances to set
     */
    public void setInstances(ArrayList<Instance> instances) {
        this.instances = instances;
    }

    public void addInstace(Instance instance) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instance);
    }
    /**
     * @return the parameters
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

}
