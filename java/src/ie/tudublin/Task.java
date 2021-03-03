package ie.tudublin;

import processing.data.TableRow;

public class Task {
    private String task;
    private float start;
    private float end;

    public Task(TableRow row){
        //constructor chaining
        this(
            row.getString("Task"),
            row.getFloat("Start"),
            row.getFloat("End")
        );
    }

    public Task(String task, float start, float end) {
        this.task = task;
        this.start = start;
        this.end = end;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public float getEnd() {
        return end;
    }

    public void setEnd(float end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Task [end=" + end + ", start=" + start + ", task=" + task + "]";
    }
}
