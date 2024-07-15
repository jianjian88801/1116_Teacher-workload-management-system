package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 通知信息
 *
 * @author 
 * @email
 */
@TableName("togzhi")
public class TogzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TogzhiEntity() {

	}

	public TogzhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 通知标题
     */
    @TableField(value = "togzhi_name")

    private String togzhiName;


    /**
     * 通知类型
     */
    @TableField(value = "togzhi_types")

    private Integer togzhiTypes;


    /**
     * 通知时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 通知内容
     */
    @TableField(value = "togzhi_content")

    private String togzhiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：通知标题
	 */
    public String getTogzhiName() {
        return togzhiName;
    }


    /**
	 * 获取：通知标题
	 */

    public void setTogzhiName(String togzhiName) {
        this.togzhiName = togzhiName;
    }
    /**
	 * 设置：通知类型
	 */
    public Integer getTogzhiTypes() {
        return togzhiTypes;
    }


    /**
	 * 获取：通知类型
	 */

    public void setTogzhiTypes(Integer togzhiTypes) {
        this.togzhiTypes = togzhiTypes;
    }
    /**
	 * 设置：通知时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：通知时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：通知内容
	 */
    public String getTogzhiContent() {
        return togzhiContent;
    }


    /**
	 * 获取：通知内容
	 */

    public void setTogzhiContent(String togzhiContent) {
        this.togzhiContent = togzhiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Togzhi{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", togzhiName=" + togzhiName +
            ", togzhiTypes=" + togzhiTypes +
            ", insertTime=" + insertTime +
            ", togzhiContent=" + togzhiContent +
            ", createTime=" + createTime +
        "}";
    }
}
