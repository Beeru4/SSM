package com.beerus.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beerus.biz.HotEventsBiz;
import com.beerus.entity.HotEvents;

/**
 * 事件控制层
 * 
 * @author J.z
 *
 */
@Controller
public class HotEventsController {

	/** 页大小 */
	private final int PAGESIZE = 3;
	/** 热点事件业务层 */
	@Resource
	private HotEventsBiz hotEventsBiz;

	/**
	 * 首页分页查询热点事件
	 * 
	 * @param currPageNo 当前页码
	 * @param events     条件
	 * @param model      携带数据到视图
	 * @return
	 */
	@RequestMapping(value = "/listHotEvents")
	public String listHotEvents(
			@RequestParam(value = "currPageNo", required = false, defaultValue = "1") int currPageNo,
			@ModelAttribute HotEvents events, Model model) {
		// 返回查询的文本
		model.addAttribute("keyWord", events.getKeyWord());
		// 设置查询数据
		model.addAttribute("pager", hotEventsBiz.listHotEvents(events, currPageNo, PAGESIZE));
		return "index";
	}

	/**
	 * 查看热点事件
	 * 
	 * @param events 条件
	 * @param model  携带数据
	 * @return
	 */
	@RequestMapping(value = "/getHotEvent")
	public String getHotEvent(@ModelAttribute HotEvents events, Model model) {
		// 保存数据到到模型
		model.addAttribute("hotEvent", hotEventsBiz.getHotEvents(events));
		return "add";
	}
}
