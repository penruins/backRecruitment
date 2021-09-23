package recruitment.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Recruitment2 {
  private Integer id;
  private String company;
  private String jobName;
  private String salary;
  private String location;
  private String educationBackground;
  private Integer experienceYear;
  private String[] tags;
  private Date updateTime;
  private Date createTime;
  private String jobType;
  private Integer count;
  private String firstLanguage;
  private String description;

  public Recruitment2(Recruitment recruitment) {
    this.id = recruitment.getId();
    this.company = recruitment.getCompany();
    this.jobName = recruitment.getJobName();
    this.salary = recruitment.getSalary();
    this.location = recruitment.getLocation();
    this.educationBackground = recruitment.getEducationBackground();
    this.experienceYear = recruitment.getExperienceYear();
    this.tags = recruitment.getTags().split(" ");
    this.createTime = recruitment.getCreateTime();
    this.updateTime = recruitment.getUpdateTime();
    this.jobType = recruitment.getJobType();
    this.count = recruitment.getCount();
    this.firstLanguage = recruitment.getFirstLanguage();
    this.description = recruitment.getDescription();
  }
}
