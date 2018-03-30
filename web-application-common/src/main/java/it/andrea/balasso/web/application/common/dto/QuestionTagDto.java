package it.andrea.balasso.web.application.common.dto;

public class QuestionTagDto {

    private Long id;

    private QuestionDto questionDto;

    private TagDto tagDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionDto getQuestionDto() {
        return questionDto;
    }

    public void setQuestionDto(QuestionDto questionDto) {
        this.questionDto = questionDto;
    }

    public TagDto getTagDto() {
        return tagDto;
    }

    public void setTagDto(TagDto tagDto) {
        this.tagDto = tagDto;
    }
}
