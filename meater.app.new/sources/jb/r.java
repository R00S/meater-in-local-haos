package jb;

import Db.C1018y;
import Fb.InterfaceC1037s;
import Ra.i0;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3932l;
import nb.InterfaceC4077c;
import ob.C4176a;
import yb.C5148d;

/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes3.dex */
public final class r implements InterfaceC1037s {

    /* renamed from: b, reason: collision with root package name */
    private final C5148d f43661b;

    /* renamed from: c, reason: collision with root package name */
    private final C5148d f43662c;

    /* renamed from: d, reason: collision with root package name */
    private final C1018y<pb.e> f43663d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43664e;

    /* renamed from: f, reason: collision with root package name */
    private final Fb.r f43665f;

    /* renamed from: g, reason: collision with root package name */
    private final x f43666g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43667h;

    public r(C5148d className, C5148d c5148d, C3932l packageProto, InterfaceC4077c nameResolver, C1018y<pb.e> c1018y, boolean z10, Fb.r abiStability, x xVar) {
        String string;
        C3862t.g(className, "className");
        C3862t.g(packageProto, "packageProto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(abiStability, "abiStability");
        this.f43661b = className;
        this.f43662c = c5148d;
        this.f43663d = c1018y;
        this.f43664e = z10;
        this.f43665f = abiStability;
        this.f43666g = xVar;
        h.f<C3932l, Integer> packageModuleName = C4176a.f46668m;
        C3862t.f(packageModuleName, "packageModuleName");
        Integer num = (Integer) nb.e.a(packageProto, packageModuleName);
        this.f43667h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // Ra.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f15159a;
        C3862t.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // Fb.InterfaceC1037s
    public String c() {
        return "Class '" + d().a().b() + '\'';
    }

    public final qb.b d() {
        qb.c cVarG = e().g();
        C3862t.f(cVarG, "getPackageFqName(...)");
        return new qb.b(cVarG, h());
    }

    public C5148d e() {
        return this.f43661b;
    }

    public C5148d f() {
        return this.f43662c;
    }

    public final x g() {
        return this.f43666g;
    }

    public final qb.f h() {
        String strF = e().f();
        C3862t.f(strF, "getInternalName(...)");
        qb.f fVarT = qb.f.t(Ub.n.L0(strF, '/', null, 2, null));
        C3862t.f(fVarT, "identifier(...)");
        return fVarT;
    }

    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x kotlinClass, C3932l packageProto, InterfaceC4077c nameResolver, C1018y<pb.e> c1018y, boolean z10, Fb.r abiStability) {
        C3862t.g(kotlinClass, "kotlinClass");
        C3862t.g(packageProto, "packageProto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(abiStability, "abiStability");
        C5148d c5148dB = C5148d.b(kotlinClass.c());
        C3862t.f(c5148dB, "byClassId(...)");
        String strE = kotlinClass.a().e();
        C5148d c5148dD = null;
        if (strE != null && strE.length() > 0) {
            c5148dD = C5148d.d(strE);
        }
        this(c5148dB, c5148dD, packageProto, nameResolver, c1018y, z10, abiStability, kotlinClass);
    }
}
