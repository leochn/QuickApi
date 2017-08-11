package com.vnext.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "service_values_today")
public class ServiceValuesToday {
    @Column(name = "ID_DEVICE")
    private String idDevice;

    @Column(name = "ID_SERVICE")
    private String idService;

    @Column(name = "TAG_NAME")
    private String tagName;

    @Column(name = "DATE_TIME")
    private Date dateTime;

    @Column(name = "PV")
    private Float pv;

    @Column(name = "EU")
    private String eu;

    /**
     * @return ID_DEVICE
     */
    public String getIdDevice() {
        return idDevice;
    }

    /**
     * @param idDevice
     */
    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    /**
     * @return ID_SERVICE
     */
    public String getIdService() {
        return idService;
    }

    /**
     * @param idService
     */
    public void setIdService(String idService) {
        this.idService = idService;
    }

    /**
     * @return TAG_NAME
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return DATE_TIME
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return PV
     */
    public Float getPv() {
        return pv;
    }

    /**
     * @param pv
     */
    public void setPv(Float pv) {
        this.pv = pv;
    }

    /**
     * @return EU
     */
    public String getEu() {
        return eu;
    }

    /**
     * @param eu
     */
    public void setEu(String eu) {
        this.eu = eu;
    }
}