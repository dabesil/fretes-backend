package com.dabesil.system.dto;

import java.io.Serializable;

import com.dabesil.system.domain.Localization;


public class LocalizationDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String cidade;
    private Double latitude;
    private Double longitude;


    public LocalizationDTO() {
    }

    public LocalizationDTO(Localization localization) {
        id = localization.getId();
        cidade = localization.getCidade();
        latitude = localization.getLatitude();
        longitude = localization.getLongitude();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
