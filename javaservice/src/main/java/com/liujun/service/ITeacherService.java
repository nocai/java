package com.liujun.service;

import com.liujun.entity.Teacher;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Validated
public interface ITeacherService {
    @NotNull @Valid
    Teacher getTeacher(@NotNull @Min(value = 1) Integer id);
}
