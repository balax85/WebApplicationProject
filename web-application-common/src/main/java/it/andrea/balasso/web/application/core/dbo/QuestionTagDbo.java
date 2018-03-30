package it.andrea.balasso.web.application.core.dbo;

public class QuestionTagDbo {

    private Long id;

    private QuestionDbo questionDbo;

    private TagDbo tagDbo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionDbo getQuestionDbo() {
        return questionDbo;
    }

    public void setQuestionDbo(QuestionDbo questionDbo) {
        this.questionDbo = questionDbo;
    }

    public TagDbo getTagDbo() {
        return tagDbo;
    }

    public void setTagDbo(TagDbo tagDbo) {
        this.tagDbo = tagDbo;
    }
}
