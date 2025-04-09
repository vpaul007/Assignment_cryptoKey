package cryptoKeyexchange;

import java.io.Serializable;

public class testKey implements Serializable {
    private String Coursename;
    private String description;
    private int subjectCount;

    public testKey(String name, String description, int Count) {
        this.Coursename = name;
        this.description = description;
        this.subjectCount = Count;
    }

    public String getName() {
        return Coursename;
    }

    public String getDescription() {
        return description;
    }

    public int getsubjectCount() {
        return subjectCount;
    }

    @Override
    public String toString() {
        return "Data{name='" + Coursename + "', description='" + description + "', subjectCount=" + subjectCount + "}";
    }
}
