package jb;

import jb.C3757A;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3934n;
import nb.InterfaceC4077c;
import ob.C4176a;
import pb.d;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: jb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3772f {
    public static final C3757A a(C3934n proto, InterfaceC4077c nameResolver, nb.g typeTable, boolean z10, boolean z11, boolean z12) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        h.f<C3934n, C4176a.d> propertySignature = C4176a.f46659d;
        C3862t.f(propertySignature, "propertySignature");
        C4176a.d dVar = (C4176a.d) nb.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            d.a aVarC = pb.i.f47746a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return C3757A.f43569b.b(aVarC);
        }
        if (!z11 || !dVar.J()) {
            return null;
        }
        C3757A.a aVar = C3757A.f43569b;
        C4176a.c cVarE = dVar.E();
        C3862t.f(cVarE, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, cVarE);
    }

    public static /* synthetic */ C3757A b(C3934n c3934n, InterfaceC4077c interfaceC4077c, nb.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = (i10 & 8) != 0 ? false : z10;
        boolean z14 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(c3934n, interfaceC4077c, gVar, z13, z14, z12);
    }
}
