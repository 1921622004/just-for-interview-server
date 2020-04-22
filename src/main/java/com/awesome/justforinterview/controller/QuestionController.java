package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.model.Question;
import com.awesome.justforinterview.service.QuestionService;
import com.awesome.justforinterview.service.UserService;
import com.awesome.justforinterview.utils.JacksonUtil;
import com.awesome.justforinterview.utils.JwtHelper;
import com.awesome.justforinterview.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/question")
public class QuestionController {
  @Autowired
  private QuestionService questionService;

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/detail/{id}")
  public Question getQuestionDetail(@PathVariable Integer id) {
    return this.questionService.getQuestionById(id);
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Object createQuestion(@RequestBody String requestBody, @CookieValue("jwt-token") String token) {
    String userId = JwtHelper.getUserIdByToken(token);
    System.out.println(userId);
    if (userId == null) {
      return ResponseHelper.fail(403, "can't find user");
    }
    String content = JacksonUtil.parseString(requestBody, "content");
    String rawContent = JacksonUtil.parseString(requestBody, "rawContent");
    String title = JacksonUtil.parseString(requestBody, "title");
    String parentTagCode = JacksonUtil.parseString(requestBody, "parentTagCode");
    String tagCodes = JacksonUtil.parseString(requestBody, "tagCodes");
    Question question = new Question();
    question.setContent(content);
    question.setRawContent(rawContent);
    Date nowDate = new Date();
    question.setCreateTime(nowDate);
    question.setModifyTime(nowDate);
    question.setParentTagCode(parentTagCode);
    question.setTitle(title);
    question.setUserId(userId);
    question.setTagCodes(tagCodes);
    Integer id = questionService.createQuestion(question);
    return ResponseHelper.success("create success", id);
  }
}
