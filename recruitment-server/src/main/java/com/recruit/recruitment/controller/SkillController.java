package com.recruit.recruitment.controller;

import com.recruit.recruitment.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
  @Autowired
  private SkillService skillService;
}
