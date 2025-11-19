package jb;

import hb.InterfaceC3514g;
import jb.v;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes3.dex */
public final class w {
    public static final x a(v vVar, InterfaceC3514g javaClass, pb.e jvmMetadataVersion) {
        C3862t.g(vVar, "<this>");
        C3862t.g(javaClass, "javaClass");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        v.a aVarC = vVar.c(javaClass, jvmMetadataVersion);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static final x b(v vVar, qb.b classId, pb.e jvmMetadataVersion) {
        C3862t.g(vVar, "<this>");
        C3862t.g(classId, "classId");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        v.a aVarB = vVar.b(classId, jvmMetadataVersion);
        if (aVarB != null) {
            return aVarB.a();
        }
        return null;
    }
}
