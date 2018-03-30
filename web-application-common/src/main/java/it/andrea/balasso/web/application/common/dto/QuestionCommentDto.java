package it.andrea.balasso.web.application.common.dto;

public class QuestionCommentDto {

    private Long id;

    private String questionComment;

    private Boolean questionLike;

    private QuestionDto questionDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment;
    }

    public Boolean getQuestionLike() {
        return questionLike;
    }

    public void setQuestionLike(Boolean questionLike) {
        this.questionLike = questionLike;
    }

    public QuestionDto getQuestionDto() {
        return questionDto;
    }

    public void setQuestionDto(QuestionDto questionDto) {
        this.questionDto = questionDto;
    }
}
