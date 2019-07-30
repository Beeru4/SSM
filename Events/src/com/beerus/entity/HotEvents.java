package com.beerus.entity;

import java.util.Date;
import java.util.List;

/**
 * 热点事件表
 * 
 * @author J.z
 *
 */
public class HotEvents {
	private int id;
	private String keyWord;
	private String hotContent;
	private int searchSum;
	private Date createDate;
	
	private List<Comments> comments;
	
	
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getHotContent() {
		return hotContent;
	}
	public void setHotContent(String hotContent) {
		this.hotContent = hotContent;
	}
	public int getSearchSum() {
		return searchSum;
	}
	public void setSearchSum(int searchSum) {
		this.searchSum = searchSum;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}
