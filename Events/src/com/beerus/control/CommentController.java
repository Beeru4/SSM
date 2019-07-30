package com.beerus.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beerus.biz.CommentsBiz;
import com.beerus.entity.Comments;

/**
 * 评论控制层
 * 
 * @author J.z
 *
 */
@Controller
public class CommentController {

	/** 评论映业务实现层 */
	@Resource
	private CommentsBiz commentsBiz;

	/**
	 * 添加评论
	 * 
	 * @param Comment
	 * @return
	 */
	@RequestMapping(value = "/saveComment",produces="text/html;charset=UTF-8")
	@ResponseBody
	public Object saveComment(@ModelAttribute Comments Comment) {
		if (commentsBiz.saveComment(Comment)) {
			// 添加成功
			return "{\"code\":\"200\"}";
		}
		// 添加失败
		return "{\"code\":\"-1\"}";
	}
}
