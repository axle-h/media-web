package com.axh.media.init;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
@ComponentScan("com.axh.media")
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {

	private static final String MESSAGE_SOURCE = "/WEB-INF/i18n/messages";
	private static final String VIEWS = "/WEB-INF/views/";

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean(name = "messageSource")
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename(MESSAGE_SOURCE);
		messageSource.setCacheSeconds(5);
		return messageSource;
	}

	@Bean
	public TemplateResolver templateResolver() {
		TemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix(VIEWS);
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		templateEngine.addDialect(new LayoutDialect());
		//templateEngine.addDialect(new SpringSecurityDialect());
		return templateEngine;
	}

	@Bean
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
		thymeleafViewResolver.setTemplateEngine(templateEngine());
		thymeleafViewResolver.setCharacterEncoding("UTF-8");
		return thymeleafViewResolver;
	}
}
