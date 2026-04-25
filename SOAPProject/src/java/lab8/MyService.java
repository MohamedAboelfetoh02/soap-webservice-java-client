/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package lab8;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "MyService")
public class MyService {

    @WebMethod(operationName = "addNumbers")
    public int addNumbers(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a + b;
    }

    @WebMethod(operationName = "generateLogSequence")
    public double[] generateLogSequence(@WebParam(name = "n") int n, @WebParam(name = "start") double start, @WebParam(name = "end") double end) {
        double[] sequence = new double[n];
        double step = (end - start) / (n - 1);
        for (int i = 0; i < n; i++) {
            sequence[i] = 0.5 * Math.log10(start + i * step);
        }
        return sequence;
    }

    @WebMethod(operationName = "disturbSequence")
    public double[] disturbSequence(@WebParam(name = "values") double[] values, @WebParam(name = "stddev") double stddev) {
        double[] disturbed = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            disturbed[i] = values[i] + stddev * (Math.random() - 0.5);
        }
        return disturbed;
    }
}
