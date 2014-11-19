package models;


import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Annotation extends Model {
    @Column(name = "transcript_name", nullable = false)
    public String transcriptName;

    public Annotation() {
    }

    public Annotation(String str) {
        this.transcriptName = str;
    }

    public String getTranscriptName() {
        return transcriptName;
    }

    public void setTranscriptName(String transcriptName) {
        this.transcriptName = transcriptName;
    }

    public static Model.Finder<Long, Annotation> find = new Model.Finder<>(Long.class, Annotation.class);
}
