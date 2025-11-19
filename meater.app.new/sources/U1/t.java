package U1;

import X1.C1804a;

/* compiled from: FrameInfo.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final C1733i f17212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17214c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17215d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17216e;

    /* compiled from: FrameInfo.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C1733i f17217a;

        /* renamed from: b, reason: collision with root package name */
        private int f17218b;

        /* renamed from: c, reason: collision with root package name */
        private int f17219c;

        /* renamed from: d, reason: collision with root package name */
        private float f17220d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        private long f17221e;

        public b(C1733i c1733i, int i10, int i11) {
            this.f17217a = c1733i;
            this.f17218b = i10;
            this.f17219c = i11;
        }

        public t a() {
            return new t(this.f17217a, this.f17218b, this.f17219c, this.f17220d, this.f17221e);
        }

        public b b(float f10) {
            this.f17220d = f10;
            return this;
        }
    }

    private t(C1733i c1733i, int i10, int i11, float f10, long j10) {
        C1804a.b(i10 > 0, "width must be positive, but is: " + i10);
        C1804a.b(i11 > 0, "height must be positive, but is: " + i11);
        this.f17212a = c1733i;
        this.f17213b = i10;
        this.f17214c = i11;
        this.f17215d = f10;
        this.f17216e = j10;
    }
}
