package ss6_ke_thua.bai_tap;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float array[] = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    @Override
    public String toString() {
        return super.toString() + "Point3D{" +
                "z=" + z +
                '}';
    }

}
