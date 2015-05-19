package hu.pte.ttk.tams.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Thesis implements Serializable {
    @Id
    @GeneratedValue
    private Long thesisID;

    @Column
    private String title;

    @Column(nullable = false)
    private String student;

    @Column(nullable = false)
    private String supervisor;

    @Column
    private String externalConsultant;

    @Column
    private String opponent;

    @Column
    private Date dateOfSubmission;

    @Column
    private Integer opponentEvaluation;

    @Column
    private Date dateOfDefense;

    @Column
    private Integer resultOfDefense;

    @Column
    private Integer result;

    @Column
    private String pdfFile;

    @Column
    private String xxxFile;

    protected Thesis() {}

    public Thesis(String title, String student, String supervisor, String externalConsultant, String opponent, Date dateOfSubmission,
                  Integer opponentEvaluation, Date dateOfDefense, Integer resultOfDefense, Integer result, String pdfFile, String xxxFile) {
        //super();
        this.title = title;
        this.student = student;
        this.supervisor = supervisor;
        this.externalConsultant = externalConsultant;
        this.opponent = opponent;
        this.dateOfSubmission = dateOfSubmission;
        this.opponentEvaluation = opponentEvaluation;
        this.dateOfDefense = dateOfDefense;
        this.resultOfDefense = resultOfDefense;
        this.result = result;
        this.pdfFile = pdfFile;
        this.xxxFile = xxxFile;
    }

    public Long getThesisID() {
        return this.thesisID;
    }

    public String getTitle() {
        return this.title;
    }

    public String getStudent() {
        return this.student;
    }

    public String getSupervisor() {
        return this.supervisor;
    }

    public String getExternalConsultant() {
        return this.externalConsultant;
    }

    public String getOpponent() {
        return this.opponent;
    }

    public Date getDateOfSubmission() {
        return this.dateOfSubmission;
    }

    public Integer getOpponentEvaluation() {
        return this.opponentEvaluation;
    }

    public Date getDateOfDefense() {
        return this.dateOfDefense;
    }

    public Integer getResultOfDefense() {
        return this.resultOfDefense;
    }

    public Integer getResult() {
        return this.result;
    }

    public String getPdfFile() {
        return this.pdfFile;
    }

    public String getXxxFile() {
        return this.xxxFile;
    }
}
