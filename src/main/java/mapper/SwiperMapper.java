package mapper;

import com.liao.hw.mbg.entity.Swiper;
import com.liao.hw.mbg.entity.SwiperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwiperMapper {
    long countByExample(SwiperExample example);

    int deleteByExample(SwiperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Swiper record);

    int insertSelective(Swiper record);

    List<Swiper> selectByExample(SwiperExample example);

    Swiper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Swiper record, @Param("example") SwiperExample example);

    int updateByExample(@Param("record") Swiper record, @Param("example") SwiperExample example);

    int updateByPrimaryKeySelective(Swiper record);

    int updateByPrimaryKey(Swiper record);
}