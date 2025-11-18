package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10651h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import okhttp3.HttpUrl;

/* compiled from: ErrorClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.a */
/* loaded from: classes3.dex */
public final class C10417a extends C10651h {
    /* JADX WARN: Illegal instructions before constructor call */
    public C10417a(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        C10427k c10427k = C10427k.f40355a;
        InterfaceC10592g0 interfaceC10592g0M37062i = c10427k.m37062i();
        EnumC10583d0 enumC10583d0 = EnumC10583d0.OPEN;
        EnumC10588f enumC10588f = EnumC10588f.CLASS;
        List listM38888j = C10817u.m38888j();
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        super(interfaceC10592g0M37062i, c10163f, enumC10583d0, enumC10588f, listM38888j, interfaceC10741z0, false, C10322f.f40008b);
        C10647f c10647fM37839o1 = C10647f.m37839o1(this, InterfaceC10620g.f40808c.m37735b(), true, interfaceC10741z0);
        c10647fM37839o1.m37844r1(C10817u.m38888j(), C10728t.f41219d);
        C9801m.m32345e(c10647fM37839o1, "create(this, Annotations…          )\n            }");
        EnumC10423g enumC10423g = EnumC10423g.SCOPE_FOR_ERROR_CLASS;
        String string = c10647fM37839o1.getName().toString();
        C9801m.m32345e(string, "errorConstructor.name.toString()");
        InterfaceC10251h interfaceC10251hM37052b = C10427k.m37052b(enumC10423g, string, HttpUrl.FRAGMENT_ENCODE_SET);
        EnumC10426j enumC10426j = EnumC10426j.f40346w0;
        c10647fM37839o1.m37928h1(new C10424h(c10427k.m37058e(enumC10426j, new String[0]), interfaceC10251hM37052b, enumC10426j, null, false, new String[0], 24, null));
        m37854L0(interfaceC10251hM37052b, C10820v0.m38916c(c10647fM37839o1), c10647fM37839o1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: A0 */
    public InterfaceC10585e mo36396c(C10366l1 c10366l1) {
        C9801m.m32346f(c10366l1, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10651h
    public String toString() {
        String strM35455k = getName().m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        return strM35455k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: v */
    public InterfaceC10251h mo36986v(AbstractC10360j1 abstractC10360j1, AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10360j1, "typeSubstitution");
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        EnumC10423g enumC10423g = EnumC10423g.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        C9801m.m32345e(string, "name.toString()");
        return C10427k.m37052b(enumC10423g, string, abstractC10360j1.toString());
    }
}
