package Wa;

import Oa.p;
import hb.InterfaceC3514g;
import java.io.InputStream;
import jb.v;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes3.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f18485a;

    /* renamed from: b, reason: collision with root package name */
    private final Eb.d f18486b;

    public g(ClassLoader classLoader) {
        C3862t.g(classLoader, "classLoader");
        this.f18485a = classLoader;
        this.f18486b = new Eb.d();
    }

    private final v.a d(String str) {
        f fVarA;
        Class<?> clsA = e.a(this.f18485a, str);
        if (clsA == null || (fVarA = f.f18482c.a(clsA)) == null) {
            return null;
        }
        return new v.a.b(fVarA, null, 2, null);
    }

    @Override // Db.A
    public InputStream a(qb.c packageFqName) {
        C3862t.g(packageFqName, "packageFqName");
        if (packageFqName.i(p.f13399z)) {
            return this.f18486b.a(Eb.a.f4154r.r(packageFqName));
        }
        return null;
    }

    @Override // jb.v
    public v.a b(qb.b classId, pb.e jvmMetadataVersion) {
        C3862t.g(classId, "classId");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        return d(h.b(classId));
    }

    @Override // jb.v
    public v.a c(InterfaceC3514g javaClass, pb.e jvmMetadataVersion) {
        String strB;
        C3862t.g(javaClass, "javaClass");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        qb.c cVarF = javaClass.f();
        if (cVarF == null || (strB = cVarF.b()) == null) {
            return null;
        }
        return d(strB);
    }
}
