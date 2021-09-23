package recruitment.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import recruitment.demo.entity.Recruitment;
import recruitment.demo.entity.Resume;
import recruitment.demo.mapper.RecruitmentMapper;
import recruitment.demo.mapper.ResumeMapper;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
  @Autowired
  private RecruitmentMapper recruitmentMapper;
  @Autowired
  private ResumeMapper resumeMapper;

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
  @Test
  void test003() {
    for(int i=2;i<1000;i++) {
      Resume resume = new Resume();
      resume.setId(new Long(i));
      resume.setRecruitmentId(new Long(2));
      resume.setName("刘翔");
      resume.setTelephone("17356582393");
      resume.setEmail("lx_tdcq_king@icloud.com");
      resume.setBirthday("1998-07-24");
      resume.setGraduateDate("2021-06-30");
      resume.setNation("中华人民共和国");
      resume.setCardKind("居民身份证");
      resume.setCardNumber("530102199807240711");
      resume.setExpectMonthSalary("15k");
      resume.setExpectYearSalary("20w");
      resume.setPoliticsPerspective("群众");
      resume.setMinzu("白族");
      resume.setCertificate("");
      resume.setHobby("乒乓球 看电影");
      resume.setEmergencyContact("李喜庆");
      resume.setEmergencyNumber("13987675078");
      resume.setEnglishRank("四级");
      resume.setEnglishScore("492");
      resume.setQq("1007656785");
      resume.setWechat("penruins");
      resume.setNowLocation("云南省昆明市西山区碧鸡名城2幢707");
      resume.setExpectWorkLocation("上海市");
      resume.setMailLocation("云南省昆明市西山区碧鸡名城2幢707");
      resume.setIsWorkForeign(false);
      resume.setRecruitmentSource("学校就业信息网");
      resume.setSchool("合肥工业大学");
      resume.setSchoolLocation("安徽省合肥市");
      resume.setSchoolNumber("2017211945");
      resume.setSchoolRank("前50%");
      resume.setSchoolCampusName("计算机与信息学院");
      resume.setSchoolCareerName("计算机科学与技术");
      resume.setEducationBackground("学士学位");
      resume.setLearningKind("全日制");
      resume.setDescription("you dont give up, then there's no limitation");
      resumeMapper.insert(resume);
    }
  }


}
