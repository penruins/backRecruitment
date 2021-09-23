package recruitment.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import recruitment.demo.entity.Resume2;

@Mapper
@Repository
public interface Resume2Mapper extends BaseMapper<Resume2> {
}
