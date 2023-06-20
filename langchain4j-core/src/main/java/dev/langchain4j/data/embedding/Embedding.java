package dev.langchain4j.data.embedding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Embedding {

    private final float[] vector;

    public Embedding(float[] vector) {
        this.vector = vector;
    }

    public float[] vector() {
        return vector;
    }

    public List<Float> vectorAsList() {
        List<Float> list = new ArrayList<>(vector.length);
        for (float f : vector) {
            list.add(f);
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Embedding that = (Embedding) o;
        return Arrays.equals(this.vector, that.vector);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vector);
    }

    @Override
    public String toString() {
        return "Embedding {" +
                " vector = " + Arrays.toString(vector) +
                " }";
    }

    public static Embedding from(float[] vector) {
        return new Embedding(vector);
    }

    public static Embedding from(List<Float> vector) {
        float[] array = new float[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            array[i] = vector.get(i);
        }
        return new Embedding(array);
    }
}
