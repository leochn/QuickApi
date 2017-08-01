package com.vnext.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

public class Function {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 代码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 备注
     */
    @Column(name = "MEMO")
    private String memo;

    /**
     * 类型：电压、电流、电量、压力、流量、频率、温度、启停状态
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 数据类型
     */
    @Column(name = "DATA_TYPE")
    private String dataType;

    /**
     * 单位
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     * 初始值
     */
    @Column(name = "INIT_VALUE")
    private BigDecimal initValue;

    /**
     * 标准值
     */
    @Column(name = "NORM_VALUE")
    private BigDecimal normValue;

    /**
     * 最小范围
     */
    @Column(name = "MIN_RV")
    private BigDecimal minRv;

    /**
     * 最大范围
     */
    @Column(name = "MAX_RV")
    private BigDecimal maxRv;

    /**
     * 倍率
     */
    @Column(name = "RATIO")
    private BigDecimal ratio;

    /**
     * 是否告警
     */
    @Column(name = "IS_ALARM")
    private Integer isAlarm;

    /**
     * 可否累计
     */
    @Column(name = "IS_CUMULATIVE")
    private Integer isCumulative;

    /**
     * 设置参数
     */
    @Column(name = "IS_PARAM_SETTING")
    private Integer isParamSetting;

    /**
     * 需要响应【控制参数，需终端PLC确认】
     */
    @Column(name = "IS_RESPONSIBLE")
    private Integer isResponsible;

    /**
     * 状态参数
     */
    @Column(name = "IS_PARAM_STATUS")
    private Integer isParamStatus;

    /**
     * 范围条件类
     */
    @Column(name = "IS_RANGEABLE")
    private Integer isRangeable;

    /**
     * 版本
     */
    @Column(name = "VERSION")
    private String version;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取代码
     *
     * @return CODE - 代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置代码
     *
     * @param code 代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取备注
     *
     * @return MEMO - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取类型：电压、电流、电量、压力、流量、频率、温度、启停状态
     *
     * @return TYPE - 类型：电压、电流、电量、压力、流量、频率、温度、启停状态
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型：电压、电流、电量、压力、流量、频率、温度、启停状态
     *
     * @param type 类型：电压、电流、电量、压力、流量、频率、温度、启停状态
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取数据类型
     *
     * @return DATA_TYPE - 数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型
     *
     * @param dataType 数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取单位
     *
     * @return UNIT - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取初始值
     *
     * @return INIT_VALUE - 初始值
     */
    public BigDecimal getInitValue() {
        return initValue;
    }

    /**
     * 设置初始值
     *
     * @param initValue 初始值
     */
    public void setInitValue(BigDecimal initValue) {
        this.initValue = initValue;
    }

    /**
     * 获取标准值
     *
     * @return NORM_VALUE - 标准值
     */
    public BigDecimal getNormValue() {
        return normValue;
    }

    /**
     * 设置标准值
     *
     * @param normValue 标准值
     */
    public void setNormValue(BigDecimal normValue) {
        this.normValue = normValue;
    }

    /**
     * 获取最小范围
     *
     * @return MIN_RV - 最小范围
     */
    public BigDecimal getMinRv() {
        return minRv;
    }

    /**
     * 设置最小范围
     *
     * @param minRv 最小范围
     */
    public void setMinRv(BigDecimal minRv) {
        this.minRv = minRv;
    }

    /**
     * 获取最大范围
     *
     * @return MAX_RV - 最大范围
     */
    public BigDecimal getMaxRv() {
        return maxRv;
    }

    /**
     * 设置最大范围
     *
     * @param maxRv 最大范围
     */
    public void setMaxRv(BigDecimal maxRv) {
        this.maxRv = maxRv;
    }

    /**
     * 获取倍率
     *
     * @return RATIO - 倍率
     */
    public BigDecimal getRatio() {
        return ratio;
    }

    /**
     * 设置倍率
     *
     * @param ratio 倍率
     */
    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取是否告警
     *
     * @return IS_ALARM - 是否告警
     */
    public Integer getIsAlarm() {
        return isAlarm;
    }

    /**
     * 设置是否告警
     *
     * @param isAlarm 是否告警
     */
    public void setIsAlarm(Integer isAlarm) {
        this.isAlarm = isAlarm;
    }

    /**
     * 获取可否累计
     *
     * @return IS_CUMULATIVE - 可否累计
     */
    public Integer getIsCumulative() {
        return isCumulative;
    }

    /**
     * 设置可否累计
     *
     * @param isCumulative 可否累计
     */
    public void setIsCumulative(Integer isCumulative) {
        this.isCumulative = isCumulative;
    }

    /**
     * 获取设置参数
     *
     * @return IS_PARAM_SETTING - 设置参数
     */
    public Integer getIsParamSetting() {
        return isParamSetting;
    }

    /**
     * 设置设置参数
     *
     * @param isParamSetting 设置参数
     */
    public void setIsParamSetting(Integer isParamSetting) {
        this.isParamSetting = isParamSetting;
    }

    /**
     * 获取需要响应【控制参数，需终端PLC确认】
     *
     * @return IS_RESPONSIBLE - 需要响应【控制参数，需终端PLC确认】
     */
    public Integer getIsResponsible() {
        return isResponsible;
    }

    /**
     * 设置需要响应【控制参数，需终端PLC确认】
     *
     * @param isResponsible 需要响应【控制参数，需终端PLC确认】
     */
    public void setIsResponsible(Integer isResponsible) {
        this.isResponsible = isResponsible;
    }

    /**
     * 获取状态参数
     *
     * @return IS_PARAM_STATUS - 状态参数
     */
    public Integer getIsParamStatus() {
        return isParamStatus;
    }

    /**
     * 设置状态参数
     *
     * @param isParamStatus 状态参数
     */
    public void setIsParamStatus(Integer isParamStatus) {
        this.isParamStatus = isParamStatus;
    }

    /**
     * 获取范围条件类
     *
     * @return IS_RANGEABLE - 范围条件类
     */
    public Integer getIsRangeable() {
        return isRangeable;
    }

    /**
     * 设置范围条件类
     *
     * @param isRangeable 范围条件类
     */
    public void setIsRangeable(Integer isRangeable) {
        this.isRangeable = isRangeable;
    }

    /**
     * 获取版本
     *
     * @return VERSION - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
    }
}