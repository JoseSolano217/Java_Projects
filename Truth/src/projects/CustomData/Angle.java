package projects.CustomData;

public class Angle {
    private double angle;

    public Angle(double angle) {
        this.angle = angleFix(angle);
    }

    public Angle (Position target, Position own) {
        this.angle = positionToAngle(target, own);
    }

    public double angleFix(double angle) {
        if (angle > 360) {
            angle = angleFix(angle-360);
            return angle;
        }
        if (angle < 0) {
            angle = angleFix(360+angle);
            return angle;
        }
        return angle;
    }

    public double positionToAngle(Position targetPosition, Position ownPosition) {
        double valueX = ownPosition.getPosX() - targetPosition.getPosX();
        double valueY = ownPosition.getPosY() - targetPosition.getPosY();
        int quadrant = 0;
        if (valueY == 0) {
            if (valueX > 0) {
                return 0;
            }
            if (valueX < 0) {
                return 180;
            }
            if (valueX == 0) {
                return 90;
            }
        }
        if (valueY > 0) {
            if (valueX < 0) {
                quadrant = 90;
            }
            if (valueX == 0) {
                return 90;
            }
        }
        if (valueY < 0) {
            if (valueX < 0) {
                quadrant = 180;
            }
            if (valueX > 0) {
                quadrant = 270;
            }
            if (valueX == 0) {
                return 270;
            }
        }
        return quadrant + Math.toDegrees(Math.abs(Math.atan(valueY/valueX)));
    }

    public double getAngle() {
        return angle;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return  "Angle = " + angle;
    }
}
