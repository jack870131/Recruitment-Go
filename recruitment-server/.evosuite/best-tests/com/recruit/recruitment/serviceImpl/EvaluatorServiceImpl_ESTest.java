/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:29:03 GMT 2020
 */

package com.recruit.recruitment.serviceImpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.mapper.EvaluatorMapper;
import com.recruit.recruitment.mapper.UserMapper;
import com.recruit.recruitment.model.pojo.Evaluator;
import com.recruit.recruitment.model.pojo.User;
import com.recruit.recruitment.serviceImpl.EvaluatorServiceImpl;
import com.recruit.recruitment.utils.JwtTokenUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvaluatorServiceImpl_ESTest extends EvaluatorServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvaluatorServiceImpl evaluatorServiceImpl0 = new EvaluatorServiceImpl();
      EvaluatorMapper evaluatorMapper0 = mock(EvaluatorMapper.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(evaluatorMapper0).selectEvaluatorNameByPostid(anyInt());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "evaluatorMapper", (Object) evaluatorMapper0);
      JwtTokenUtil jwtTokenUtil0 = mock(JwtTokenUtil.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(jwtTokenUtil0).getUsernameFromRequest(any(javax.servlet.http.HttpServletRequest.class));
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "jwtTokenUtil", (Object) jwtTokenUtil0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "request", (Object) httpServletRequest0);
      UserMapper userMapper0 = mock(UserMapper.class, new ViolatedAssumptionAnswer());
      doReturn((User) null).when(userMapper0).selectByUsername(anyString());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "userMapper", (Object) userMapper0);
      Injector.validateBean(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class);
      Integer integer0 = new Integer((-2234));
      // Undeclared exception!
      try { 
        evaluatorServiceImpl0.findEvaluatorsByPostid(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.serviceImpl.EvaluatorServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvaluatorServiceImpl evaluatorServiceImpl0 = new EvaluatorServiceImpl();
      EvaluatorMapper evaluatorMapper0 = mock(EvaluatorMapper.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(evaluatorMapper0).insertSelective(any(com.recruit.recruitment.model.pojo.Evaluator.class));
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "evaluatorMapper", (Object) evaluatorMapper0);
      JwtTokenUtil jwtTokenUtil0 = mock(JwtTokenUtil.class, new ViolatedAssumptionAnswer());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "jwtTokenUtil", (Object) jwtTokenUtil0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "request", (Object) httpServletRequest0);
      UserMapper userMapper0 = mock(UserMapper.class, new ViolatedAssumptionAnswer());
      Injector.inject(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class, "userMapper", (Object) userMapper0);
      Injector.validateBean(evaluatorServiceImpl0, (Class<?>) EvaluatorServiceImpl.class);
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      evaluatorServiceImpl0.addEvaluator(evaluator0);
  }
}
