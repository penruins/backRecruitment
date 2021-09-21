package recruitment.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "t_recruitment")
public class Recruitment {
  @TableId(value = "id")
  private Integer id;
  private String company;
  private String jobName;
  private String salary;
  private String location;
  private String educationBackground;
  private Integer experienceYear;
  private String tags;
  private Date updateTime;
  private Date createTime;
  private String jobType;
  private Integer count;
  private String firstLanguage;
  private String description;
}
