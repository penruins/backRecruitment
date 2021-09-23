package recruitment.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "t_resume")
public class Resume {
  private Long id;
  private Long recruitmentId;
  private String name;
  private String telephone;
  private String email;
  private String birthday;
  private String graduateDate;
  private String nation;
  private String region;
  private String cardKind;
  private String cardNumber;
  private String expectMonthSalary;
  private String expectYearSalary;
  private String politicsPerspective;
  private String minzu;
  private String certificate;
  private String hobby;
  private String emergencyContact;
  private String emergencyNumber;
  private String englishRank;
  private String englishScore;
  private String qq;
  private String wechat;
  private String nowLocation;
  private String expectWorkLocation;
  private String mailLocation;
  private Boolean isWorkForeign;
  private String recruitmentSource;
  private String school;
  private String schoolLocation;
  private String schoolNumber; //  学号
  private String schoolRank;
  private String schoolCampusName;
  private String schoolCareerName; // 专业名字
  private String educationBackground;
  private String learningKind;
  private String description;
}




