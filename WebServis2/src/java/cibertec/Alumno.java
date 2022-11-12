/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package cibertec;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "Alumno")
public class Alumno {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getInformacion")
    public String getInformacion(@WebParam(name = "nombre") String nombre, @WebParam(name = "codigo") String codigo, @WebParam(name = "correo") String correo) {
      String mensaje ="Bienvenido "+nombre+", tu codigo asignado es "+codigo+", tu correo asinado es "+correo;
      return mensaje;
    }


    }

