package recruitment.demo.controller;

import cn.hutool.core.map.MapUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruitment.demo.entity.PageVO;
import recruitment.demo.entity.Recruitment;
import recruitment.demo.entity.Recruitment2;
import recruitment.demo.entity.common.Results;
import recruitment.demo.mapper.RecruitmentMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recruitment")
public class RecruitmentController {
  @Autowired
  private RecruitmentMapper recruitmentMapper;


  @GetMapping("/recruitments/{page}/{limit}")
  @CrossOrigin
  public Results<PageVO> getRecruitments(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Recruitment> res = recruitmentMapper.selectPage(new Page<>(page,limit),null);
    List<Recruitment> records = res.getRecords();
    List<Recruitment2> records2 = new ArrayList<>();
    for(Recruitment recruitment : records) {
      records2.add(new Recruitment2(recruitment));
    }
    PageVO<Recruitment2> pageVO = PageVO.<Recruitment2>builder()
            .records(records2)
            .total(res.getTotal())
            .current(res.getCurrent())
            .size(res.getSize())
            .build();
    return Results.ok(pageVO);
  }
  @GetMapping("/recruitment/{id}")
  @CrossOrigin
  public Results<Recruitment2> getRecruitmentById(@PathVariable Integer id) {
    Recruitment recruitment = recruitmentMapper.selectById(id);
    return Results.ok(new Recruitment2(recruitment));
  }
  @PutMapping("/recruitment/update/{id}")
  @CrossOrigin
  public Results<Map<String, Object>> getRecruitmentById(@RequestBody Recruitment recruitment, @PathVariable Integer id) {
    recruitmentMapper.updateById(recruitment);
    System.out.println("更新成功");
    return Results.ok("更新成功", MapUtil.of("id",id));
  }
  @GetMapping("/recruitments2/{page}/{limit}")
  public void getRecruitments2(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Recruitment> res = recruitmentMapper.selectPage(new Page<>(page,limit),null);
    List<Recruitment> list = res.getRecords();
    list.forEach(e -> System.out.println(e));
  }
}
