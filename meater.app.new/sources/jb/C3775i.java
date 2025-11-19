package jb;

import Ra.M;
import kotlin.jvm.internal.C3862t;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* renamed from: jb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3775i {
    public static final C3774h a(Ra.H module, M notFoundClasses, Gb.n storageManager, v kotlinClassFinder, pb.e jvmMetadataVersion) {
        C3862t.g(module, "module");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        C3774h c3774h = new C3774h(module, notFoundClasses, storageManager, kotlinClassFinder);
        c3774h.S(jvmMetadataVersion);
        return c3774h;
    }
}
