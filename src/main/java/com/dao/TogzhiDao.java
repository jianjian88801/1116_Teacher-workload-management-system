package com.dao;

import com.entity.TogzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TogzhiView;

/**
 * 通知信息 Dao 接口
 *
 * @author 
 */
public interface TogzhiDao extends BaseMapper<TogzhiEntity> {

   List<TogzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
