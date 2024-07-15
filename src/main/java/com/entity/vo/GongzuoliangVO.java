package com.entity.vo;

import com.entity.GongzuoliangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作量
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuoliang")
public class GongzuoliangVO implements Serializable {
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
     * 工作量标题
     */

    @TableField(value = "gongzuoliang_name")
    private String gongzuoliangName;


    /**
     * 工作量类型
     */

    @TableField(value = "gongzuoliang_types")
    private Integer gongzuoliangTypes;


    /**
     * 工作量详情
     */

    @TableField(value = "gongzuoliang_content")
    private String gongzuoliangContent;


    /**
     * 工作量数值
     */

    @TableField(value = "gongzuoliang_number")
    private Double gongzuoliangNumber;


    /**
     * 状态
     */

    @TableField(value = "gongzuoliang_yesno_types")
    private Integer gongzuoliangYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "gongzuoliang_yesno_text")
    private String gongzuoliangYesnoText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：工作量标题
	 */
    public String getGongzuoliangName() {
        return gongzuoliangName;
    }


    /**
	 * 获取：工作量标题
	 */

    public void setGongzuoliangName(String gongzuoliangName) {
        this.gongzuoliangName = gongzuoliangName;
    }
    /**
	 * 设置：工作量类型
	 */
    public Integer getGongzuoliangTypes() {
        return gongzuoliangTypes;
    }


    /**
	 * 获取：工作量类型
	 */

    public void setGongzuoliangTypes(Integer gongzuoliangTypes) {
        this.gongzuoliangTypes = gongzuoliangTypes;
    }
    /**
	 * 设置：工作量详情
	 */
    public String getGongzuoliangContent() {
        return gongzuoliangContent;
    }


    /**
	 * 获取：工作量详情
	 */

    public void setGongzuoliangContent(String gongzuoliangContent) {
        this.gongzuoliangContent = gongzuoliangContent;
    }
    /**
	 * 设置：工作量数值
	 */
    public Double getGongzuoliangNumber() {
        return gongzuoliangNumber;
    }


    /**
	 * 获取：工作量数值
	 */

    public void setGongzuoliangNumber(Double gongzuoliangNumber) {
        this.gongzuoliangNumber = gongzuoliangNumber;
    }
    /**
	 * 设置：状态
	 */
    public Integer getGongzuoliangYesnoTypes() {
        return gongzuoliangYesnoTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setGongzuoliangYesnoTypes(Integer gongzuoliangYesnoTypes) {
        this.gongzuoliangYesnoTypes = gongzuoliangYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getGongzuoliangYesnoText() {
        return gongzuoliangYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setGongzuoliangYesnoText(String gongzuoliangYesnoText) {
        this.gongzuoliangYesnoText = gongzuoliangYesnoText;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
