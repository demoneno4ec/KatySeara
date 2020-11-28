package fiveLeason;

public class MixFor5 {
    public static void main(String[] args) {
        int x;
        int y;

        MayBeResult result = new MayBeResult();

        for (int variant = 0; variant < 6; ++variant) {
            x = 0;
            y = 30;
            result.setVariant(variant);

            for (int outer = 0; outer < 3; ++outer) {
                for (int inner = 4; inner > 1; --inner) {

                    x = result.getX(x);

                    y -= 2;
                    if (x == 6) {
                        break;
                    }

                    x += 3;
                }

                y -= 2;
            }

            System.out.println("Variant #" + variant + ": " + x + " " + y);
        }

    }
}

class MayBeResult {
    private int variant;

    public int getX(int x) {
        switch (this.variant) {
            case (0):
                x += 3;
                break;
            case (1):
                x += 6;
                break;
            case (2):
                x += 2;
                break;
            case (3):
                ++x;
                break;
            case (4):
                --x;
                break;
            default:
                break;
        }

        return x;
    }

    public void setVariant(int variant) {
        this.variant = variant;
    }
}