package com.beerus.biz;



import com.beerus.entity.Comments;

/**
 * 评论映射层
 * 
 * @author J.z
 *
 */
public interface CommentsBiz {
	/**
	 * 添加评论
	 * 
	 * @param Comment 评论
	 * @return
	 */
	boolean saveComment(Comments Comment);

	
}
