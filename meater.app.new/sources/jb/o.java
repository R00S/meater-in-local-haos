package jb;

import Db.C1003i;
import Db.InterfaceC1004j;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes3.dex */
public final class o implements InterfaceC1004j {

    /* renamed from: a, reason: collision with root package name */
    private final v f43658a;

    /* renamed from: b, reason: collision with root package name */
    private final n f43659b;

    public o(v kotlinClassFinder, n deserializedDescriptorResolver) {
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        C3862t.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f43658a = kotlinClassFinder;
        this.f43659b = deserializedDescriptorResolver;
    }

    @Override // Db.InterfaceC1004j
    public C1003i a(qb.b classId) {
        C3862t.g(classId, "classId");
        x xVarB = w.b(this.f43658a, classId, Rb.c.a(this.f43659b.f().g()));
        if (xVarB == null) {
            return null;
        }
        C3862t.b(xVarB.c(), classId);
        return this.f43659b.l(xVarB);
    }
}
