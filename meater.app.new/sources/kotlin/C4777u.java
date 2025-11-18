package kotlin;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArcSpline.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u000e\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, d2 = {"Lv/u;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "Loa/F;", "a", "(F[F)V", "b", "Lv/u$a;", "[[Lv/u$a;", "arcs", "", "Z", "isExtrapolate", "c", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4777u {

    /* renamed from: d, reason: collision with root package name */
    public static final int f50931d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a[][] arcs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isExtrapolate = true;

    /* compiled from: ArcSpline.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u001fBA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000fJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0017J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010 R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b-\u00106¨\u00069"}, d2 = {"Lv/u$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "o", "(F)F", "Loa/F;", "c", "(FFFF)V", "time", "p", "(F)V", "f", "()F", "g", "d", "e", "j", "k", "h", "i", "a", "F", "l", "b", "m", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "ellipseA", "ellipseB", "n", "ellipseCenterX", "ellipseCenterY", "arcVelocity", "", "q", "Z", "isVertical", "r", "()Z", "isLinear", "s", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.u$a */
    public static final class a {

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: t, reason: collision with root package name */
        public static final int f50935t = 8;

        /* renamed from: u, reason: collision with root package name */
        private static float[] f50936u;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float time1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float time2;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private float arcDistance;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float tmpSinAngle;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float tmpCosAngle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] lut;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final float oneOverDeltaTime;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final float ellipseA;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final float ellipseB;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float ellipseCenterX;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final float ellipseCenterY;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final float arcVelocity;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final boolean isVertical;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final boolean isLinear;

        /* compiled from: ArcSpline.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv/u$a$a;", "", "<init>", "()V", "", "b", "()[F", "ourPercent", "", "Epsilon", "F", "_ourPercent", "[F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.u$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] b() {
                if (a.f50936u != null) {
                    float[] fArr = a.f50936u;
                    C3862t.d(fArr);
                    return fArr;
                }
                a.f50936u = new float[91];
                float[] fArr2 = a.f50936u;
                C3862t.d(fArr2);
                return fArr2;
            }

            private Companion() {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.time1 = f10;
            this.time2 = f11;
            this.x1 = f12;
            this.y1 = f13;
            this.x2 = f14;
            this.y2 = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            this.isVertical = z11;
            float f18 = 1 / (f11 - f10);
            this.oneOverDeltaTime = f18;
            boolean z12 = 3 == i10;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f18;
                this.ellipseCenterX = f16 / (f11 - f10);
                this.ellipseCenterY = f17 / (f11 - f10);
                this.lut = new float[101];
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.lut = new float[101];
                this.ellipseA = f16 * (z11 ? -1 : 1);
                this.ellipseB = f17 * (z11 ? 1 : -1);
                this.ellipseCenterX = z11 ? f14 : f12;
                this.ellipseCenterY = z11 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.arcVelocity = this.arcDistance * f18;
                z10 = z12;
            }
            this.isLinear = z10;
        }

        private final void c(float x12, float y12, float x22, float y22) {
            float f10 = x22 - x12;
            float f11 = y12 - y22;
            int length = INSTANCE.b().length;
            float fHypot = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                Companion companion = INSTANCE;
                double radians = (float) Math.toRadians((i10 * 90.0d) / (companion.b().length - 1));
                float fSin = ((float) Math.sin(radians)) * f10;
                float fCos = ((float) Math.cos(radians)) * f11;
                if (i10 > 0) {
                    fHypot += (float) Math.hypot(fSin - f12, fCos - f13);
                    companion.b()[i10] = fHypot;
                }
                i10++;
                f13 = fCos;
                f12 = fSin;
            }
            this.arcDistance = fHypot;
            int length2 = INSTANCE.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArrB = INSTANCE.b();
                fArrB[i11] = fArrB[i11] / fHypot;
            }
            int length3 = this.lut.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = i12 / (this.lut.length - 1);
                Companion companion2 = INSTANCE;
                int iG = C3831l.g(companion2.b(), length4, 0, 0, 6, null);
                if (iG >= 0) {
                    this.lut[i12] = iG / (companion2.b().length - 1);
                } else if (iG == -1) {
                    this.lut[i12] = 0.0f;
                } else {
                    int i13 = -iG;
                    int i14 = i13 - 2;
                    this.lut[i12] = (i14 + ((length4 - companion2.b()[i14]) / (companion2.b()[i13 - 1] - companion2.b()[i14]))) / (companion2.b().length - 1);
                }
            }
        }

        private final float o(float v10) {
            if (v10 <= 0.0f) {
                return 0.0f;
            }
            if (v10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.lut;
            float length = v10 * (fArr.length - 1);
            int i10 = (int) length;
            float f10 = length - i10;
            float f11 = fArr[i10];
            return f11 + (f10 * (fArr[i10 + 1] - f11));
        }

        public final float d() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f10, (-this.ellipseB) * this.tmpSinAngle));
            if (this.isVertical) {
                f10 = -f10;
            }
            return f10 * fHypot;
        }

        public final float e() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            float f11 = (-this.ellipseB) * this.tmpSinAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f10, f11));
            return this.isVertical ? (-f11) * fHypot : f11 * fHypot;
        }

        public final float f() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float g() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        /* renamed from: h, reason: from getter */
        public final float getEllipseCenterX() {
            return this.ellipseCenterX;
        }

        /* renamed from: i, reason: from getter */
        public final float getEllipseCenterY() {
            return this.ellipseCenterY;
        }

        public final float j(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.x1;
            return f11 + (f10 * (this.x2 - f11));
        }

        public final float k(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.y1;
            return f11 + (f10 * (this.y2 - f11));
        }

        /* renamed from: l, reason: from getter */
        public final float getTime1() {
            return this.time1;
        }

        /* renamed from: m, reason: from getter */
        public final float getTime2() {
            return this.time2;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsLinear() {
            return this.isLinear;
        }

        public final void p(float time) {
            double dO = o((this.isVertical ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dO);
            this.tmpCosAngle = (float) Math.cos(dO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[PHI: r10
      0x0027: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4777u(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 - r2
            v.u$a[][] r4 = new kotlin.C4777u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L27
            if (r9 == r2) goto L30
            if (r9 == r11) goto L2e
            if (r9 == r10) goto L29
            r10 = 4
            if (r9 == r10) goto L27
            r10 = 5
            if (r9 == r10) goto L27
            goto L32
        L27:
            r8 = r10
            goto L32
        L29:
            if (r7 != r2) goto L30
            goto L2e
        L2c:
            r8 = r7
            goto L32
        L2e:
            r7 = r11
            goto L2c
        L30:
            r7 = r2
            goto L2c
        L32:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            v.u$a[] r9 = new kotlin.C4777u.a[r10]
            r11 = r5
        L3c:
            if (r11 >= r10) goto L69
            int r12 = r11 * 2
            v.u$a r20 = new v.u$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L3c
        L69:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L12
        L6e:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C4777u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].getTime2()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C4777u.a(float, float[]):void");
    }

    public final void b(float time, float[] v10) {
        if (time < this.arcs[0][0].getTime1()) {
            time = this.arcs[0][0].getTime1();
        } else {
            a[][] aVarArr = this.arcs;
            if (time > aVarArr[aVarArr.length - 1][0].getTime2()) {
                a[][] aVarArr2 = this.arcs;
                time = aVarArr2[aVarArr2.length - 1][0].getTime2();
            }
        }
        int length = this.arcs.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < v10.length) {
                if (time <= this.arcs[i10][i12].getTime2()) {
                    if (this.arcs[i10][i12].getIsLinear()) {
                        v10[i11] = this.arcs[i10][i12].getEllipseCenterX();
                        v10[i11 + 1] = this.arcs[i10][i12].getEllipseCenterY();
                    } else {
                        this.arcs[i10][i12].p(time);
                        v10[i11] = this.arcs[i10][i12].d();
                        v10[i11 + 1] = this.arcs[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z10) {
                return;
            }
        }
    }
}
