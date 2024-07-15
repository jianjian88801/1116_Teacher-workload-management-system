package com.entity.view;

import com.entity.GongzuoliangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 工作量
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuoliang")
public class GongzuoliangView extends GongzuoliangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 工作量类型的值
		*/
		private String gongzuoliangValue;
		/**
		* 状态的值
		*/
		private String gongzuoliangYesnoValue;



		//级联表 jiaoshi
			/**
			* 教师姓名
			*/
			private String jiaoshiName;
			/**
			* 教师手机号
			*/
			private String jiaoshiPhone;
			/**
			* 教师身份证号
			*/
			private String jiaoshiIdNumber;
			/**
			* 教师头像
			*/
			private String jiaoshiPhoto;
			/**
			* 电子邮箱
			*/
			private String jiaoshiEmail;

	public GongzuoliangView() {

	}

	public GongzuoliangView(GongzuoliangEntity gongzuoliangEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuoliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 工作量类型的值
			*/
			public String getGongzuoliangValue() {
				return gongzuoliangValue;
			}
			/**
			* 设置： 工作量类型的值
			*/
			public void setGongzuoliangValue(String gongzuoliangValue) {
				this.gongzuoliangValue = gongzuoliangValue;
			}
			/**
			* 获取： 状态的值
			*/
			public String getGongzuoliangYesnoValue() {
				return gongzuoliangYesnoValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setGongzuoliangYesnoValue(String gongzuoliangYesnoValue) {
				this.gongzuoliangYesnoValue = gongzuoliangYesnoValue;
			}
















				//级联表的get和set jiaoshi
					/**
					* 获取： 教师姓名
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}
					/**
					* 获取： 教师手机号
					*/
					public String getJiaoshiPhone() {
						return jiaoshiPhone;
					}
					/**
					* 设置： 教师手机号
					*/
					public void setJiaoshiPhone(String jiaoshiPhone) {
						this.jiaoshiPhone = jiaoshiPhone;
					}
					/**
					* 获取： 教师身份证号
					*/
					public String getJiaoshiIdNumber() {
						return jiaoshiIdNumber;
					}
					/**
					* 设置： 教师身份证号
					*/
					public void setJiaoshiIdNumber(String jiaoshiIdNumber) {
						this.jiaoshiIdNumber = jiaoshiIdNumber;
					}
					/**
					* 获取： 教师头像
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 教师头像
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getJiaoshiEmail() {
						return jiaoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiaoshiEmail(String jiaoshiEmail) {
						this.jiaoshiEmail = jiaoshiEmail;
					}


}
