public class Student {
    private String name;
    private double totalGrades;
    private int numGrades;

    public Student(String name) {
        this.name = name;
        this.totalGrades = 0;
        this.numGrades = 0;
    }

    public void AddAverage(double grade) {
        this.totalGrades += grade;
        this.numGrades++;
    }

    public double CalcAverage() {
        if (numGrades == 0) return 0; // Avoid division by zero
        return totalGrades / numGrades;
    }

    public String GetLetterGrade() {
        double avg = CalcAverage();

        if (avg >= 100){
            return "A+";
        }
        else if (avg >= 93){
            return "A";
        }
        else if (avg >= 90){
            return "A-";
        }
        else if (avg >= 87){
            return "B+";
        }
        else if (avg >= 83){
            return "B";
        }
        else if (avg >= 80){
            return "B-";
        }
        else if (avg >= 77){
            return "C+";
        }
        else if (avg >= 73){
            return "C";
        }
        else if (avg >= 70){
            return "C-";
        }
        else if (avg >= 67){
            return "D+";
        }
        else if (avg >= 63){
            return "D";
        }
        else if (avg >= 60){
            return "D-";
        }
        else {
            return "F";
        }
    }

    public String getName() {
        return this.name;
    }
}

