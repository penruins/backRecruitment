package recruitment.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruitment.demo.entity.PageVO;
import recruitment.demo.entity.Resume;
import recruitment.demo.entity.Resume2;
import recruitment.demo.entity.common.Results;
import recruitment.demo.mapper.Resume2Mapper;
import recruitment.demo.mapper.ResumeMapper;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {
  @Autowired
  private ResumeMapper resumeMapper;
  @Autowired
  private Resume2Mapper resume2Mapper;

  @GetMapping("/resumes/{page}/{limit}")
  @CrossOrigin
  public Results<PageVO> getResumes(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Resume> res = resumeMapper.selectPage(new Page<>(page,limit), null);
    PageVO<Resume> pageVO = PageVO.<Resume>builder()
            .records(res.getRecords())
            .total(res.getTotal())
            .current(res.getCurrent())
            .size(res.getSize())
            .build();
    return Results.ok(pageVO);
  }
  @GetMapping("/resumes2/{page}/{limit}")
  @CrossOrigin
  public Results<PageVO> getResumes2(@PathVariable Integer page,@PathVariable Integer limit) {
    Page<Resume2> res = resume2Mapper.selectPage(new Page<>(page,limit), null);
    PageVO<Resume2> pageVO = PageVO.<Resume2>builder()
            .records(res.getRecords())
            .total(res.getTotal())
            .current(res.getCurrent())
            .size(res.getSize())
            .build();
    return Results.ok(pageVO);
  }


  @GetMapping("/resume/{id}")
  @CrossOrigin
  public Results<Resume> getResumeById(@PathVariable Integer id) {
    Resume resume = resumeMapper.selectById(id);
    return Results.ok(resume);
  }
  @GetMapping("/resume2/{id}")
  @CrossOrigin
  public Results<Resume2> getResume2ById(@PathVariable Integer id) {
    Resume2 resume2 = resume2Mapper.selectById(id);
    return Results.ok(resume2);
  }
}
