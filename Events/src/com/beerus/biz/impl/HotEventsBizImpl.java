package com.beerus.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beerus.biz.HotEventsBiz;
import com.beerus.dao.HotEventsDao;
import com.beerus.entity.HotEvents;
import com.beerus.entity.Pager;

/**
 * 事件业务实现层
 * @author J.z
 *
 */
@Service
public class HotEventsBizImpl implements HotEventsBiz{

	/** 事件映射层 */
	@Resource
	private HotEventsDao hotEventsDao;

	@Override
	public Pager<HotEvents> listHotEvents(HotEvents events, int currPageNo, int pageSize) {
		Pager<HotEvents> pager = new Pager<>();
		// 设置当前页码
		pager.setCurrPageNo(currPageNo);
		// 设置总行数
		pager.setTotalRow(hotEventsDao.cout_row(events));
		// 设置当前页码
		pager.setPageSize(pageSize);
		// 设置查询数据
		pager.setDatas(hotEventsDao.listHotEvents(events, (currPageNo - 1) * pageSize, pageSize));
		// 设置总页码
		pager.setTotalPager((pager.getTotalRow() - 1 + pageSize)/ pageSize);
		return pager;
	}

	@Override
	public HotEvents getHotEvents(HotEvents events) {
		return hotEventsDao.getHotEvents(events);
	}
	
}
