package it.andrea.balasso.web.application.common.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FIELD")
public class Field {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_FIELD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIELD")
    private String field;

    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CompanyField> companyFieldList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<CompanyField> getCompanyFieldList() {
        return companyFieldList;
    }

    public void setCompanyFieldList(List<CompanyField> companyFieldList) {
        this.companyFieldList = companyFieldList;
    }
}
