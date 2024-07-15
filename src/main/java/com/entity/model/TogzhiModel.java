package com.entity.model;

import com.entity.TogzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 通知信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TogzhiModel implements Serializable {
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
     * 通知标题
     */
    private String togzhiName;


    /**
     * 通知类型
     */
    private Integer togzhiTypes;


    /**
     * 通知时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 通知内容
     */
    private String togzhiContent;


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
	 * 获取：通知标题
	 */
    public String getTogzhiName() {
        return togzhiName;
    }


    /**
	 * 设置：通知标题
	 */
    public void setTogzhiName(String togzhiName) {
        this.togzhiName = togzhiName;
    }
    /**
	 * 获取：通知类型
	 */
    public Integer getTogzhiTypes() {
        return togzhiTypes;
    }


    /**
	 * 设置：通知类型
	 */
    public void setTogzhiTypes(Integer togzhiTypes) {
        this.togzhiTypes = togzhiTypes;
    }
    /**
	 * 获取：通知时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：通知时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：通知内容
	 */
    public String getTogzhiContent() {
        return togzhiContent;
    }


    /**
	 * 设置：通知内容
	 */
    public void setTogzhiContent(String togzhiContent) {
        this.togzhiContent = togzhiContent;
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
