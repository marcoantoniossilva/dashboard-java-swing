/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

/**
 *
 * @author marco
 */
public class GraphQLDTO {
    
    private Map<String,Object> data;

    public void setData(Map<String,Object> data) {
        this.data = data;
    }

    public <T> T getData(Class<T> objectType) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(data, objectType);
    }
    
    
}
