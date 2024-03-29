package HW5;

public abstract class Shrub extends Plant implements Trimmable {

    public Shrub(int id, String type, String nativeRegion) {
        super(id, type, nativeRegion);
    }

    @Override
    public void trim() {
        System.out.println("Shrub trimmed");
    }

    void harvest() {
        System.out.println("Shrub harvested");
    }
}
