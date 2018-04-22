package com.caocao.dtk.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author CC
 * @email msgbus@163.com
 * @date 2018-01-28 22:16:14
 */
public class DtkdataDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//名称
	private String apiType;
	//更新时间
	private Date updateTime;
	//返回结果总条数
	private String totalNum;
	//应用类型
	private String updateContent;

	/**
	 * 设置：名称
	 */
	public void setApiType(String apiType) {
		this.apiType = apiType;
	}
	/**
	 * 获取：名称
	 */
	public String getApiType() {
		return apiType;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：返回结果总条数
	 */
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * 获取：返回结果总条数
	 */
	public String getTotalNum() {
		return totalNum;
	}
	/**
	 * 设置：应用类型
	 */
	public void setUpdateContent(String updateContent) {
		this.updateContent = updateContent;
	}
	/**
	 * 获取：应用类型
	 */
	public String getUpdateContent() {
		return updateContent;
	}
}
