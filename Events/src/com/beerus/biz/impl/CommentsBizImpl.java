package com.beerus.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beerus.biz.CommentsBiz;
import com.beerus.dao.CommentsDao;
import com.beerus.entity.Comments;

/**
 *  评论业务实现层
 * @author J.z
 *
 */
@Service
public class CommentsBizImpl  implements CommentsBiz{

	/** 评论映射层 */
	@Resource
	private CommentsDao commentsDao;

	@Override
	public boolean saveComment(Comments Comment) {
		return commentsDao.saveComment(Comment) > 0;
	}

	

}
