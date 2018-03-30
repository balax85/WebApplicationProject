package it.andrea.balasso.web.application.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPANY_FIELD")
public class CompanyField {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "APPL_COMPANY_FIELD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_FIELD", referencedColumnName = "ID")
    private Field field;

    @ManyToOne
    @JoinColumn(name = "ID_FIELD", referencedColumnName = "ID")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
