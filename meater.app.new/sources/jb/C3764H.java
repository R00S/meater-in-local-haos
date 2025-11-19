package jb;

import Hb.U;
import Ra.InterfaceC1692e;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: jb.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3764H implements InterfaceC3763G<s> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3764H f43574a = new C3764H();

    private C3764H() {
    }

    @Override // jb.InterfaceC3763G
    public void a(U kotlinType, InterfaceC1692e descriptor) {
        C3862t.g(kotlinType, "kotlinType");
        C3862t.g(descriptor, "descriptor");
    }

    @Override // jb.InterfaceC3763G
    public String b(InterfaceC1692e classDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // jb.InterfaceC3763G
    public U d(Collection<? extends U> types) {
        C3862t.g(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + kotlin.collections.r.s0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // jb.InterfaceC3763G
    public U e(U kotlinType) {
        C3862t.g(kotlinType, "kotlinType");
        return null;
    }

    @Override // jb.InterfaceC3763G
    public String f(InterfaceC1692e classDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // jb.InterfaceC3763G
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(InterfaceC1692e classDescriptor) {
        C3862t.g(classDescriptor, "classDescriptor");
        return null;
    }
}
