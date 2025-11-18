package qb;

import Ub.n;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CallableId.kt */
/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4325a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0671a f48170f = new C0671a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final f f48171g;

    /* renamed from: h, reason: collision with root package name */
    private static final c f48172h;

    /* renamed from: a, reason: collision with root package name */
    private final c f48173a;

    /* renamed from: b, reason: collision with root package name */
    private final c f48174b;

    /* renamed from: c, reason: collision with root package name */
    private final f f48175c;

    /* renamed from: d, reason: collision with root package name */
    private final b f48176d;

    /* renamed from: e, reason: collision with root package name */
    private final c f48177e;

    /* compiled from: CallableId.kt */
    /* renamed from: qb.a$a, reason: collision with other inner class name */
    public static final class C0671a {
        public /* synthetic */ C0671a(C3854k c3854k) {
            this();
        }

        private C0671a() {
        }
    }

    static {
        f fVar = h.f48210m;
        f48171g = fVar;
        c cVarK = c.k(fVar);
        C3862t.f(cVarK, "topLevel(...)");
        f48172h = cVarK;
    }

    private C4325a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f48173a = cVar;
        this.f48174b = cVar2;
        this.f48175c = fVar;
        this.f48176d = bVar;
        this.f48177e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4325a) {
            C4325a c4325a = (C4325a) obj;
            if (C3862t.b(this.f48173a, c4325a.f48173a) && C3862t.b(this.f48174b, c4325a.f48174b) && C3862t.b(this.f48175c, c4325a.f48175c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f48173a.hashCode()) * 31;
        c cVar = this.f48174b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f48175c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f48173a.b();
        C3862t.f(strB, "asString(...)");
        sb2.append(n.B(strB, '.', '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f48174b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f48175c);
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4325a(c packageName, f callableName) {
        this(packageName, null, callableName, null, null);
        C3862t.g(packageName, "packageName");
        C3862t.g(callableName, "callableName");
    }
}
