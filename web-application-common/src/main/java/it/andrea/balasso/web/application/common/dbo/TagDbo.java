package it.andrea.balasso.web.application.common.dbo;

import java.util.List;

public class TagDbo {

    private Long id;

    private String tag;

    private List<QuestionTagDbo> questionTagDboList;

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

    public List<QuestionTagDbo> getQuestionTagDboList() {
        return questionTagDboList;
    }

    public void setQuestionTagDboList(List<QuestionTagDbo> questionTagDboList) {
        this.questionTagDboList = questionTagDboList;
    }
}
