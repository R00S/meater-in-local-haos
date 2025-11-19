package v2;

import X1.C1804a;
import v2.O;

/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51069a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f51070b;

    /* renamed from: c, reason: collision with root package name */
    private int f51071c;

    /* renamed from: d, reason: collision with root package name */
    private long f51072d;

    /* renamed from: e, reason: collision with root package name */
    private int f51073e;

    /* renamed from: f, reason: collision with root package name */
    private int f51074f;

    /* renamed from: g, reason: collision with root package name */
    private int f51075g;

    public void a(O o10, O.a aVar) {
        if (this.f51071c > 0) {
            o10.e(this.f51072d, this.f51073e, this.f51074f, this.f51075g, aVar);
            this.f51071c = 0;
        }
    }

    public void b() {
        this.f51070b = false;
        this.f51071c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        C1804a.h(this.f51075g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f51070b) {
            int i13 = this.f51071c;
            int i14 = i13 + 1;
            this.f51071c = i14;
            if (i13 == 0) {
                this.f51072d = j10;
                this.f51073e = i10;
                this.f51074f = 0;
            }
            this.f51074f += i11;
            this.f51075g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC4811q interfaceC4811q) {
        if (this.f51070b) {
            return;
        }
        interfaceC4811q.p(this.f51069a, 0, 10);
        interfaceC4811q.m();
        if (C4796b.j(this.f51069a) == 0) {
            return;
        }
        this.f51070b = true;
    }
}
