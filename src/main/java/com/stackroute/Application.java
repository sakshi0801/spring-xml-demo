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
        Movie movie=(Movie)factory.getBean("movie1");
        System.out.println(movie.getActor().getName()+" Acted in "+movie.getMovieName());

        System.out.println("Using Application Context");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActor().getName()+" Acted in "+movie1.getMovieName());

        //Movie movie2=context.getBean("movie2",Movie.class);
        //System.out.println(movie2);

        /*Movie movie2=context.getBean("movie2",Movie.class);
        System.out.println(movie2.getActor().getName()+" Acted in "+movie2.getMovieName());

        Movie movie3=context.getBean("movie3",Movie.class);
        System.out.println(movie3.getActor().getName()+" Acted in "+movie3.getMovieName());

        //testing bean scope prototype
        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieS1=context1.getBean("movie",Movie.class);
        Movie movieS2=context1.getBean("movie",Movie.class);
        System.out.println(movieS1==movieS2);

        //Multiple names of bean
        System.out.println("Access Movie bean by its two different names");
        Movie movieBean1=context1.getBean("movieA",Movie.class);
        Movie movieBean2=context1.getBean("movieB",Movie.class);
        System.out.println(movieBean1);
        System.out.println(movieBean2);*/

    }
}
