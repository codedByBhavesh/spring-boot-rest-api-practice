# Java Configuration

Java Configuration me Spring beans create karne ke liye `@Configuration` aur `@Bean` use karte hain.

### Dependency Injection


@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Student student(Address address) {
        return new Student(address);
    }
}


* `@Configuration` → configuration class.
* `@Bean` → Spring bean create karta hai.
* `student(Address address)` → dependency injection.
