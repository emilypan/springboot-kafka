package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<?, ?> kafkaListenerContainerFactory(
//            ConcurrentKafkaListenerContainerFactoryConfigurer configurer,
//            ConsumerFactory<Object, Object> kafkaConsumerFactory,
//            KafkaTemplate<Object, Object> template) {
//        ConcurrentKafkaListenerContainerFactory<Object, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        configurer.configure(factory, kafkaConsumerFactory);
//        factory.setErrorHandler(new SeekToCurrentErrorHandler(
//                new DeadLetterPublishingRecoverer(template), new FixedBackOff(0L, 2)));
//        return factory;
//    }
//
//    @Bean
//    public NewTopic topic1() {
//        return new NewTopic("foo", 1, (short) 1);
//    }
//	@Bean
//	public KafkaSender kafkaSender() {
//		return new KafkaSender();
//	}

}
