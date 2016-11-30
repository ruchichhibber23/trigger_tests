<?xml version="1.0" encoding="UTF-8"?>

<!-- Rule Id = SEC-SS-FILTER-4 -->
 <beans:beans xmlns="http://www.springframework.org/schema/security"
 xmlns:beans="http://www.springframework.org/schema/beans"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
http://www.springframework.org/schema/security
http://www.springframework.org/schema/security/spring-security.xsd">

<!-- //beans/security:http/security:intercept-url[not(@pattern='') and @access='permitAll'] --> 

<http>
 <intercept-url pattern="/**" access="permitAll" />
 </http>
 </beans:beans>
