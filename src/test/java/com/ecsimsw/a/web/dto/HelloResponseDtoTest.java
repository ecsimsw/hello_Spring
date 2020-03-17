package com.ecsimsw.a.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void LombokTest(){
        String name = "Test";
        int age = 24;

        HelloResponseDto dto = new HelloResponseDto(name, age);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAge()).isEqualTo(age);
    }
}
