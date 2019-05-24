package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application
{
    public static void main( String[] args )
    {
       System.out.println("Using Bean Factory");
        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Movie movie=(Movie)factory.getBean("movie");
        System.out.println(movie.getActor().getName()+" Acted in "+movie.getMovieName());

        System.out.println("Using Application Context");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie",Movie.class);
        System.out.println(movie1.getActor().getName()+" Acted in "+movie.getMovieName());

        //testing bean scope
        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=context1.getBean("movie",Movie.class);
        Movie movie3=context1.getBean("movie",Movie.class);
        System.out.println(movie2==movie3);

    }
}
