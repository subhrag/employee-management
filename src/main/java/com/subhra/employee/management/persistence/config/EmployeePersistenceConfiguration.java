package com.subhra.employee.management.persistence.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan(basePackages = "com.subhra.employee.management.persistence")
@EnableJpaRepositories(basePackages = "com.subhra.employee.management.persistence.repository", entityManagerFactoryRef="entityManagerFactoryBean")
public class EmployeePersistenceConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setGenerateDdl(true);
		hibernateJpaVendorAdapter.setDatabase(Database.HSQL);
		hibernateJpaVendorAdapter.setShowSql(true);
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		localContainerEntityManagerFactoryBean.setDataSource(dataSource());
		localContainerEntityManagerFactoryBean.setPackagesToScan("com.subhra.employee.management.persistence.dto");
		return localContainerEntityManagerFactoryBean;
	}

	@Bean
	public DataSource dataSource() {

		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();

	}
}
