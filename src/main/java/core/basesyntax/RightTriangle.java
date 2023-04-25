package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " sq.units, first side: "
                + firstSide
                + " units, second leg: "
                + secondSide
                + " units, color: "
                + getColor());
    }
}