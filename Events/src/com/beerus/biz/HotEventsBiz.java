package com.beerus.biz;



import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.beerus.entity.HotEvents;
import com.beerus.entity.Pager;
/**
 * 事件映射层
 * @author J.z
 *
 */
public interface HotEventsBiz {
	/**
	 *  分页查询事件
	 * @param events 事件条件
	 * @param currPageNo 当前页码
	 * @param pageSize 页大小
	 * @return
	 */
	Pager<HotEvents> listHotEvents(@Param("events")HotEvents events,
								  @Param("currPageNo")int currPageNo,
								  @Param("pageSize")int pageSize);
	/**
	 * 根据条件查询事件
	 * @param events 条件
	 * @return
	 */
	HotEvents getHotEvents(HotEvents events);
}
