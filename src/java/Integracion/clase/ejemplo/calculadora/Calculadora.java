/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion.clase.ejemplo.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andres S
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public double hello(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return num1 + num2;
    }
}
