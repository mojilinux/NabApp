package io.github.mojilinux.nabApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//extends SpringBootServletInitializer
public class NabAppApplication  {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return super.configure(builder);
//	}

	public static void main(String[] args) {
		SpringApplication.run(NabAppApplication.class, args);
	}

}
