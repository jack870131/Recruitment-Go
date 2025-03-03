/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 10 11:17:41 GMT 2020
 */

package com.recruit.recruitment.serviceImpl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DiscussionServiceImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.recruit.recruitment.serviceImpl.DiscussionServiceImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "MS950"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Jack\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "TW"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Jack\\Documents\\Java\\recruitment-go\\recruitment-server"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Jack"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "Jack"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.amqp.support.converter.SmartMessageConverter",
      "org.springframework.expression.ExpressionException",
      "org.springframework.expression.PropertyAccessor",
      "org.springframework.beans.factory.annotation.Autowired",
      "org.springframework.util.ErrorHandler",
      "com.rabbitmq.client.ContentHeader",
      "com.recruit.recruitment.service.DiscussionService",
      "org.apache.ibatis.annotations.Options$FlushCachePolicy",
      "org.apache.ibatis.annotations.Insert",
      "org.springframework.amqp.rabbit.connection.Connection",
      "org.springframework.amqp.rabbit.core.RabbitOperations",
      "com.recruit.recruitment.model.pojo.User",
      "com.rabbitmq.client.AMQP$BasicProperties",
      "org.springframework.amqp.rabbit.support.ListenerContainerAware",
      "org.springframework.amqp.rabbit.connection.RabbitAccessor",
      "org.springframework.transaction.support.ResourceHolder",
      "org.springframework.amqp.core.Correlation",
      "org.springframework.core.AttributeAccessor",
      "com.recruit.recruitment.config.JwtConfig",
      "org.apache.ibatis.type.JdbcType",
      "com.rabbitmq.client.Channel",
      "org.springframework.amqp.AmqpRejectAndDontRequeueException",
      "org.springframework.retry.RetryOperations",
      "org.springframework.amqp.AmqpException",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$ConfirmCallback",
      "com.rabbitmq.client.ConfirmListener",
      "org.springframework.core.ParameterizedTypeReference",
      "org.apache.ibatis.annotations.Options",
      "org.springframework.amqp.rabbit.connection.CorrelationData",
      "org.apache.ibatis.mapping.StatementType",
      "com.recruit.recruitment.mapper.NotificationSqlProvider",
      "org.springframework.amqp.rabbit.support.MessagePropertiesConverter",
      "org.springframework.amqp.rabbit.support.Delivery",
      "com.rabbitmq.client.ShutdownNotifier",
      "io.jsonwebtoken.Claims",
      "org.apache.ibatis.annotations.Results",
      "org.springframework.transaction.support.ResourceHolderSupport",
      "org.springframework.amqp.rabbit.core.RabbitOperations$OperationsCallback",
      "com.recruit.recruitment.mapper.NotificationMapper",
      "org.springframework.beans.factory.BeanFactoryAware",
      "org.springframework.stereotype.Service",
      "org.springframework.amqp.core.ReplyToAddressCallback",
      "org.springframework.stereotype.Indexed",
      "org.springframework.lang.Nullable",
      "org.apache.ibatis.annotations.Select",
      "org.apache.ibatis.annotations.ResultType",
      "org.apache.ibatis.annotations.Many",
      "org.springframework.amqp.core.MessageListener",
      "com.recruit.recruitment.model.pojo.Discussion",
      "com.recruit.recruitment.serviceImpl.DiscussionServiceImpl",
      "org.apache.ibatis.annotations.Delete",
      "org.springframework.beans.BeansException",
      "com.rabbitmq.client.DefaultConsumer",
      "org.apache.ibatis.type.UnknownTypeHandler",
      "org.springframework.context.Lifecycle",
      "org.apache.ibatis.type.BaseTypeHandler",
      "org.springframework.expression.ExpressionParser",
      "com.rabbitmq.client.ConfirmCallback",
      "org.springframework.beans.factory.BeanFactory",
      "org.springframework.expression.Expression",
      "org.springframework.expression.spel.standard.SpelExpressionParser",
      "com.recruit.recruitment.mapper.DiscussionMapper",
      "org.springframework.retry.support.RetryTemplate",
      "org.springframework.boot.configurationprocessor.json.JSONException",
      "org.springframework.expression.spel.SpelCompilerMode",
      "org.springframework.amqp.core.AcknowledgeMode",
      "com.rabbitmq.client.AMQP",
      "org.springframework.amqp.core.AmqpTemplate",
      "org.springframework.amqp.AmqpIllegalStateException",
      "org.springframework.amqp.core.MessagePostProcessor",
      "org.apache.ibatis.mapping.FetchType",
      "org.springframework.retry.RecoveryCallback",
      "org.apache.ibatis.type.TypeReference",
      "org.springframework.core.SpringProperties",
      "org.springframework.amqp.rabbit.connection.PendingConfirm",
      "com.rabbitmq.client.Consumer",
      "com.rabbitmq.client.impl.AMQContentHeader",
      "com.rabbitmq.client.GetResponse",
      "org.apache.ibatis.annotations.Result",
      "org.springframework.core.NestedRuntimeException",
      "org.springframework.amqp.rabbit.connection.PublisherCallbackChannel$Listener",
      "org.springframework.amqp.support.converter.MessageConverter",
      "org.springframework.expression.BeanResolver",
      "org.springframework.boot.configurationprocessor.json.JSONTokener",
      "org.springframework.expression.EvaluationContext",
      "org.springframework.amqp.core.ReceiveAndReplyCallback",
      "org.springframework.amqp.core.Address",
      "org.apache.ibatis.annotations.Update",
      "org.springframework.boot.configurationprocessor.json.JSON",
      "org.springframework.amqp.rabbit.connection.ConnectionFactory",
      "org.springframework.beans.factory.Aware",
      "com.recruit.recruitment.model.pojo.Role",
      "org.apache.ibatis.annotations.UpdateProvider",
      "com.rabbitmq.client.BasicProperties",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$2",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$1",
      "com.rabbitmq.client.ShutdownSignalException",
      "org.springframework.beans.factory.InitializingBean",
      "org.springframework.amqp.rabbit.core.ConsumeOkNotReceivedException",
      "com.recruit.recruitment.utils.JwtTokenUtil",
      "com.recruit.recruitment.mapper.DiscussionSqlProvider",
      "org.springframework.expression.common.TemplateAwareExpressionParser",
      "com.rabbitmq.utility.SensibleClone",
      "org.springframework.amqp.core.Message",
      "org.springframework.amqp.rabbit.core.CorrelationDataPostProcessor",
      "org.springframework.security.core.userdetails.UserDetails",
      "org.apache.ibatis.type.TypeHandler",
      "org.springframework.boot.configurationprocessor.json.JSONArray",
      "org.springframework.beans.factory.BeanNameAware",
      "org.springframework.amqp.rabbit.core.RabbitTemplate",
      "org.springframework.expression.ParseException",
      "org.springframework.amqp.rabbit.connection.RabbitResourceHolder",
      "com.recruit.recruitment.mapper.UserSqlProvider",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$TemplateConsumer",
      "org.springframework.amqp.rabbit.core.ChannelCallback",
      "org.apache.ibatis.mapping.ResultSetType",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$ReturnCallback",
      "org.springframework.expression.spel.SpelParserConfiguration",
      "com.recruit.recruitment.mapper.UserMapper",
      "com.recruit.recruitment.model.pojo.Notification",
      "io.jsonwebtoken.ClaimsMutator",
      "org.springframework.stereotype.Component",
      "org.springframework.amqp.rabbit.core.RabbitTemplate$PendingReply",
      "org.apache.ibatis.annotations.One",
      "org.springframework.retry.RetryContext",
      "com.rabbitmq.client.Envelope",
      "com.rabbitmq.client.impl.AMQBasicProperties",
      "org.apache.ibatis.annotations.InsertProvider"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.recruit.recruitment.mapper.DiscussionMapper", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.recruit.recruitment.mapper.NotificationMapper", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.recruit.recruitment.mapper.UserMapper", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.recruit.recruitment.model.pojo.Discussion", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.recruit.recruitment.model.pojo.User", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.recruit.recruitment.utils.JwtTokenUtil", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.servlet.http.HttpServletRequest", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.amqp.rabbit.core.RabbitTemplate", false, DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DiscussionServiceImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.recruit.recruitment.serviceImpl.DiscussionServiceImpl",
      "org.apache.ibatis.mapping.FetchType",
      "org.apache.ibatis.type.JdbcType",
      "com.recruit.recruitment.utils.JwtTokenUtil",
      "org.springframework.amqp.rabbit.connection.RabbitAccessor",
      "org.springframework.expression.common.TemplateAwareExpressionParser",
      "org.springframework.expression.spel.standard.SpelExpressionParser",
      "org.springframework.core.SpringProperties",
      "org.springframework.expression.spel.SpelCompilerMode",
      "org.springframework.expression.spel.SpelParserConfiguration",
      "org.springframework.amqp.rabbit.core.RabbitTemplate",
      "org.apache.ibatis.mapping.ResultSetType",
      "org.apache.ibatis.mapping.StatementType",
      "org.apache.ibatis.annotations.Options$FlushCachePolicy",
      "com.recruit.recruitment.model.pojo.Discussion",
      "org.springframework.boot.configurationprocessor.json.JSONArray",
      "org.springframework.boot.configurationprocessor.json.JSONTokener",
      "org.springframework.boot.configurationprocessor.json.JSON",
      "org.springframework.boot.configurationprocessor.json.JSONException",
      "com.recruit.recruitment.model.pojo.User",
      "com.recruit.recruitment.model.pojo.Notification"
    );
  }
}
