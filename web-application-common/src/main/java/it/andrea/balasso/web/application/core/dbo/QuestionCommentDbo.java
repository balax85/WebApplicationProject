package it.andrea.balasso.web.application.core.dbo;

public class QuestionCommentDbo {

    private Long id;

    private String questionComment;

    private Boolean questionLike;

    private QuestionDbo questionDbo;

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

    public QuestionDbo getQuestionDbo() {
        return questionDbo;
    }

    public void setQuestionDbo(QuestionDbo questionDbo) {
        this.questionDbo = questionDbo;
    }
}
