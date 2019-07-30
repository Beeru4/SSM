package com.beerus.dao;


import com.beerus.entity.Comments;

/**
 * 评论映射层
 * 
 * @author J.z
 *
 */
public interface CommentsDao {
	/**
	 * 添加评论
	 * 
	 * @param Comment 评论
	 * @return
	 */
	int saveComment(Comments Comment);

	
}
