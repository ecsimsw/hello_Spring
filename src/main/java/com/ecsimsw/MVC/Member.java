package com.ecsimsw.MVC;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter
public class Member {
    @Size(min = 5, max = 12)
    String name;

    @Size(min = 5, max = 12)
    String pw;
}
