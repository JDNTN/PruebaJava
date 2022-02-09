package com.prueba.anton.file;

import com.prueba.anton.dao.EmpresaDao;
import com.prueba.anton.dao.SucursalDao;
import com.prueba.anton.dominio.Empresa;
import com.prueba.anton.dominio.Sucursal;
import com.prueba.anton.service.SucursalService;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author dntn
 */
public class ProcesamientoArchivo {
    
    
    public void archivo(MultipartFile file){                        
        JSONParser jsonParse = new JSONParser();
        try {
            String json = new String(file.getBytes());
            Object ob = jsonParse.parse(new StringReader(json));    
            JSONObject obj= (JSONObject) ob;
            obtenerEmpresas(obj);
        } catch (IOException ex) {
            Logger.getLogger(ProcesamientoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ProcesamientoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Autowired
    SucursalDao sucursalService;
        
    
    private void obtenerEmpresas(JSONObject object){                        
        JSONObject empresa = (JSONObject) object.get("empresa");
        System.out.println("EMPRESA");
        System.out.println("Nombre: "+ empresa.get("nombre").toString());
        System.out.println("Pais: "+ empresa.get("pais").toString());
        ObtenerSucursales(empresa);       
    }
    
    private void ObtenerSucursales(JSONObject object){
        System.out.println("SUCURSALES");      
        JSONArray sucursales = (JSONArray) object.get("sucursales");        
        for(Object ob: sucursales){            
            JSONObject sucursal = (JSONObject) ob;
            System.out.println("Nombre: "+ sucursal.get("nombre").toString());
            System.out.println("Direccion: "+ sucursal.get("direccion").toString());
            System.out.println("Telefono: "+ sucursal.get("telefono").toString());
            ObtenerColaboladores(sucursal);
        }
    }
    
    private void ObtenerColaboladores(JSONObject object){
        JSONArray personas = (JSONArray) object.get("colaboradores");
        System.out.println("COLABOLADORES");
        for(Object ob: personas){
           JSONObject colabolador = (JSONObject) ob;  
            System.out.println("CUI: "+colabolador.get("CUI").toString());
            System.out.println("Nombre: "+colabolador.get("nombre").toString());
        }
    }
}
