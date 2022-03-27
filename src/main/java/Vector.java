import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector {
    private final Double x;
    private final Double y;
    private final Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double vecLength() {
        return Math.sqrt(Math.pow(x, x) + Math.pow(y, y) + Math.pow(z, z));
    }

    public Double vecSclar(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vecMult(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public Double vecAngle(Vector vector) {
        return this.vecSclar(vector) / this.vecLength() * vector.vecLength();
    }

    public Vector vecAmount(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector vecDist(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static List<Vector> randomizer(Integer n) {
        List<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vectors.add(new Vector(Math.random(), Math.random(), Math.random()));
        }
        return vectors;
    }

    //some change
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
