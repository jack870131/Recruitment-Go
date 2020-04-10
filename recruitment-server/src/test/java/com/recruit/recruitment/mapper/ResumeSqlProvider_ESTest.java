/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 10:57:59 GMT 2020
 */

package com.recruit.recruitment.mapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.mapper.ResumeSqlProvider;
import com.recruit.recruitment.model.pojo.Resume;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ResumeSqlProvider_ESTest extends ResumeSqlProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      // Undeclared exception!
      try { 
        resumeSqlProvider0.updateByPrimaryKeySelective((Resume) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.ResumeSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      // Undeclared exception!
      try { 
        resumeSqlProvider0.insertSelective((Resume) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.ResumeSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setEdudescript(" x{*");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET edudescript = #{edudescript,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      MockDate mockDate0 = new MockDate();
      resume0.setEduend(mockDate0);
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET eduend = #{eduend,jdbcType=DATE}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      MockDate mockDate0 = new MockDate();
      resume0.setEdustart(mockDate0);
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET edustart = #{edustart,jdbcType=DATE}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setSchool("UPDATE resume\nSET name = #{name,jdbcType=VARCHAR}, location = #{location,jdbcType=VARCHAR}, website = #{website,jdbcType=VARCHAR}, statement = #{statement,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET school = #{school,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setMajor("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET major = #{major,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setStatement("");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET statement = #{statement,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setWebsite("1");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET website = #{website,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setIntention("1");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET intention = #{intention,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setLocation("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET location = #{location,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setPhone("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET phone = #{phone,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setName("x{*jV2N#kJ^EC");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET name = #{name,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setMail("1");
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET mail = #{mail,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      Integer integer0 = new Integer((-2947));
      resume0.setUserid(integer0);
      String string0 = resumeSqlProvider0.updateByPrimaryKeySelective(resume0);
      assertEquals("UPDATE resume\nSET userid = #{userid,jdbcType=INTEGER}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setEdudescript(" x{*");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (edudescript)\nVALUES (#{edudescript,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      MockDate mockDate0 = new MockDate();
      resume0.setEduend(mockDate0);
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (eduend)\nVALUES (#{eduend,jdbcType=DATE})", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      MockDate mockDate0 = new MockDate();
      resume0.setEdustart(mockDate0);
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (edustart)\nVALUES (#{edustart,jdbcType=DATE})", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setSchool("UPDATE resume\nSET name = #{name,jdbcType=VARCHAR}, location = #{location,jdbcType=VARCHAR}, website = #{website,jdbcType=VARCHAR}, statement = #{statement,jdbcType=VARCHAR}\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (school)\nVALUES (#{school,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setMajor("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (major)\nVALUES (#{major,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setStatement("");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (statement)\nVALUES (#{statement,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setWebsite("1");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (website)\nVALUES (#{website,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setIntention("1");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (intention)\nVALUES (#{intention,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setLocation("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (location)\nVALUES (#{location,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setPhone("UPDATE resume\nWHERE (resumeid = #{resumeid,jdbcType=INTEGER})");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (phone)\nVALUES (#{phone,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setName("x{*jV2N#kJ^EC");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (name)\nVALUES (#{name,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      resume0.setMail("1");
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (mail)\nVALUES (#{mail,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      Integer integer0 = new Integer((-2947));
      resume0.setUserid(integer0);
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (userid)\nVALUES (#{userid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResumeSqlProvider resumeSqlProvider0 = new ResumeSqlProvider();
      Resume resume0 = new Resume();
      Integer integer0 = new Integer((-50));
      resume0.setResumeid(integer0);
      String string0 = resumeSqlProvider0.insertSelective(resume0);
      assertEquals("INSERT INTO resume\n (resumeid)\nVALUES (#{resumeid,jdbcType=INTEGER})", string0);
  }
}
