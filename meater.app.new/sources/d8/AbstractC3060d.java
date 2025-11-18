package d8;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3060d {

    /* compiled from: com.google.android.play:app-update@@2.1.0 */
    /* renamed from: d8.d$a */
    public static abstract class a {
        public abstract AbstractC3060d a();

        public abstract a b(boolean z10);
    }

    public static AbstractC3060d c(int i10) {
        return d(i10).a();
    }

    public static a d(int i10) {
        C3081y c3081y = new C3081y();
        c3081y.c(i10);
        c3081y.b(false);
        return c3081y;
    }

    public abstract boolean a();

    public abstract int b();
}
