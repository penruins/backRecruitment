package recruitment.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "view_resume")
public class Resume2 {
  private Long id;
  private String name;
  private String telephone;
  private String nowLocation;
  private String company;
  private String jobName;
  private String educationBackground;
}




