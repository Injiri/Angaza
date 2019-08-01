package com.shirucodes.angaza.models;

public class Paragraph {
    String paragraphText;
    String paragraphScore;
    String paragraphAuthenticity;

    public Paragraph() {

    }

    public Paragraph(String paragraphText, String paragraphScore, String paragraphAuthenticity) {
        this.paragraphText = paragraphText;
        this.paragraphScore = paragraphScore;
        this.paragraphAuthenticity = paragraphAuthenticity;
    }

    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    public String getParagraphScore() {
        return paragraphScore;
    }

    public void setParagraphScore(String paragraphScore) {
        this.paragraphScore = paragraphScore;
    }

    public String getParagraphAuthenticity() {
        return paragraphAuthenticity;
    }

    public void setParagraphAuthenticity(String paragraphAuthenticity) {
        this.paragraphAuthenticity = paragraphAuthenticity;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "paragraphText='" + paragraphText + '\'' +
                ", paragraphScore=" + paragraphScore +
                ", paragraphAuthenticity='" + paragraphAuthenticity + '\'' +
                '}';
    }
}
