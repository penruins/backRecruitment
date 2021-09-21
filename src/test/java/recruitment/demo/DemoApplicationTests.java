package recruitment.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import recruitment.demo.entity.Recruitment;
import recruitment.demo.mapper.RecruitmentMapper;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
  @Autowired
  private RecruitmentMapper recruitmentMapper;

  @Test
  void contextLoads() {
  }
  @Test
  void test001() {
    for(int i=3;i<101;i++) {
      Recruitment recruitment = new Recruitment();
      recruitment.setId(i);
      recruitment.setCompany("杭州海康威视数字技术股份有限公司");
      recruitment.setJobName("应用软件开发工程师");
      recruitment.setSalary("10k~15k");
      recruitment.setLocation("云南省昆明市盘龙区王旗营金领地大厦");
      recruitment.setEducationBackground("本科及以上");
      recruitment.setExperienceYear(1);
      recruitment.setTags("五险 带薪年假 公积金 出差补贴 提供食宿 交通补贴");
      recruitment.setUpdateTime(new Date());
      recruitment.setCreateTime(new Date());
      recruitment.setJobType("全职");
      recruitment.setCount(10);
      recruitment.setFirstLanguage(" ");
      recruitment.setDescription("有良好的沟通能力，吃苦耐苦，能承受一定的工作压力");
      recruitmentMapper.insert(recruitment);
    }
  }
  @Test
  void  test002() {
    List<Recruitment> recruitments = recruitmentMapper.selectList(null);
    recruitments.forEach(r -> System.out.println(r));
  }


}
