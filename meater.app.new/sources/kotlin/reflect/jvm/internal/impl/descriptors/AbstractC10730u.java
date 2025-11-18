package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f;

/* compiled from: DescriptorVisibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.u */
/* loaded from: classes2.dex */
public abstract class AbstractC10730u {
    protected AbstractC10730u() {
    }

    /* renamed from: a */
    public final Integer m38147a(AbstractC10730u abstractC10730u) {
        C9801m.m32346f(abstractC10730u, "visibility");
        return mo38007b().mo37720a(abstractC10730u.mo38007b());
    }

    /* renamed from: b */
    public abstract AbstractC10611m1 mo38007b();

    /* renamed from: c */
    public abstract String mo38008c();

    /* renamed from: d */
    public final boolean m38148d() {
        return mo38007b().m37721c();
    }

    /* renamed from: e */
    public abstract boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z);

    /* renamed from: f */
    public abstract AbstractC10730u mo38009f();

    public final String toString() {
        return mo38007b().toString();
    }
}
