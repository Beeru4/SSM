package com.beerus.entity;

import java.util.Date;

/**
 * 评论
 * 
 * @author J.z
 *
 */
public class Comments {
	private int id;
	private	int hotEventsId;
	private	Date commentDate;
	private	String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotEventsId() {
		return hotEventsId;
	}
	public void setHotEventsId(int hotEventsId) {
		this.hotEventsId = hotEventsId;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
