package br.com.dio.challenge.domain.classroom;

public class Course extends Content{

    private int workload;

    public Course() {
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }


    @Override
    public double calculateXP() {
        return XP_STANDARD * workload;
    }

    @Override
    public String toString() {
        return "Titulo= " + getTitle() + ',' +
                "Description= " + getDescription() + ',' +
                "Carga Horaria= " + getWorkload();
    }
}
