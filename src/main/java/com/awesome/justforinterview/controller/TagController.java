package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TagController {
  @Autowired
  private TagService tagService;


}