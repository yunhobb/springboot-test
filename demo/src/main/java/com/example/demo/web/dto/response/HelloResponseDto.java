package com.example.demo.web.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto{

    private final String name;
    private final int amount;
}
