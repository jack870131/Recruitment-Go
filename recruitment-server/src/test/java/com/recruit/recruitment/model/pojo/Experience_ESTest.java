/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:23:52 GMT 2020
 */

package com.recruit.recruitment.model.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.model.pojo.Experience;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Experience_ESTest extends Experience_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer(0);
      experience0.setUserid(integer0);
      Integer integer1 = experience0.getUserid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer(2412);
      experience0.setUserid(integer0);
      Integer integer1 = experience0.getUserid();
      assertEquals(2412, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer((-336));
      experience0.setUserid(integer0);
      Integer integer1 = experience0.getUserid();
      assertEquals((-336), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobtitle("'R}H@Mg)");
      String string0 = experience0.getJobtitle();
      assertEquals("'R}H@Mg)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobdescript("7_Di");
      String string0 = experience0.getJobdescript();
      assertEquals("7_Di", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer(0);
      experience0.setExpid(integer0);
      Integer integer1 = experience0.getExpid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer((-1468));
      experience0.setExpid(integer0);
      Integer integer1 = experience0.getExpid();
      assertEquals((-1468), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = new Integer(2046);
      experience0.setExpid(integer0);
      Integer integer1 = experience0.getExpid();
      assertEquals(2046, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setCompanyname("${");
      String string0 = experience0.getCompanyname();
      assertEquals("${", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobdescript((String) null);
      assertNull(experience0.getJobtitle());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobdescript("");
      String string0 = experience0.getJobdescript();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobtitle((String) null);
      assertNull(experience0.getUserid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobtitle("");
      String string0 = experience0.getJobtitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setCompanyname((String) null);
      assertNull(experience0.getUserid());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setCompanyname("");
      String string0 = experience0.getCompanyname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Experience experience0 = new Experience();
      Date date0 = experience0.getJobend();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Experience experience0 = new Experience();
      String string0 = experience0.getJobdescript();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = experience0.getUserid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobend((Date) null);
      assertNull(experience0.getCompanyname());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Experience experience0 = new Experience();
      String string0 = experience0.getCompanyname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Experience experience0 = new Experience();
      Date date0 = experience0.getJobstart();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Experience experience0 = new Experience();
      experience0.setJobstart((Date) null);
      assertNull(experience0.getJobdescript());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Experience experience0 = new Experience();
      String string0 = experience0.getJobtitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Experience experience0 = new Experience();
      Integer integer0 = experience0.getExpid();
      assertNull(integer0);
  }
}
