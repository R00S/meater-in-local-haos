package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.y */
/* loaded from: classes3.dex */
public interface InterfaceC10109y<T> {

    /* compiled from: descriptorBasedTypeSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.y$a */
    public static final class a {
        /* renamed from: a */
        public static <T> String m34063a(InterfaceC10109y<? extends T> interfaceC10109y, InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            return null;
        }

        /* renamed from: b */
        public static <T> AbstractC10344e0 m34064b(InterfaceC10109y<? extends T> interfaceC10109y, AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "kotlinType");
            return null;
        }
    }

    /* renamed from: a */
    T mo34057a(InterfaceC10585e interfaceC10585e);

    /* renamed from: b */
    String mo34058b(InterfaceC10585e interfaceC10585e);

    /* renamed from: c */
    AbstractC10344e0 mo34059c(Collection<AbstractC10344e0> collection);

    /* renamed from: d */
    String mo34060d(InterfaceC10585e interfaceC10585e);

    /* renamed from: e */
    AbstractC10344e0 mo34061e(AbstractC10344e0 abstractC10344e0);

    /* renamed from: f */
    void mo34062f(AbstractC10344e0 abstractC10344e0, InterfaceC10585e interfaceC10585e);
}
