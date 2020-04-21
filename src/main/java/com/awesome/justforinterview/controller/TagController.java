package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.service.TagService;
import com.awesome.justforinterview.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {
  @Autowired
  private TagService tagService;

  @RequestMapping(value = "/allParent")
  public Object getAllParentTags() {
    return ResponseHelper.success("success", tagService.getAllParentTag());
  }

  @RequestMapping(value = "/children/{tagCode}")
  public Object getTagsByParentCode(@PathVariable("tagCode") String parentCode) {
    return ResponseHelper.success("success", tagService.getChildrenTagsByParentCode(parentCode));
  }
}
// TODO: 2020/4/20 tag_code 返回为null
