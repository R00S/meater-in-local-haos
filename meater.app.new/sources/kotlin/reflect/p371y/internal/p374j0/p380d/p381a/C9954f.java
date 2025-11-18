package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9959h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.f */
/* loaded from: classes2.dex */
public final class C9954f extends C9959h0 {

    /* renamed from: n */
    public static final C9954f f37848n = new C9954f();

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.f$a */
    static final class a extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final a f37849f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(C9954f.f37848n.m33086j(interfaceC10576b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.f$b */
    static final class b extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final b f37850f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf((interfaceC10576b instanceof InterfaceC10738y) && C9954f.f37848n.m33086j(interfaceC10576b));
        }
    }

    private C9954f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m33086j(InterfaceC10576b interfaceC10576b) {
        return C10782c0.m38577K(C9959h0.f37865a.m33128e(), C10106v.m34040d(interfaceC10576b));
    }

    /* renamed from: k */
    public static final InterfaceC10738y m33087k(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        C9954f c9954f = f37848n;
        C10163f name = interfaceC10738y.getName();
        C9801m.m32345e(name, "functionDescriptor.name");
        if (c9954f.m33089l(name)) {
            return (InterfaceC10738y) C10235a.m36069c(interfaceC10738y, false, a.f37849f, 1, null);
        }
        return null;
    }

    /* renamed from: m */
    public static final C9959h0.b m33088m(InterfaceC10576b interfaceC10576b) {
        InterfaceC10576b interfaceC10576bM36069c;
        String strM34040d;
        C9801m.m32346f(interfaceC10576b, "<this>");
        C9959h0.a aVar = C9959h0.f37865a;
        if (!aVar.m33127d().contains(interfaceC10576b.getName()) || (interfaceC10576bM36069c = C10235a.m36069c(interfaceC10576b, false, b.f37850f, 1, null)) == null || (strM34040d = C10106v.m34040d(interfaceC10576bM36069c)) == null) {
            return null;
        }
        return aVar.m33135l(strM34040d);
    }

    /* renamed from: l */
    public final boolean m33089l(C10163f c10163f) {
        C9801m.m32346f(c10163f, "<this>");
        return C9959h0.f37865a.m33127d().contains(c10163f);
    }
}
