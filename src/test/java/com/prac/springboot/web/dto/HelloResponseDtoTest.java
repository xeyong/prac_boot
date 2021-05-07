package com.prac.springboot.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test(){
        //given
        String name ="test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);//@@RequiredArgsConstructor가 정상적으로 생성자를 생성하는지

        //then
        assertThat(dto.getName()).isEqualTo(name);//lombok의 @Getter가 정상작동을 하는지
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
