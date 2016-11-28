<?xml version="1.0" encoding="UTF-8"?>

<!-- Rule Id = SEC-SS-INFO -->
<beans:beans xmlns="http://www.springframework.org/schema/security"
	xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    				  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
					  http://www.springframework.org/schema/security
                      http://www.springframework.org/schema/security/spring-security.xsd">
                      
<!-- //beans:beans/debug -->                      

		<debug />

</beans:beans>
<?xml version="1.0" encoding="UTF-8"?>

<!-- Rule Id = SEC-SS-CHN -->
<beans:beans xmlns="http://www.springframework.org/schema/security"
	xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    				  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
					  http://www.springframework.org/schema/security
                      http://www.springframework.org/schema/security/spring-security.xsd">
                      
<!-- //beans/security:http[@disable-url-rewriting='false'] -->                      

	
			<http pattern="/**" disable-url-rewriting="false" />
	
</beans:beans>
<?xml version="1.0" encoding="UTF-8"?>

<!-- Rule Id = SEC-SS-FILTER-2 -->
<beans:beans xmlns="http://www.springframework.org/schema/security"
  xmlns:beans="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://www.springframework.org/schema/beans
    				  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
					  http://www.springframework.org/schema/security
                      http://www.springframework.org/schema/security/spring-security.xsd">
           
  <http pattern="resources" security="none" />

<http pattern="/static/**" security="none"/>

<http pattern="/loggedout.jsp*" security="none"/>

<http pattern="/**" disable-url-rewriting="false" />

<http>
<intercept-url pattern="/login.jsp" access="ROLE_USER" requires-channel="any"/>
</http>
<http>
<intercept-url pattern="/**" access="ROLE_USER" requires-channel="any"/>
</http>

<http><intercept-url pattern="/**" access="permitAll" />
</http>

<debug />

</beans:beans> 
 

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
<?xml version="1.0" encoding="UTF-8"?>
<!-- Rule Id = SEC-SS-HTTP -->
<beans:beans xmlns="http://www.springframework.org/schema/security"
	xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    				  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
					  http://www.springframework.org/schema/security
                      http://www.springframework.org/schema/security/spring-security.xsd">
                      
<!-- //beans/security:http/security:intercept-url[not(@pattern='') and @access='permitAll'] -->                      
<http> 
<intercept-url pattern=" " access="permitAll" />
</http> 
<http><intercept-url pattern="/admin" access="hasRole('admin') and isAuthenticated()" />
<intercept-url pattern=" " access="isAnonymous()" />
</http>
<http> 
<intercept-url pattern="/sensitive-function" access="permitAll" />
</http>
</beans:beans>