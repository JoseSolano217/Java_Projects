package projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        SIF sif = new SIF();
        Main m = new Main();
        boolean check1 = false;
        while (!check1) {
            int option = m.menu();
            boolean check2 = false;
            switch (option) {
                case 1:
                    if (sif.subjects[0] == null) {
                        sif.addSubject();
                    } else {
                        System.out.println("Can't do that chief, subjects are already saved");
                    }
                    break;
                case 2:
                    int sub;
                    while (!check2) {
                        int option2 = m.subjectMenu();
                        switch (option2) {
                            case 1 -> {
                                try {
                                    Subject checc = sif.subjects[0];
                                } catch (NullPointerException e) {
                                    System.err.println("There are no subjects, add some and try again");
                                } finally {
                                    if (sif.subjects != null) {
                                        System.out.println("Select a subject to add students");
                                        for (int i = 0; i < sif.subjects.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        sub = (m.keyboard.nextInt() - 1);
                                        sif.subjects[sub].addStudent(sub, sif);
                                        sif.subjects[sub].getHighestLowestNPromedy(sub, sif);
                                    }
                                }
                            }
                            case 2 -> {
                                try {
                                    sif.subjects[0].toUseString(0, sif);
                                } catch (NullPointerException e) {
                                    System.err.println("There are no subjects or no students, add some and try again");
                                } finally {
                                    if (sif.subjects != null) {
                                        System.out.println("Select a subject to see it's students");
                                        for (int i = 0; i < sif.subjects.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        sub = (m.keyboard.nextInt() - 1);
                                        sif.subjects[sub].seeStudents(sub, sif);
                                    }
                                }
                            }
                            case 3 -> {
                                try {
                                    sif.subjects[0].toUseString(0, sif);
                                } catch (NullPointerException e) {
                                    System.err.println("There are no subjects or no students, add some and try again");
                                } finally {
                                    if (sif.subjects != null) {
                                        System.out.println("Select a subject to see the highest note");
                                        for (int i = 0; i < sif.subjects.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        sub = (m.keyboard.nextInt() - 1);
                                        System.out.println(sif.subjects[sub].getHighestNote());
                                    }
                                }
                            }
                            case 4 -> {
                                try {
                                    sif.subjects[0].toUseString(0, sif);
                                } catch (NullPointerException e) {
                                    System.err.println("There are no subjects or no students, add some and try again");
                                } finally {
                                    if (sif.subjects != null) {
                                        System.out.println("Select a subject to see the lowest note");
                                        for (int i = 0; i < sif.subjects.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        sub = (m.keyboard.nextInt() - 1);
                                        System.out.println(sif.subjects[sub].getLowestNote());
                                    }
                                }
                            }
                            case 5 -> {
                                try {
                                    sif.subjects[0].toUseString(0, sif);
                                } catch (NullPointerException e) {
                                    System.err.println("There are no subjects or no students, add some and try again");
                                } finally {
                                    if (sif.subjects != null) {
                                        System.out.println("Select a subject to see the students in order of notes");
                                        for (int i = 0; i < sif.subjects.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        sub = (m.keyboard.nextInt() - 1);
                                        int[] vec = new int[sif.subjects[sub].students.length];
                                        for (int i = 0; i < sif.subjects[sub].students.length; i++) {
                                            System.out.println((i + 1) + ". " + sif.subjects[i].getName());
                                        }
                                        System.out.println(sif.subjects[sub].quicksort(sif.subjects[sub], 0, sif.subjects[sub].students.length));
                                    }
                                }
                            }
                            case 6 -> check2 = true;
                            default -> System.out.println("The value must be between 1 and 5");
                        }
                    }
                    break;
                case 3:
                    sif.getBestWorstHighLow();
                    try {
                        System.out.println(sif.getHighestNoteSubject().toString());
                    } catch (NullPointerException e) {
                        System.err.println("The selected subject is null");
                    } catch (Exception e) {
                        System.err.println("Something went wrong");
                    }
                    break;
                case 4:
                    sif.getBestWorstHighLow();
                    try {
                        System.out.println(sif.getLowestNoteSubject().toString());
                    } catch (NullPointerException e) {
                        System.err.println("The selected subject is null");
                    } catch (Exception e) {
                        System.err.println("Something went wrong");
                    }
                    break;
                case 5:
                    sif.getBestWorstHighLow();
                    try {
                        System.out.println(sif.getBestSubject().toString());
                    } catch (NullPointerException e) {
                        System.err.println("The selected subject is null");
                    } catch (Exception e) {
                        System.err.println("Something went wrong");
                    }
                    break;
                case 6:
                    sif.getBestWorstHighLow();
                    try {
                        System.out.println(sif.getWorstSubject().toString());
                    } catch (NullPointerException e) {
                        System.err.println("The selected subject is null");
                    } catch (Exception e) {
                        System.err.println("Something went wrong");
                    }
                    break;
                case 7:
                    check1 = true;
                    break;
                default:
                    System.out.println("Input an option between 1 and 7");
            }
        }
    }

    public int menu() {
        System.out.println("Select an option from below");
        System.out.println("""
                1. Add subjects
                2. Manage subjects
                3. See subject with the highest note
                4. See subject with the lowest note
                5. See subject with the highest average
                6. See subject with the lowest average
                7. Exit""");
            return keyboard.nextInt();
    }

    public int subjectMenu() {
        System.out.println("What would you like to do?");
        System.out.println("""
                1. Add students
                2. See students
                3. See highest note student
                4. See lowest note student
                5. See students in order, from highest note to lowest
                6. Exit""");
        return keyboard.nextInt();
    }
}
