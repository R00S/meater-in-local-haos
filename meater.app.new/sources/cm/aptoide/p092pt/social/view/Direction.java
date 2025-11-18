package cm.aptoide.p092pt.social.view;

/* loaded from: classes.dex */
public class Direction {
    private static final int bottom = 8;
    private static final int left = 1;
    private static final int right = 2;
    private static final int top = 4;
    private final int direction;

    public Direction(int i2, int i3) {
        int i4 = i2 > 0 ? 2 : i2 < 0 ? 1 : 0;
        if (i3 > 0) {
            i4 |= 8;
        } else if (i3 < 0) {
            i4 |= 4;
        }
        this.direction = i4;
    }

    public boolean bottom() {
        return (this.direction & 8) == 8;
    }

    public boolean left() {
        return (this.direction & 1) == 1;
    }

    public boolean right() {
        return (this.direction & 2) == 2;
    }

    public boolean top() {
        return (this.direction & 4) == 4;
    }
}
