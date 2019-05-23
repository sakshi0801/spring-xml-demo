Maven project having dependency spring-context 5.1.4.RELEASE

*Having classes:
- Application (Main class)
- Movie (Bean classe)
- Actor (Bean classe)

*Movie has-a Actor
*Actor contains attributes- name, gender, age

*Main class looks up Movie bean using XmlBeanFactory and using ApplicationContext
