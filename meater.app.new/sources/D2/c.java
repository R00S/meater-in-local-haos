package D2;

import java.util.List;

/* compiled from: MotionPhotoDescription.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3357a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f3358b;

    /* compiled from: MotionPhotoDescription.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3359a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3360b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3361c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3362d;

        public a(String str, String str2, long j10, long j11) {
            this.f3359a = str;
            this.f3360b = str2;
            this.f3361c = j10;
            this.f3362d = j11;
        }
    }

    public c(long j10, List<a> list) {
        this.f3357a = j10;
        this.f3358b = list;
    }

    public K2.a a(long j10) {
        long j11;
        if (this.f3358b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f3358b.size() - 1; size >= 0; size--) {
            a aVar = this.f3358b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f3359a) | z10;
            if (size == 0) {
                j12 -= aVar.f3362d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f3361c;
            }
            long j17 = j12;
            j12 = j11;
            if (!zEquals || j12 == j17) {
                z10 = zEquals;
            } else {
                j16 = j17 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j17;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new K2.a(j13, j14, this.f3357a, j15, j16);
    }
}
