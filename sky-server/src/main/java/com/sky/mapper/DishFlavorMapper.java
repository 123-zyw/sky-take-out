package com.sky.mapper;

import java.util.List;

import com.sky.entity.DishFlavor;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param dishFlavors
     */
    void insertBatch(@Param("dishFlavors") List<DishFlavor> dishFlavors);

    /**
     * 根据菜品id删除菜品口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}
