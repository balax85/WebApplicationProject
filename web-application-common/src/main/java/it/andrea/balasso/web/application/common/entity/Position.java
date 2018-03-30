package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "POSITION")
public class Position {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_POSITION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "POSITION")
    private String position;

    @ManyToOne
    @JoinColumn(name = "ID_COMPANY", referencedColumnName = "ID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "ID_DEPARTMENT", referencedColumnName = "ID")
    private Department department;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Interview> interviewList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Interview> getInterviewList() {
        return interviewList;
    }

    public void setInterviewList(List<Interview> interviewList) {
        this.interviewList = interviewList;
    }
}
