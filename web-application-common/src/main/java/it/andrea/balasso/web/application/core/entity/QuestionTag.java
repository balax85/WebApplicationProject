package it.andrea.balasso.web.application.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION_TAG")
public class QuestionTag {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_QUESTION_TAG_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_QUESTION", referencedColumnName = "ID")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "ID_TAG", referencedColumnName = "ID")
    private Tag tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
