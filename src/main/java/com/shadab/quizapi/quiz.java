package com.shadab.quizapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class quiz {
    public String quesno;
    public String ques;
    public String ans;

}
