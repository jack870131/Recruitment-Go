/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:29:18 GMT 2020
 */

package com.recruit.recruitment.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.config.ESConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ESConfig_ESTest extends ESConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ESConfig eSConfig0 = new ESConfig();
      Injector.executePostConstruct((Object) eSConfig0, (Class<?>) ESConfig.class);
      eSConfig0.init();
  }
}
