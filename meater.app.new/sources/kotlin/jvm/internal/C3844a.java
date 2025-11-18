package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: AdaptedFunctionReference.java */
/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3844a implements InterfaceC3858o, Serializable {

    /* renamed from: B, reason: collision with root package name */
    protected final Object f43986B;

    /* renamed from: C, reason: collision with root package name */
    private final Class f43987C;

    /* renamed from: D, reason: collision with root package name */
    private final String f43988D;

    /* renamed from: E, reason: collision with root package name */
    private final String f43989E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f43990F;

    /* renamed from: G, reason: collision with root package name */
    private final int f43991G;

    /* renamed from: H, reason: collision with root package name */
    private final int f43992H;

    public C3844a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f43986B = obj;
        this.f43987C = cls;
        this.f43988D = str;
        this.f43989E = str2;
        this.f43990F = (i11 & 1) == 1;
        this.f43991G = i10;
        this.f43992H = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3844a)) {
            return false;
        }
        C3844a c3844a = (C3844a) obj;
        return this.f43990F == c3844a.f43990F && this.f43991G == c3844a.f43991G && this.f43992H == c3844a.f43992H && C3862t.b(this.f43986B, c3844a.f43986B) && C3862t.b(this.f43987C, c3844a.f43987C) && this.f43988D.equals(c3844a.f43988D) && this.f43989E.equals(c3844a.f43989E);
    }

    @Override // kotlin.jvm.internal.InterfaceC3858o
    public int getArity() {
        return this.f43991G;
    }

    public int hashCode() {
        Object obj = this.f43986B;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f43987C;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f43988D.hashCode()) * 31) + this.f43989E.hashCode()) * 31) + (this.f43990F ? 1231 : 1237)) * 31) + this.f43991G) * 31) + this.f43992H;
    }

    public String toString() {
        return P.j(this);
    }
}
