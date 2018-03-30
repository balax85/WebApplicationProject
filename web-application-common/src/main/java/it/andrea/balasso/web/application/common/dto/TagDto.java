package it.andrea.balasso.web.application.common.dto;

import java.util.List;

public class TagDto {

    private Long id;

    private String tag;

    private List<QuestionTagDto> questionTagDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<QuestionTagDto> getQuestionTagDtoList() {
        return questionTagDtoList;
    }

    public void setQuestionTagDtoList(List<QuestionTagDto> questionTagDtoList) {
        this.questionTagDtoList = questionTagDtoList;
    }
}
