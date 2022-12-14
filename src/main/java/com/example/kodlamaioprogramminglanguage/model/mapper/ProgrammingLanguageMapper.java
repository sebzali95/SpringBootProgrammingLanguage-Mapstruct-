package com.example.kodlamaioprogramminglanguage.model.mapper;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammingLanguageMapper {


    List<GetAllProgrammingLanguageResponseDto> toLanguageDTOs(List<ProgrammingLanguage> languages);

    GetProgrammingLanguageByIdResponseDto toLanguageDto(ProgrammingLanguage programmingLanguage);

    CreateProgrammingLanguageRequestDto toCreateLanguageRequest(ProgrammingLanguage programmingLanguage);

    void update(@MappingTarget ProgrammingLanguage language, UpdateProgrammingLanguageRequestDto request);

}
