/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:28:24 GMT 2020
 */

package com.recruit.recruitment.model.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.model.pojo.Application;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Application_ESTest extends Application_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Application application0 = new Application();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      application0.setScoreavg(bigDecimal0);
      BigDecimal bigDecimal1 = application0.getScoreavg();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Application application0 = new Application();
      BigDecimal bigDecimal0 = new BigDecimal((-1161));
      application0.setScoreavg(bigDecimal0);
      BigDecimal bigDecimal1 = application0.getScoreavg();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Application application0 = new Application();
      BigDecimal bigDecimal0 = new BigDecimal(185L);
      application0.setScoreavg(bigDecimal0);
      BigDecimal bigDecimal1 = application0.getScoreavg();
      assertEquals((short)185, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(0);
      application0.setResumeid(integer0);
      Integer integer1 = application0.getResumeid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer((-245));
      application0.setResumeid(integer0);
      Integer integer1 = application0.getResumeid();
      assertEquals((-245), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(1957);
      application0.setResumeid(integer0);
      Integer integer1 = application0.getResumeid();
      assertEquals(1957, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(0);
      application0.setPostid(integer0);
      Integer integer1 = application0.getPostid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer((-2520));
      application0.setPostid(integer0);
      Integer integer1 = application0.getPostid();
      assertEquals((-2520), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(1422);
      application0.setPostid(integer0);
      Integer integer1 = application0.getPostid();
      assertEquals(1422, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(0);
      application0.setPicknum(integer0);
      Integer integer1 = application0.getPicknum();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer((-703));
      application0.setPicknum(integer0);
      Integer integer1 = application0.getPicknum();
      assertEquals((-703), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(1232);
      application0.setPicknum(integer0);
      Integer integer1 = application0.getPicknum();
      assertEquals(1232, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Application application0 = new Application();
      application0.setLocation("ci==yi&.04w");
      String string0 = application0.getLocation();
      assertEquals("ci==yi&.04w", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Application application0 = new Application();
      application0.setLocation("");
      String string0 = application0.getLocation();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Application application0 = new Application();
      application0.setJobname("l$R;ML[RB4XA~");
      String string0 = application0.getJobname();
      assertEquals("l$R;ML[RB4XA~", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Application application0 = new Application();
      application0.setCategory("%");
      String string0 = application0.getCategory();
      assertEquals("%", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(0);
      application0.setApplicationid(integer0);
      Integer integer1 = application0.getApplicationid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer(329);
      application0.setApplicationid(integer0);
      Integer integer1 = application0.getApplicationid();
      assertEquals(329, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = new Integer((-1846));
      application0.setApplicationid(integer0);
      Integer integer1 = application0.getApplicationid();
      assertEquals((-1846), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Application application0 = new Application();
      application0.setApplicant("ci==yi&.04w");
      String string0 = application0.getApplicant();
      assertEquals("ci==yi&.04w", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Application application0 = new Application();
      application0.setCategory("");
      String string0 = application0.getCategory();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Application application0 = new Application();
      BigDecimal bigDecimal0 = application0.getScoreavg();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Application application0 = new Application();
      application0.setApplicant("");
      String string0 = application0.getApplicant();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.getCategory();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.getLocation();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.getApplicant();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Application application0 = new Application();
      application0.setJobname("");
      String string0 = application0.getJobname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Application application0 = new Application();
      String string0 = application0.getJobname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = application0.getResumeid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = application0.getApplicationid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = application0.getPicknum();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Application application0 = new Application();
      Integer integer0 = application0.getPostid();
      assertNull(integer0);
  }
}
