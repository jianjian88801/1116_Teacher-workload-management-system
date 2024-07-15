package com.entity.model;

import com.entity.GongzuoliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作量
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuoliangModel implements Serializable {
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
     * 工作量标题
     */
    private String gongzuoliangName;


    /**
     * 工作量类型
     */
    private Integer gongzuoliangTypes;


    /**
     * 工作量详情
     */
    private String gongzuoliangContent;


    /**
     * 工作量数值
     */
    private Double gongzuoliangNumber;


    /**
     * 状态
     */
    private Integer gongzuoliangYesnoTypes;


    /**
     * 审核意见
     */
    private String gongzuoliangYesnoText;


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
	 * 获取：工作量标题
	 */
    public String getGongzuoliangName() {
        return gongzuoliangName;
    }


    /**
	 * 设置：工作量标题
	 */
    public void setGongzuoliangName(String gongzuoliangName) {
        this.gongzuoliangName = gongzuoliangName;
    }
    /**
	 * 获取：工作量类型
	 */
    public Integer getGongzuoliangTypes() {
        return gongzuoliangTypes;
    }


    /**
	 * 设置：工作量类型
	 */
    public void setGongzuoliangTypes(Integer gongzuoliangTypes) {
        this.gongzuoliangTypes = gongzuoliangTypes;
    }
    /**
	 * 获取：工作量详情
	 */
    public String getGongzuoliangContent() {
        return gongzuoliangContent;
    }


    /**
	 * 设置：工作量详情
	 */
    public void setGongzuoliangContent(String gongzuoliangContent) {
        this.gongzuoliangContent = gongzuoliangContent;
    }
    /**
	 * 获取：工作量数值
	 */
    public Double getGongzuoliangNumber() {
        return gongzuoliangNumber;
    }


    /**
	 * 设置：工作量数值
	 */
    public void setGongzuoliangNumber(Double gongzuoliangNumber) {
        this.gongzuoliangNumber = gongzuoliangNumber;
    }
    /**
	 * 获取：状态
	 */
    public Integer getGongzuoliangYesnoTypes() {
        return gongzuoliangYesnoTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setGongzuoliangYesnoTypes(Integer gongzuoliangYesnoTypes) {
        this.gongzuoliangYesnoTypes = gongzuoliangYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getGongzuoliangYesnoText() {
        return gongzuoliangYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setGongzuoliangYesnoText(String gongzuoliangYesnoText) {
        this.gongzuoliangYesnoText = gongzuoliangYesnoText;
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
