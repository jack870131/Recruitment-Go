/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:35:46 GMT 2020
 */

package com.recruit.recruitment.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.config.RedisConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisConfig_ESTest extends RedisConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RedisConfig redisConfig0 = new RedisConfig();
      assertEquals(1000L, RedisConfig.REDIS_LIMIT_REQUEST_FREQUENCY_TIME);
  }
}
