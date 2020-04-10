/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:24:46 GMT 2020
 */

package com.recruit.recruitment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.recruit.recruitment.controller.ErrorController;
import com.recruit.recruitment.model.entity.Result;
import javax.servlet.http.HttpServletResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorController_ESTest extends ErrorController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      Injector.inject(errorController0, (Class<?>) ErrorController.class, "response", (Object) httpServletResponse0);
      Injector.validateBean(errorController0, (Class<?>) ErrorController.class);
      Result result0 = errorController0.notfound();
      assertEquals(404, (int)result0.getCode());
      assertEquals("File not found", result0.getMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorController errorController0 = new ErrorController();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      Injector.inject(errorController0, (Class<?>) ErrorController.class, "response", (Object) httpServletResponse0);
      Injector.validateBean(errorController0, (Class<?>) ErrorController.class);
      Result result0 = errorController0.frequentOperation();
      assertEquals("Operation is too frequent", result0.getMessage());
      assertEquals(205, (int)result0.getCode());
  }
}
