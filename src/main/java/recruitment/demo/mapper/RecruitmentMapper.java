package recruitment.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import recruitment.demo.entity.Recruitment;

@Mapper
@Repository
public interface RecruitmentMapper extends BaseMapper<Recruitment> {
}
