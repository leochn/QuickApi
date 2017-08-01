package com.vnext.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 工号
     */
    @Column(name = "user_no")
    private String userNo;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 用户类型[0:user,1:admin,2:super]
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 用户头像
     */
    private String photo;

    /**
     * 最后登陆IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 最后登陆时间
     */
    @Column(name = "login_time_last")
    private Date loginTimeLast;

    /**
     * 是否可登录[1:允许,0:不允许]
     */
    @Column(name = "login_flag")
    private String loginFlag;

    /**
     * 创建者id
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者id
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记[1:删除]
     */
    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "ASD")
    private Integer asd;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取工号
     *
     * @return user_no - 工号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置工号
     *
     * @param userNo 工号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取用户类型[0:user,1:admin,2:super]
     *
     * @return user_type - 用户类型[0:user,1:admin,2:super]
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型[0:user,1:admin,2:super]
     *
     * @param userType 用户类型[0:user,1:admin,2:super]
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取用户头像
     *
     * @return photo - 用户头像
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置用户头像
     *
     * @param photo 用户头像
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 获取最后登陆IP
     *
     * @return login_ip - 最后登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登陆IP
     *
     * @param loginIp 最后登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取最后登陆时间
     *
     * @return login_time_last - 最后登陆时间
     */
    public Date getLoginTimeLast() {
        return loginTimeLast;
    }

    /**
     * 设置最后登陆时间
     *
     * @param loginTimeLast 最后登陆时间
     */
    public void setLoginTimeLast(Date loginTimeLast) {
        this.loginTimeLast = loginTimeLast;
    }

    /**
     * 获取是否可登录[1:允许,0:不允许]
     *
     * @return login_flag - 是否可登录[1:允许,0:不允许]
     */
    public String getLoginFlag() {
        return loginFlag;
    }

    /**
     * 设置是否可登录[1:允许,0:不允许]
     *
     * @param loginFlag 是否可登录[1:允许,0:不允许]
     */
    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    /**
     * 获取创建者id
     *
     * @return create_by - 创建者id
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者id
     *
     * @param createBy 创建者id
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新者id
     *
     * @return update_by - 更新者id
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者id
     *
     * @param updateBy 更新者id
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取删除标记[1:删除]
     *
     * @return del_flag - 删除标记[1:删除]
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记[1:删除]
     *
     * @param delFlag 删除标记[1:删除]
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return ASD
     */
    public Integer getAsd() {
        return asd;
    }

    /**
     * @param asd
     */
    public void setAsd(Integer asd) {
        this.asd = asd;
    }
}