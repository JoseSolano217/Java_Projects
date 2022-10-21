package projects;

import java.util.Scanner;

public class SIF {
    Subject[] subjects;
    Subject bestSubject;
    Subject worstSubject;
    Subject highestNoteSubject;
    Subject lowestNoteSubject;

    public SIF(){}

    public SIF(Subject[] subjects, Subject bestSubject, Subject worstSubject, Subject highestNoteSubject, Subject lowestNoteSubject) {
        this.subjects = subjects;
        this.bestSubject = bestSubject;
        this.worstSubject = worstSubject;
        this.highestNoteSubject = highestNoteSubject;
        this.lowestNoteSubject = lowestNoteSubject;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
    public Subject getBestSubject() {
        return bestSubject;
    }
    public void setBestSubject(Subject bestSubject) {
        this.bestSubject = bestSubject;
    }
    public Subject getWorstSubject() {
        return worstSubject;
    }
    public void setWorstSubject(Subject worstSubject) {
        this.worstSubject = worstSubject;
    }
    public Subject getHighestNoteSubject() {
        return highestNoteSubject;
    }
    public void setHighestNoteSubject(Subject highestNoteSubject) {
        this.highestNoteSubject = highestNoteSubject;
    }
    public Subject getLowestNoteSubject() {
        return lowestNoteSubject;
    }
    public void setLowestNoteSubject(Subject lowestNoteSubject) {
        this.lowestNoteSubject = lowestNoteSubject;
    }

    public Subject[] addSubject() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This can only be used once");
        System.out.println("How many subjects are to be added?");
        subjects = new Subject[keyboard.nextInt()];
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = new Subject();
            System.out.println("Input the name of the subject " + (i+1));
            subjects[i].setName(keyboard.next());
        }
        return subjects;
    }

    public void seeSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i].toString() + "\n");
        }
    }

    public void getBestWorstHighLow() {
        Subject best = subjects[0];
        Subject worst = subjects[0];
        Subject high = subjects[0];
        Subject low = subjects[0];
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].promedy > best.promedy) {
                best = subjects[i];
            }
            if (subjects[i].promedy < worst.promedy) {
                worst = subjects[i];
            }
            if (subjects[i].highestNote > high.highestNote) {
                high = subjects[i];
            }
            if (subjects[i].lowestNote > low.lowestNote) {
                low = subjects[i];
            }
        }
        setBestSubject(best);
        setWorstSubject(worst);
        setHighestNoteSubject(high);
        setLowestNoteSubject(low);
    }
}
