package com.entity.vo;

import com.entity.TogzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通知信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("togzhi")
public class TogzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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

    @TableField(value = "create_time")
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

}
