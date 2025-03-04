/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:11:35 GMT 2020
 */

package com.recruit.recruitment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.controller.UserController;
import com.recruit.recruitment.model.entity.Result;
import com.recruit.recruitment.model.pojo.User;
import com.recruit.recruitment.service.UserService;
import com.recruit.recruitment.utils.FormatUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class UserController_ESTest extends UserController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(formatUtil0).checkStringNull(any(java.lang.String[].class));
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      Result result0 = userController0.sendMail("Rg=9iUO]&}hSXb", (String) null);
      assertEquals("Invalid mail address", result0.getMessage());
      assertEquals(201, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(formatUtil0).checkStringNull(any(java.lang.String[].class));
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      Result result0 = userController0.forgetPassword("Password changed", "Incomplete info", "");
      assertEquals("Incomplete info", result0.getMessage());
      assertEquals(201, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      // Undeclared exception!
      try { 
        userController0.login((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.controller.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(formatUtil0).checkStringNull(any(java.lang.String[].class));
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      Result result0 = userController0.changePassword("Zz7#Ry", (String) null);
      assertEquals(201, (int)result0.getCode());
      assertEquals("Incomplete info", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(formatUtil0).checkStringNull(any(java.lang.String[].class));
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(user0).getPassword();
      doReturn((String) null).when(user0).getUsername();
      Result result0 = userController0.login(user0);
      assertEquals("Incomplete info", result0.getMessage());
      assertEquals(201, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(formatUtil0).checkStringNull(any(java.lang.String[].class));
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(user0).getMail();
      doReturn((String) null).when(user0).getPassword();
      doReturn((String) null).when(user0).getUsername();
      Result result0 = userController0.register(user0);
      assertEquals(201, (int)result0.getCode());
      assertEquals("Incomplete info", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      Result result0 = userController0.logout();
      assertEquals("Logout successful", result0.getMessage());
      assertEquals(200, (int)result0.getCode());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UserController userController0 = new UserController();
      FormatUtil formatUtil0 = mock(FormatUtil.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "formatUtil", (Object) formatUtil0);
      UserService userService0 = mock(UserService.class, new ViolatedAssumptionAnswer());
      Injector.inject(userController0, (Class<?>) UserController.class, "userService", (Object) userService0);
      Injector.validateBean(userController0, (Class<?>) UserController.class);
      // Undeclared exception!
      try { 
        userController0.register((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.controller.UserController", e);
      }
  }
}
