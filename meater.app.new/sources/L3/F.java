package L3;

/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum F {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9136a;

        static {
            int[] iArr = new int[F.values().length];
            f9136a = iArr;
            try {
                iArr[F.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9136a[F.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9136a[F.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean j(int i10, boolean z10, int i11) {
        int i12 = a.f9136a[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
