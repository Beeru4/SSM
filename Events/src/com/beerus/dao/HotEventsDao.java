package com.beerus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.beerus.entity.HotEvents;
/**
 * 事件映射层
 * @author J.z
 *
 */
public interface HotEventsDao {
	/**
	 *  分页查询事件
	 * @param events 事件条件
	 * @param currPageNo 当前页码
	 * @param pageSize 页大小
	 * @return
	 */
	List<HotEvents> listHotEvents(@Param("events")HotEvents events,
								  @Param("currPageNo")int currPageNo,
								  @Param("pageSize")int pageSize);
	
	/**
	 * 根据条件查询事件
	 * @param events 条件
	 * @return
	 */
	HotEvents getHotEvents(HotEvents events);
	
	
	/**
	 * 根据条件查询总行数
	 * @param events 条件
	 * @return
	 */
	int cout_row(@Param("events")HotEvents events);
	
}
