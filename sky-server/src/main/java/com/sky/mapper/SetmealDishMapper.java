package com.sky.mapper;

import java.util.List;

import com.sky.entity.SetmealDish;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据套餐id查询套餐菜品
     * @param setmealId
     * @return
     */
    List<SetmealDish> getBySetmealId(Long setmealId);

    /**
     * 根据菜品id查询关联的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
