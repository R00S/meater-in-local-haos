package kotlin.reflect.jvm.internal.impl.descriptors.p431o1;

import java.util.Collection;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: AdditionalClassPartsProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.a */
/* loaded from: classes2.dex */
public interface InterfaceC10630a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.a$a */
    public static final class a implements InterfaceC10630a {

        /* renamed from: a */
        public static final a f40889a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a
        /* renamed from: a */
        public Collection<InterfaceC10582d> mo32979a(InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            return C10817u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a
        /* renamed from: b */
        public Collection<InterfaceC10739y0> mo32980b(C10163f c10163f, InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            return C10817u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a
        /* renamed from: d */
        public Collection<AbstractC10344e0> mo32982d(InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            return C10817u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a
        /* renamed from: e */
        public Collection<C10163f> mo32983e(InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            return C10817u.m38888j();
        }
    }

    /* renamed from: a */
    Collection<InterfaceC10582d> mo32979a(InterfaceC10585e interfaceC10585e);

    /* renamed from: b */
    Collection<InterfaceC10739y0> mo32980b(C10163f c10163f, InterfaceC10585e interfaceC10585e);

    /* renamed from: d */
    Collection<AbstractC10344e0> mo32982d(InterfaceC10585e interfaceC10585e);

    /* renamed from: e */
    Collection<C10163f> mo32983e(InterfaceC10585e interfaceC10585e);
}
