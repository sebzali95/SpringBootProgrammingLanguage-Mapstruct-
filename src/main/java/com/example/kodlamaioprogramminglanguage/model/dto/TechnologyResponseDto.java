package com.example.kodlamaioprogramminglanguage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnologyResponseDto {


    private Long id;

    @NotBlank(message = "name cannot be entered blank")
    private String name;
}