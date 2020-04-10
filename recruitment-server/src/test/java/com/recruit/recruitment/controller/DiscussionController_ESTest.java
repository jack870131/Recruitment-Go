/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:25:42 GMT 2020
 */

package com.recruit.recruitment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.recruit.recruitment.controller.DiscussionController;
import com.recruit.recruitment.model.entity.Result;
import com.recruit.recruitment.model.pojo.Discussion;
import com.recruit.recruitment.service.DiscussionService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class DiscussionController_ESTest extends DiscussionController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      Result result0 = discussionController0.sendDiscussion("", "", "");
      assertEquals("Send successful", result0.getMessage());
      assertEquals(200, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      Result result0 = discussionController0.sendDiscussion("ex)$g ", "ex)$g ", "");
      assertEquals(200, (int)result0.getCode());
      assertEquals("Send successful", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      discussionController0.discussionService = null;
      Result result0 = discussionController0.sendDiscussion((String) null, (String) null, (String) null);
      assertEquals("Send failed", result0.getMessage());
      assertEquals(201, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      discussionController0.discussionService = null;
      Integer integer0 = new Integer(4555);
      Result result0 = discussionController0.getReceiverByReplytoid(integer0);
      assertEquals(201, (int)result0.getCode());
      assertEquals("Query failed", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      doReturn((Discussion) null).when(discussionService0).findDiscussionByNotificationid(anyInt());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      Integer integer0 = new Integer(4555);
      Result result0 = discussionController0.getDiscussionByNotificationid(integer0);
      assertEquals(200, (int)result0.getCode());
      assertEquals("Query successful", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DiscussionController discussionController0 = new DiscussionController();
      DiscussionService discussionService0 = mock(DiscussionService.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionController0, (Class<?>) DiscussionController.class, "discussionService", (Object) discussionService0);
      Injector.validateBean(discussionController0, (Class<?>) DiscussionController.class);
      discussionController0.discussionService = null;
      Integer integer0 = new Integer(4555);
      Result result0 = discussionController0.getDiscussionByNotificationid(integer0);
      assertEquals(201, (int)result0.getCode());
      assertEquals("Query failed", result0.getMessage());
  }
}
