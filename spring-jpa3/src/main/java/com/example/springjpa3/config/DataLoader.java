package com.example.springjpa3.config;

import com.example.springjpa3.model.Department;
import com.example.springjpa3.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private final DepartmentRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var sales = new Department();
        sales.setName("営業");
        repository.save(sales);

        var development = new Department();
        development.setName("開発");
        repository.save(development);
    }
}
