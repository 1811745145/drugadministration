/** 
 * <pre>项目名称:bootstrap 
 * 文件名称:TreeBean.java 
 * 包名:com.jk.qhp.pojo 
 * 创建日期:2019年2月18日下午3:45:06 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.util.List;


/** 
 * <pre>项目名称：bootstrap    
 * 类名称：TreeBean    
 * 类描述：    
 * 创建人：曲浩朋
 * 创建时间：2019年2月18日 下午3:45:06    
 * 修改人：曲浩朋
 * 修改时间：2019年2月18日 下午3:45:06    
 * 修改备注：       
 * @version </pre>    
 */
public class TreeBean {
	private Integer id;
	private String text;
	private Integer pid;
	private String href;
	private List<TreeBean> nodes;
	private Boolean selectable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public List<TreeBean> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeBean> nodes) {
		this.nodes = nodes;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}
}
