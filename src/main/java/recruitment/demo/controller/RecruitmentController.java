package recruitment.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruitment.demo.entity.PageVO;
import recruitment.demo.entity.Recruitment;
import recruitment.demo.entity.common.Results;
import recruitment.demo.mapper.RecruitmentMapper;

import java.util.List;

@RestController
@RequestMapping("/recruitment")
public class RecruitmentController {
  @Autowired
  private RecruitmentMapper recruitmentMapper;


  @GetMapping("/recruitments/{page}/{limit}")
  @CrossOrigin
  public Results<PageVO> getRecruitments(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Recruitment> res = recruitmentMapper.selectPage(new Page<>(page,limit),null);
    PageVO<Recruitment> pageVO = PageVO.<Recruitment>builder()
            .records(res.getRecords())
            .total(res.getTotal())
            .current(res.getCurrent())
            .size(res.getSize())
            .build();
    return Results.ok(pageVO);
  }
  @GetMapping("/recruitment/{id}")
  @CrossOrigin
  public Results<Recruitment> getRecruitmentById(@PathVariable Integer id) {
    Recruitment recruitment = recruitmentMapper.selectById(id);
    return Results.ok(recruitment);
  }
  @GetMapping("/recruitments2/{page}/{limit}")
  public void getRecruitments2(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Recruitment> res = recruitmentMapper.selectPage(new Page<>(page,limit),null);
    List<Recruitment> list = res.getRecords();
    list.forEach(e -> System.out.println(e));
  }
}
