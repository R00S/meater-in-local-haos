package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.e */
/* loaded from: classes2.dex */
public final class C9952e extends C9959h0 {

    /* renamed from: n */
    public static final C9952e f37846n = new C9952e();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.e$a */
    static final class a extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10739y0 f37847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10739y0 interfaceC10739y0) {
            super(1);
            this.f37847f = interfaceC10739y0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(C9959h0.f37865a.m33133j().containsKey(C10106v.m34040d(this.f37847f)));
        }
    }

    private C9952e() {
    }

    /* renamed from: i */
    public final C10163f m33075i(InterfaceC10739y0 interfaceC10739y0) {
        C9801m.m32346f(interfaceC10739y0, "functionDescriptor");
        Map<String, C10163f> mapM33133j = C9959h0.f37865a.m33133j();
        String strM34040d = C10106v.m34040d(interfaceC10739y0);
        if (strM34040d == null) {
            return null;
        }
        return mapM33133j.get(strM34040d);
    }

    /* renamed from: j */
    public final boolean m33076j(InterfaceC10739y0 interfaceC10739y0) {
        C9801m.m32346f(interfaceC10739y0, "functionDescriptor");
        return AbstractC9914h.m32743f0(interfaceC10739y0) && C10235a.m36069c(interfaceC10739y0, false, new a(interfaceC10739y0), 1, null) != null;
    }

    /* renamed from: k */
    public final boolean m33077k(InterfaceC10739y0 interfaceC10739y0) {
        C9801m.m32346f(interfaceC10739y0, "<this>");
        return C9801m.m32341a(interfaceC10739y0.getName().m35455k(), "removeAt") && C9801m.m32341a(C10106v.m34040d(interfaceC10739y0), C9959h0.f37865a.m33131h().m33137b());
    }
}
