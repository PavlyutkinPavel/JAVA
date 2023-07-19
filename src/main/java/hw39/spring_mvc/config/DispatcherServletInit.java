package hw39.spring_mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    //классы которые поднимают нужные нам бины
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //наш ViewResolver(класс с настройками)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //на какие url отвечаем
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}