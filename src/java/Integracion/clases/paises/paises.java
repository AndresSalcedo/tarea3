/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion.clases.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;



/**
 *
 * @author Andres S
 */
@WebService(serviceName = "paises")
public class paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ObtenerCiudades")
    public String [] servicio(@WebParam(name = "pais") String pais) {
       
    String[] result = new String[2];    
    //se crea cliente para servicio globalweather
       GlobalWeather gw = new GlobalWeather();
       Airport a = new Airport();   
       //se obtiene cliente soap
       GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
       AirportSoap aSoap = a.getAirportSoap();
       
       //se llama a servicio, llamada se produce de manera sincrona, queda en variable cities
      result[0] = gwSoap.getCitiesByCountry(pais);
      result[1] = aSoap.getAirportInformationByAirportCode(pais);
       
       
               
       return result;
    }
}
