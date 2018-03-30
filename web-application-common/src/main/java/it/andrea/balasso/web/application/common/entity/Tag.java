package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAG")
public class Tag {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_TAG_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TAG")
    private String tag;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionTag> questionTagList;

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

    public List<QuestionTag> getQuestionTagList() {
        return questionTagList;
    }

    public void setQuestionTagList(List<QuestionTag> questionTagList) {
        this.questionTagList = questionTagList;
    }
}
