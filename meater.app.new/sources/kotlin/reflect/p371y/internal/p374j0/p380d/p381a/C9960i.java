package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Collection;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.i */
/* loaded from: classes2.dex */
public final class C9960i {

    /* renamed from: a */
    public static final C9960i f37892a = new C9960i();

    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.i$a */
    static final class a extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final a f37893f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(C9960i.f37892a.m33142b(interfaceC10576b));
        }
    }

    private C9960i() {
    }

    /* renamed from: c */
    private final boolean m33140c(InterfaceC10576b interfaceC10576b) {
        if (C10782c0.m38577K(C9956g.f37857a.m33098c(), C10235a.m36070d(interfaceC10576b)) && interfaceC10576b.mo37028f().isEmpty()) {
            return true;
        }
        if (!AbstractC9914h.m32743f0(interfaceC10576b)) {
            return false;
        }
        Collection<? extends InterfaceC10576b> collectionMo37027e = interfaceC10576b.mo37027e();
        C9801m.m32345e(collectionMo37027e, "overriddenDescriptors");
        if (!collectionMo37027e.isEmpty()) {
            for (InterfaceC10576b interfaceC10576b2 : collectionMo37027e) {
                C9960i c9960i = f37892a;
                C9801m.m32345e(interfaceC10576b2, "it");
                if (c9960i.m33142b(interfaceC10576b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String m33141a(InterfaceC10576b interfaceC10576b) {
        C10163f c10163f;
        C9801m.m32346f(interfaceC10576b, "<this>");
        AbstractC9914h.m32743f0(interfaceC10576b);
        InterfaceC10576b interfaceC10576bM36069c = C10235a.m36069c(C10235a.m36081o(interfaceC10576b), false, a.f37893f, 1, null);
        if (interfaceC10576bM36069c == null || (c10163f = C9956g.f37857a.m33096a().get(C10235a.m36074h(interfaceC10576bM36069c))) == null) {
            return null;
        }
        return c10163f.m35455k();
    }

    /* renamed from: b */
    public final boolean m33142b(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "callableMemberDescriptor");
        if (C9956g.f37857a.m33099d().contains(interfaceC10576b.getName())) {
            return m33140c(interfaceC10576b);
        }
        return false;
    }
}
