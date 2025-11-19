package androidx.media3.exoplayer.audio;

import X1.L;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* loaded from: classes.dex */
public class k implements DefaultAudioSink.e {

    /* renamed from: b, reason: collision with root package name */
    protected final int f26825b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f26826c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f26827d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f26828e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f26829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26830g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26831h;

    /* compiled from: DefaultAudioTrackBufferSizeProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f26832a = 250000;

        /* renamed from: b, reason: collision with root package name */
        private int f26833b = 750000;

        /* renamed from: c, reason: collision with root package name */
        private int f26834c = 4;

        /* renamed from: d, reason: collision with root package name */
        private int f26835d = 250000;

        /* renamed from: e, reason: collision with root package name */
        private int f26836e = 50000000;

        /* renamed from: f, reason: collision with root package name */
        private int f26837f = 2;

        /* renamed from: g, reason: collision with root package name */
        private int f26838g = 4;

        public k h() {
            return new k(this);
        }
    }

    protected k(a aVar) {
        this.f26825b = aVar.f26832a;
        this.f26826c = aVar.f26833b;
        this.f26827d = aVar.f26834c;
        this.f26828e = aVar.f26835d;
        this.f26829f = aVar.f26836e;
        this.f26830g = aVar.f26837f;
        this.f26831h = aVar.f26838g;
    }

    protected static int b(int i10, int i11, int i12) {
        return p8.f.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 100000;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 16000;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return p8.f.d((this.f26829f * d(i10)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f26828e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f26830g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f26831h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = o8.C4144d.b(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = d(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = p8.f.d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.k.f(int, int):int");
    }

    protected int g(int i10, int i11, int i12) {
        return L.p(i10 * this.f26827d, b(this.f26825b, i11, i12), b(this.f26826c, i11, i12));
    }
}
