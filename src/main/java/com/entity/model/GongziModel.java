package com.entity.model;

import com.entity.GongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 工资姓名
     */
    private String gongziName;


    /**
     * 月份
     */
    private String gongziMonth;


    /**
     * 底薪
     */
    private Double dixinMoney;


    /**
     * 奖金
     */
    private Double jiangjinMoney;


    /**
     * 其他
     */
    private Double qitaMoney;


    /**
     * 五险一金
     */
    private Double wuxianyijinMoney;


    /**
     * 实发
     */
    private Double shifaMoney;


    /**
     * 备注
     */
    private String beizhuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：工资姓名
	 */
    public String getGongziName() {
        return gongziName;
    }


    /**
	 * 设置：工资姓名
	 */
    public void setGongziName(String gongziName) {
        this.gongziName = gongziName;
    }
    /**
	 * 获取：月份
	 */
    public String getGongziMonth() {
        return gongziMonth;
    }


    /**
	 * 设置：月份
	 */
    public void setGongziMonth(String gongziMonth) {
        this.gongziMonth = gongziMonth;
    }
    /**
	 * 获取：底薪
	 */
    public Double getDixinMoney() {
        return dixinMoney;
    }


    /**
	 * 设置：底薪
	 */
    public void setDixinMoney(Double dixinMoney) {
        this.dixinMoney = dixinMoney;
    }
    /**
	 * 获取：奖金
	 */
    public Double getJiangjinMoney() {
        return jiangjinMoney;
    }


    /**
	 * 设置：奖金
	 */
    public void setJiangjinMoney(Double jiangjinMoney) {
        this.jiangjinMoney = jiangjinMoney;
    }
    /**
	 * 获取：其他
	 */
    public Double getQitaMoney() {
        return qitaMoney;
    }


    /**
	 * 设置：其他
	 */
    public void setQitaMoney(Double qitaMoney) {
        this.qitaMoney = qitaMoney;
    }
    /**
	 * 获取：五险一金
	 */
    public Double getWuxianyijinMoney() {
        return wuxianyijinMoney;
    }


    /**
	 * 设置：五险一金
	 */
    public void setWuxianyijinMoney(Double wuxianyijinMoney) {
        this.wuxianyijinMoney = wuxianyijinMoney;
    }
    /**
	 * 获取：实发
	 */
    public Double getShifaMoney() {
        return shifaMoney;
    }


    /**
	 * 设置：实发
	 */
    public void setShifaMoney(Double shifaMoney) {
        this.shifaMoney = shifaMoney;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
