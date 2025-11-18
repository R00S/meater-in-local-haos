package P4;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* compiled from: CookEstimate.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: L, reason: collision with root package name */
    private static final int f13927L = Temperature.fromCelsius(40);

    /* renamed from: M, reason: collision with root package name */
    private static final int f13928M = Temperature.fromCelsius(3);

    /* renamed from: N, reason: collision with root package name */
    public static final int f13929N = Temperature.fromCelsius(1) / 2;

    /* renamed from: O, reason: collision with root package name */
    private static final int f13930O = Temperature.fromCelsius(8);

    /* renamed from: P, reason: collision with root package name */
    private static final int f13931P = Temperature.fromCelsius(3);

    /* renamed from: A, reason: collision with root package name */
    public boolean f13932A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f13933B;

    /* renamed from: C, reason: collision with root package name */
    private int f13934C;

    /* renamed from: D, reason: collision with root package name */
    private int f13935D;

    /* renamed from: E, reason: collision with root package name */
    private int f13936E;

    /* renamed from: F, reason: collision with root package name */
    private int f13937F;

    /* renamed from: H, reason: collision with root package name */
    private DeviceCookState f13939H;

    /* renamed from: I, reason: collision with root package name */
    private b f13940I;

    /* renamed from: J, reason: collision with root package name */
    private long f13941J;

    /* renamed from: b, reason: collision with root package name */
    private int f13944b;

    /* renamed from: c, reason: collision with root package name */
    private int f13945c;

    /* renamed from: f, reason: collision with root package name */
    P4.b f13948f;

    /* renamed from: g, reason: collision with root package name */
    private int f13949g;

    /* renamed from: h, reason: collision with root package name */
    private int f13950h;

    /* renamed from: i, reason: collision with root package name */
    private int f13951i;

    /* renamed from: j, reason: collision with root package name */
    private int f13952j;

    /* renamed from: k, reason: collision with root package name */
    private int f13953k;

    /* renamed from: l, reason: collision with root package name */
    private int f13954l;

    /* renamed from: m, reason: collision with root package name */
    private int f13955m;

    /* renamed from: n, reason: collision with root package name */
    private int f13956n;

    /* renamed from: o, reason: collision with root package name */
    private int f13957o;

    /* renamed from: p, reason: collision with root package name */
    private int f13958p;

    /* renamed from: q, reason: collision with root package name */
    private int f13959q;

    /* renamed from: r, reason: collision with root package name */
    private int f13960r;

    /* renamed from: s, reason: collision with root package name */
    private int f13961s;

    /* renamed from: t, reason: collision with root package name */
    private int f13962t;

    /* renamed from: u, reason: collision with root package name */
    private int f13963u;

    /* renamed from: v, reason: collision with root package name */
    private int f13964v;

    /* renamed from: w, reason: collision with root package name */
    private int f13965w;

    /* renamed from: x, reason: collision with root package name */
    private int f13966x;

    /* renamed from: y, reason: collision with root package name */
    private int f13967y;

    /* renamed from: z, reason: collision with root package name */
    private int f13968z;

    /* renamed from: a, reason: collision with root package name */
    private final c[] f13943a = new c[TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES];

    /* renamed from: d, reason: collision with root package name */
    int[] f13946d = new int[5];

    /* renamed from: e, reason: collision with root package name */
    private int f13947e = 1;

    /* renamed from: G, reason: collision with root package name */
    private int f13938G = -1;

    /* renamed from: K, reason: collision with root package name */
    private TemperatureLogRecording f13942K = new TemperatureLogRecording(Temperature.INVALID_READING, Temperature.INVALID_READING);

    /* compiled from: CookEstimate.java */
    /* renamed from: P4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0206a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13969a = new int[DeviceCookState.values().length];
    }

    /* compiled from: CookEstimate.java */
    public enum b {
        SMART,
        CUSTOM
    }

    /* compiled from: CookEstimate.java */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        int f13973a;

        /* renamed from: b, reason: collision with root package name */
        int f13974b;

        /* renamed from: c, reason: collision with root package name */
        int f13975c;

        c(a aVar) {
            a();
        }

        protected void a() {
            this.f13973a = 0;
            this.f13974b = 0;
            this.f13975c = 0;
        }
    }

    public a() {
        t(true, 1);
    }

    private int A() {
        int iH = H(this.f13948f.f13976a, this.f13947e, this.f13939H);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= this.f13945c) {
                break;
            }
            if (this.f13943a[i10].f13974b >= H(this.f13948f.f13976a, this.f13947e, this.f13939H) - Temperature.fromCelsius(3) && i11 == 0) {
                i11 = this.f13943a[i10].f13974b;
            } else if (this.f13943a[i10].f13974b >= H(this.f13948f.f13976a, this.f13947e, this.f13939H)) {
                iH = this.f13943a[i10].f13974b;
                break;
            }
            i10++;
        }
        return iH - i11;
    }

    private int B() {
        int i10 = this.f13965w;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13945c; i12++) {
            if (this.f13943a[i12].f13974b < H(this.f13948f.f13976a, this.f13947e, this.f13939H) - Temperature.fromCelsius(3) || i11 != 0) {
                if (this.f13943a[i12].f13974b >= H(this.f13948f.f13976a, this.f13947e, this.f13939H) && i10 == this.f13943a[this.f13945c - 1].f13973a) {
                    break;
                }
            } else {
                i11 = this.f13943a[i12].f13973a;
            }
        }
        return i10 - i11;
    }

    private int D() {
        for (int i10 = 0; i10 < this.f13945c; i10++) {
            if (this.f13943a[i10].f13973a >= E()) {
                return this.f13943a[i10].f13974b;
            }
        }
        return 0;
    }

    private int E() {
        return this.f13961s - this.f13957o;
    }

    private int F() {
        int iS = s();
        c[] cVarArr = this.f13943a;
        int i10 = this.f13945c;
        int i11 = cVarArr[i10 - 1].f13974b;
        int i12 = cVarArr[i10 - 1].f13973a;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            c cVar = this.f13943a[i13];
            if (cVar.f13974b <= i11 - iS) {
                return i12 - cVar.f13973a;
            }
        }
        return -1;
    }

    private static int G(int[] iArr, int i10) {
        int iMin = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != -1024) {
                iMin = Math.min(iMin, i12);
            }
        }
        return iMin;
    }

    private static int H(int[] iArr, int i10, DeviceCookState deviceCookState) {
        int i11 = C0206a.f13969a[deviceCookState.ordinal()];
        return G(iArr, i10);
    }

    private void J(P4.b bVar, int i10) {
        DeviceCookState deviceCookState;
        if (this.f13957o == 0) {
            int iH = H(bVar.f13976a, this.f13947e, this.f13939H);
            int i11 = this.f13955m;
            if (iH < f13928M + i11 || i11 == -1024 || (deviceCookState = this.f13939H) != DeviceCookState.COOK_STATE_STARTED) {
                return;
            }
            this.f13957o = i10 - this.f13956n;
            this.f13958p = H(this.f13948f.f13976a, this.f13947e, deviceCookState) - this.f13955m;
        }
    }

    private void K(P4.b bVar, int i10) {
        int value = this.f13939H.getValue();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_READY_FOR_RESTING;
        if (value > deviceCookState.getValue() || this.f13957o == 0 || this.f13933B) {
            return;
        }
        if (this.f13939H == deviceCookState) {
            this.f13933B = true;
        }
        int i11 = this.f13945c;
        if (i11 <= 0) {
            U4.b.i("ERR setRestingValues() no samples", new Object[0]);
            return;
        }
        c[] cVarArr = this.f13943a;
        this.f13960r = cVarArr[i11 - 1].f13974b;
        this.f13961s = cVarArr[i11 - 1].f13973a;
    }

    private void a(P4.b bVar, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            i11 = this.f13947e;
            if (i13 >= i11) {
                break;
            }
            int[] iArr = this.f13946d;
            iArr[i13] = Math.max(bVar.f13976a[i13], iArr[i13]);
            i13++;
        }
        int iH = H(bVar.f13976a, i11, this.f13939H);
        int i14 = bVar.f13977b;
        if (this.f13945c >= 120) {
            m();
        }
        if (iH == -1024 && (i12 = this.f13945c) > 0) {
            c[] cVarArr = this.f13943a;
            int i15 = cVarArr[i12 - 1].f13975c;
            iH = cVarArr[i12 - 1].f13974b;
            i14 = i15;
        }
        c[] cVarArr2 = this.f13943a;
        int i16 = this.f13945c;
        if (cVarArr2[i16] == null) {
            cVarArr2[i16] = new c(this);
        }
        c[] cVarArr3 = this.f13943a;
        int i17 = this.f13945c;
        c cVar = cVarArr3[i17];
        cVar.f13975c = i14;
        cVar.f13974b = iH;
        cVar.f13973a = i10;
        if (i17 < 120) {
            this.f13945c = i17 + 1;
        }
    }

    private int b(P4.b bVar) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f13945c - 1; i12 >= 0 && this.f13943a[i12].f13974b >= H(bVar.f13976a, this.f13947e, this.f13939H) - Temperature.fromCelsius(3); i12--) {
            i10 += this.f13943a[i12].f13975c;
            i11++;
        }
        return i11 == 0 ? bVar.f13977b : i10 / i11;
    }

    private void d(P4.b bVar) {
        DeviceCookState deviceCookState = this.f13939H;
        if (deviceCookState != DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE || H(this.f13946d, this.f13947e, deviceCookState) < this.f13953k) {
            return;
        }
        this.f13939H = DeviceCookState.COOK_STATE_OVERCOOK;
    }

    private void e(P4.b bVar) {
        if (this.f13939H.equals(DeviceCookState.COOK_STATE_STARTED)) {
            for (int i10 = 0; i10 < this.f13947e; i10++) {
                if (bVar.f13976a[i10] >= this.f13946d[i10] - Temperature.fromCelsius(1)) {
                    return;
                }
            }
            this.f13939H = DeviceCookState.COOK_STATE_COOK_CONFIGURED;
        }
    }

    private void f(P4.b bVar, int i10) {
        if (this.f13939H != DeviceCookState.COOK_STATE_COOK_CONFIGURED || bVar.f13977b <= f13927L) {
            return;
        }
        this.f13939H = DeviceCookState.COOK_STATE_STARTED;
        l();
        this.f13955m = H(bVar.f13976a, this.f13947e, this.f13939H);
        this.f13956n = i10;
        this.f13957o = 0;
        this.f13958p = 0;
        this.f13946d = bVar.f13976a;
        this.f13962t = -1;
        this.f13963u = 0;
        this.f13934C = 0;
        this.f13935D = 0;
    }

    private void g(P4.b bVar) {
        DeviceCookState deviceCookState = this.f13939H;
        if (deviceCookState != DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE || H(this.f13946d, this.f13947e, deviceCookState) < this.f13951i) {
            return;
        }
        this.f13939H = DeviceCookState.COOK_STATE_FINISHED;
    }

    private void h(P4.b bVar) {
        int i10;
        int iMax;
        if (this.f13939H == DeviceCookState.COOK_STATE_STARTED) {
            if (this.f13945c > 0) {
                int iS = s();
                iMax = this.f13951i - iS;
                this.f13959q = iS;
            } else {
                int i11 = this.f13951i;
                iMax = Math.max(i11 - this.f13959q, i11 - f13931P);
            }
            U4.b.i("Resting-temp:" + iMax + " Initial-time:" + this.f13957o + " Initial-temp-rise:" + this.f13958p + " Resting-start-temp:" + this.f13960r + " Resting-start-time:" + this.f13961s, new Object[0]);
            if (H(bVar.f13976a, this.f13947e, this.f13939H) >= iMax) {
                this.f13939H = DeviceCookState.COOK_STATE_READY_FOR_RESTING;
                this.f13968z = b(bVar);
            }
        }
        DeviceCookState deviceCookState = this.f13939H;
        DeviceCookState deviceCookState2 = DeviceCookState.COOK_STATE_RESTING;
        if (deviceCookState == deviceCookState2 && (i10 = bVar.f13977b) < this.f13966x) {
            this.f13966x = i10;
        }
        if ((!(!this.f13932A) || !(deviceCookState == deviceCookState2)) || bVar.f13977b <= this.f13966x + Temperature.fromCelsius(20)) {
            return;
        }
        this.f13939H = DeviceCookState.COOK_STATE_READY_FOR_RESTING;
        int i12 = bVar.f13977b;
        this.f13967y = i12;
        this.f13968z = i12;
    }

    private void i(P4.b bVar, int i10, int i11) {
        int i12;
        DeviceCookState deviceCookState = this.f13939H;
        DeviceCookState deviceCookState2 = DeviceCookState.COOK_STATE_READY_FOR_RESTING;
        if (deviceCookState == deviceCookState2 && (i12 = bVar.f13977b) > this.f13967y) {
            this.f13967y = i12;
        }
        if (deviceCookState == deviceCookState2) {
            int iH = H(bVar.f13976a, this.f13947e, deviceCookState) + ((int) ((this.f13968z - H(bVar.f13976a, this.f13947e, this.f13939H)) * 0.75d));
            int i13 = bVar.f13977b;
            boolean z10 = true;
            boolean z11 = (i13 != -1024 && i13 < iH) || this.f13940I == b.CUSTOM;
            if (!z11) {
                this.f13935D = 0;
            } else if (this.f13935D == 0) {
                this.f13935D = i10;
            }
            if (this.f13935D + i11 > i10 && this.f13940I != b.CUSTOM) {
                z10 = false;
            }
            U4.b.i("Should move to resting? timestamp: " + i10 + " reachedRestingStartTime: " + this.f13935D + " restingCompleteDelay: " + i11, new Object[0]);
            if (z11 && z10) {
                U4.b.i("Moving to ProbeCookState.COOK_STATE_RESTING", new Object[0]);
                this.f13939H = DeviceCookState.COOK_STATE_RESTING;
            }
        }
    }

    private void j(P4.b bVar) {
        DeviceCookState deviceCookState = this.f13939H;
        if (deviceCookState != DeviceCookState.COOK_STATE_FINISHED || H(this.f13946d, this.f13947e, deviceCookState) < this.f13952j) {
            return;
        }
        this.f13939H = DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k(P4.b r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r0 = r10.f13939H
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r1 = com.apptionlabs.meater_app.v3protobuf.DeviceCookState.COOK_STATE_RESTING
            if (r0 != r1) goto L75
            r0 = 0
            r1 = r0
        L8:
            int r2 = r10.f13947e
            r3 = 1
            if (r1 >= r2) goto L2a
            int[] r2 = r10.f13946d
            r2 = r2[r1]
            int r4 = r2 + r13
            int[] r5 = r11.f13976a
            r5 = r5[r1]
            if (r4 >= r2) goto L1c
            if (r5 > r4) goto L21
            goto L1e
        L1c:
            if (r5 < r4) goto L21
        L1e:
            int r1 = r1 + 1
            goto L8
        L21:
            P4.a$b r11 = r10.f13940I
            P4.a$b r1 = P4.a.b.CUSTOM
            if (r11 != r1) goto L28
            goto L2a
        L28:
            r11 = r0
            goto L2b
        L2a:
            r11 = r3
        L2b:
            if (r11 != 0) goto L30
            r10.f13934C = r0
            goto L36
        L30:
            int r1 = r10.f13934C
            if (r1 != 0) goto L36
            r10.f13934C = r12
        L36:
            int r1 = r10.f13934C
            int r1 = r1 + r14
            if (r1 <= r12) goto L43
            P4.a$b r2 = r10.f13940I
            P4.a$b r4 = P4.a.b.CUSTOM
            if (r2 != r4) goto L42
            goto L43
        L42:
            r3 = r0
        L43:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            int r12 = r10.f13934C
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r12 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}
            java.lang.String r13 = "Should move to ready? timestamp: %s reachedReadyStartTime: %s restingCompleteDelay: %s restingCompleteTempChange: %s  endOfRestingTimestamp : %s hasReachedEndOfRestingTimestamp: %s"
            U4.b.i(r13, r12)
            if (r11 == 0) goto L75
            if (r3 == 0) goto L75
            java.lang.String r11 = "Moving to ProbeCookState.COOK_STATE_SLIGHTLY_UNDERDONE"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            U4.b.i(r11, r12)
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r11 = com.apptionlabs.meater_app.v3protobuf.DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE
            r10.f13939H = r11
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.a.k(P4.b, int, int, int):void");
    }

    private void l() {
        this.f13945c = 0;
    }

    private void m() {
        for (int i10 = 0; i10 < 120; i10 += 2) {
            c[] cVarArr = this.f13943a;
            c cVar = cVarArr[i10 + 1];
            int i11 = cVar.f13974b;
            int i12 = (cVarArr[i10].f13975c + cVar.f13975c) / 2;
            int i13 = cVar.f13973a;
            c cVar2 = cVarArr[i10 / 2];
            cVar2.f13974b = i11;
            cVar2.f13975c = i12;
            cVar2.f13973a = i13;
        }
        this.f13945c = 60;
        this.f13944b *= 2;
    }

    private int s() {
        if (this.f13940I.equals(b.CUSTOM) || H(this.f13948f.f13976a, this.f13947e, this.f13939H) >= this.f13951i) {
            return 0;
        }
        if (this.f13957o == 0) {
            return f13931P;
        }
        if (H(this.f13948f.f13976a, this.f13947e, this.f13939H) - this.f13955m < f13930O + f13928M) {
            return f13931P;
        }
        if (this.f13945c == 0) {
            return f13931P;
        }
        int iMax = Math.max(0, (this.f13960r - D()) / 2);
        int i10 = this.f13936E;
        if (iMax + i10 < 0) {
            return 0;
        }
        return iMax + i10;
    }

    private void y(int i10, int i11) {
        int i12;
        if (this.f13940I.equals(b.CUSTOM)) {
            this.f13954l = 0;
            return;
        }
        if (this.f13945c == 0) {
            this.f13954l = 0;
            return;
        }
        DeviceCookState deviceCookState = this.f13939H;
        if (deviceCookState == DeviceCookState.COOK_STATE_STARTED && this.f13957o > 0) {
            this.f13954l = ((F() * 19) / 10) + i11;
        } else if (deviceCookState == DeviceCookState.COOK_STATE_RESTING && this.f13957o > 0 && (i12 = this.f13964v) > 0) {
            int i13 = this.f13954l;
            if (i13 - (i10 - i12) > 0) {
                this.f13954l = i13 - (i10 - i12);
            } else {
                this.f13954l = 0;
            }
        }
        this.f13964v = i10;
    }

    public int C() {
        return this.f13962t;
    }

    void I(int i10) {
        this.f13938G = i10;
    }

    void L(int i10, int i11) {
        this.f13962t = i10;
        this.f13963u = i11;
    }

    public void c(P4.b bVar, long j10, int i10, int i11, int i12) {
        U4.b.i("**** FALLBACK MODE ****", new Object[0]);
        l();
        this.f13948f = bVar;
        int i13 = (int) j10;
        f(bVar, i13);
        e(bVar);
        h(bVar);
        i(bVar, i13, i10);
        k(bVar, i13, i11, i12);
        g(bVar);
        j(bVar);
        d(bVar);
    }

    public void n(int i10, int i11, int i12) {
        this.f13951i = i10;
        this.f13952j = i11;
        this.f13953k = i12;
    }

    public DeviceCookState o() {
        return this.f13939H;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p() {
        /*
            r6 = this;
            int r0 = r6.f13945c
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r0 = r6.f13939H
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r2 = com.apptionlabs.meater_app.v3protobuf.DeviceCookState.COOK_STATE_STARTED
            if (r0 == r2) goto Le
        Lc:
            r5 = r1
            goto L5e
        Le:
            P4.b r2 = r6.f13948f
            if (r2 == 0) goto Lc
            int[] r2 = r2.f13976a
            int r3 = r6.f13947e
            int r0 = H(r2, r3, r0)
            int r2 = r6.f13955m
            int r0 = r0 - r2
            int r3 = P4.a.f13930O
            if (r0 >= r3) goto L26
            r0 = -1024(0xfffffffffffffc00, float:NaN)
            if (r2 == r0) goto L26
            goto Lc
        L26:
            int r0 = r6.f13951i
            int r2 = r6.s()
            int r0 = r0 - r2
            P4.b r2 = r6.f13948f
            int[] r2 = r2.f13976a
            int r3 = r6.f13947e
            com.apptionlabs.meater_app.v3protobuf.DeviceCookState r4 = r6.f13939H
            int r2 = H(r2, r3, r4)
            int r0 = r0 - r2
            int r3 = r6.z()
            int r4 = r3 - r2
            int r5 = r0 / 2
            int r5 = r5 + r2
            int r3 = r3 - r5
            int r2 = r6.A()
            int r5 = r6.B()
            if (r2 != 0) goto L51
            int r0 = r6.f13962t
            return r0
        L51:
            int r5 = r5 * r0
            int r5 = r5 / r2
            if (r3 == 0) goto Lc
            if (r3 <= 0) goto Lc
            if (r5 == 0) goto Lc
            if (r4 != 0) goto L5c
            goto Lc
        L5c:
            int r5 = r5 * r4
            int r5 = r5 / r3
        L5e:
            int r0 = java.lang.Math.max(r1, r5)
            r2 = 86400(0x15180, float:1.21072E-40)
            if (r0 <= r2) goto L68
            r0 = r1
        L68:
            int r2 = r6.f13965w
            int r3 = r6.f13963u
            int r3 = r2 - r3
            r4 = 30
            if (r3 <= r4) goto L81
            int r3 = r6.f13962t
            if (r3 == r1) goto L7e
            int r1 = r3 + 47
            if (r0 > r1) goto L7e
            int r3 = r3 + (-47)
            if (r0 >= r3) goto L81
        L7e:
            r6.L(r0, r2)
        L81:
            int r0 = r6.f13962t
            r6.I(r0)
            int r0 = r6.f13962t
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.a.p():int");
    }

    public int q() {
        if (this.f13940I.equals(b.CUSTOM)) {
            return 0;
        }
        if (this.f13954l == 0 && this.f13939H == DeviceCookState.COOK_STATE_RESTING && this.f13940I.equals(b.SMART)) {
            return 60;
        }
        return this.f13954l;
    }

    public int r() {
        return p() + q();
    }

    public void t(boolean z10, int i10) {
        this.f13947e = i10;
        this.f13965w = 0;
        this.f13949g = 0;
        this.f13950h = 0;
        if (z10) {
            this.f13951i = 0;
            this.f13952j = 0;
            this.f13953k = 0;
            this.f13940I = b.CUSTOM;
            this.f13939H = DeviceCookState.COOK_STATE_NOT_STARTED;
        }
        this.f13945c = 0;
        this.f13954l = 300;
        this.f13966x = 16000;
        this.f13944b = 10;
        this.f13941J = System.currentTimeMillis();
        this.f13955m = Temperature.INVALID_READING;
        this.f13956n = 0;
        this.f13957o = 0;
        this.f13958p = 0;
        this.f13960r = 0;
        this.f13961s = 0;
        this.f13962t = -1;
        this.f13963u = 0;
        this.f13964v = 0;
        this.f13967y = 0;
        this.f13968z = 0;
        this.f13932A = false;
        this.f13933B = false;
        this.f13937F = 0;
        this.f13942K = new TemperatureLogRecording(Temperature.INVALID_READING, Temperature.INVALID_READING);
        this.f13959q = f13931P;
    }

    public void u(P4.b[] bVarArr, int i10, int i11, DeviceCookState deviceCookState, int i12, int[] iArr, int i13, int i14, b bVar, boolean z10, int i15, int i16, int i17, int i18, int i19) {
        this.f13947e = i18;
        t(false, i18);
        this.f13951i = i12;
        this.f13952j = i13;
        this.f13953k = i14;
        this.f13940I = bVar;
        this.f13939H = DeviceCookState.COOK_STATE_COOK_CONFIGURED;
        this.f13932A = z10;
        this.f13959q = f13931P;
        this.f13941J = System.currentTimeMillis() - ((i10 * i11) * 1000);
        this.f13936E = i19;
        for (int i20 = 0; i20 < i10; i20++) {
            v(bVarArr[i20], i20 * i11, i15, i16, i17, i19);
        }
        for (int i21 = 0; i21 < i18; i21++) {
            this.f13946d[i21] = iArr[i21];
        }
        if (deviceCookState.getValue() > this.f13939H.getValue()) {
            this.f13939H = deviceCookState;
        }
    }

    public void v(P4.b bVar, int i10, int i11, int i12, int i13, int i14) {
        y(i10, i13);
        int i15 = this.f13945c;
        if (i15 == 0 || i10 > this.f13943a[i15 - 1].f13973a + this.f13944b) {
            a(bVar, i10);
        }
        if (H(bVar.f13976a, this.f13947e, this.f13939H) == -1024) {
            return;
        }
        DeviceCookState deviceCookState = this.f13939H;
        if (deviceCookState != DeviceCookState.COOK_STATE_NOT_STARTED && H(bVar.f13976a, this.f13947e, deviceCookState) > H(this.f13946d, this.f13947e, this.f13939H)) {
            this.f13946d = bVar.f13976a;
        }
        this.f13936E = i14;
        this.f13948f = bVar;
        this.f13965w = i10;
        f(bVar, i10);
        e(bVar);
        h(bVar);
        i(bVar, i10, i11);
        k(bVar, i10, i12, i13);
        g(bVar);
        j(bVar);
        d(bVar);
        J(bVar, i10);
        K(bVar, i10);
        p();
    }

    public void w(DeviceCookState deviceCookState) {
        if (this.f13939H == DeviceCookState.COOK_STATE_READY_FOR_RESTING && deviceCookState == DeviceCookState.COOK_STATE_RESTING) {
            this.f13932A = true;
        }
        this.f13939H = deviceCookState;
    }

    public void x(P4.b bVar, int i10, int i11, int i12, boolean z10, int i13, int i14) {
        t(false, i13);
        this.f13939H = DeviceCookState.COOK_STATE_COOK_CONFIGURED;
        this.f13952j = i11;
        this.f13953k = i12;
        this.f13951i = i10;
        this.f13940I = z10 ? b.SMART : b.CUSTOM;
        f(bVar, 0);
        this.f13962t = -1;
        this.f13950h = bVar.f13977b;
        this.f13965w = 0;
        this.f13959q = f13931P;
        a(bVar, 0);
        this.f13936E = i14;
        U4.b.i("cookEst_start", "  slightlyOvercookedThreshold = " + i11 + " overcookedThreshold = " + i12 + "targetTemp =  " + i10);
    }

    int z() {
        int i10 = this.f13965w;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f13945c - 1; i13++) {
            c cVar = this.f13943a[i13];
            int i14 = cVar.f13973a;
            if (i14 >= i10 - 300 && i14 < i10) {
                i12 += cVar.f13975c;
                i11++;
            }
        }
        return i11 == 0 ? this.f13950h : i12 / i11;
    }
}
