package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: ProtoContainer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.z */
/* loaded from: classes3.dex */
public abstract class AbstractC10316z {

    /* renamed from: a */
    private final InterfaceC10151c f39994a;

    /* renamed from: b */
    private final C10155g f39995b;

    /* renamed from: c */
    private final InterfaceC10741z0 f39996c;

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.z$a */
    public static final class a extends AbstractC10316z {

        /* renamed from: d */
        private final C10124c f39997d;

        /* renamed from: e */
        private final a f39998e;

        /* renamed from: f */
        private final C10159b f39999f;

        /* renamed from: g */
        private final C10124c.c f40000g;

        /* renamed from: h */
        private final boolean f40001h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10124c c10124c, InterfaceC10151c interfaceC10151c, C10155g c10155g, InterfaceC10741z0 interfaceC10741z0, a aVar) {
            super(interfaceC10151c, c10155g, interfaceC10741z0, null);
            C9801m.m32346f(c10124c, "classProto");
            C9801m.m32346f(interfaceC10151c, "nameResolver");
            C9801m.m32346f(c10155g, "typeTable");
            this.f39997d = c10124c;
            this.f39998e = aVar;
            this.f39999f = C10314x.m36494a(interfaceC10151c, c10124c.m34439F0());
            C10124c.c cVarMo35368d = C10150b.f39209f.mo35368d(c10124c.m34438E0());
            this.f40000g = cVarMo35368d == null ? C10124c.c.CLASS : cVarMo35368d;
            Boolean boolMo35368d = C10150b.f39210g.mo35368d(c10124c.m34438E0());
            C9801m.m32345e(boolMo35368d, "IS_INNER.get(classProto.flags)");
            this.f40001h = boolMo35368d.booleanValue();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z
        /* renamed from: a */
        public C10160c mo36497a() {
            C10160c c10160cM35409b = this.f39999f.m35409b();
            C9801m.m32345e(c10160cM35409b, "classId.asSingleFqName()");
            return c10160cM35409b;
        }

        /* renamed from: e */
        public final C10159b m36501e() {
            return this.f39999f;
        }

        /* renamed from: f */
        public final C10124c m36502f() {
            return this.f39997d;
        }

        /* renamed from: g */
        public final C10124c.c m36503g() {
            return this.f40000g;
        }

        /* renamed from: h */
        public final a m36504h() {
            return this.f39998e;
        }

        /* renamed from: i */
        public final boolean m36505i() {
            return this.f40001h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.z$b */
    public static final class b extends AbstractC10316z {

        /* renamed from: d */
        private final C10160c f40002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10160c c10160c, InterfaceC10151c interfaceC10151c, C10155g c10155g, InterfaceC10741z0 interfaceC10741z0) {
            super(interfaceC10151c, c10155g, interfaceC10741z0, null);
            C9801m.m32346f(c10160c, "fqName");
            C9801m.m32346f(interfaceC10151c, "nameResolver");
            C9801m.m32346f(c10155g, "typeTable");
            this.f40002d = c10160c;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z
        /* renamed from: a */
        public C10160c mo36497a() {
            return this.f40002d;
        }
    }

    private AbstractC10316z(InterfaceC10151c interfaceC10151c, C10155g c10155g, InterfaceC10741z0 interfaceC10741z0) {
        this.f39994a = interfaceC10151c;
        this.f39995b = c10155g;
        this.f39996c = interfaceC10741z0;
    }

    public /* synthetic */ AbstractC10316z(InterfaceC10151c interfaceC10151c, C10155g c10155g, InterfaceC10741z0 interfaceC10741z0, C9789g c9789g) {
        this(interfaceC10151c, c10155g, interfaceC10741z0);
    }

    /* renamed from: a */
    public abstract C10160c mo36497a();

    /* renamed from: b */
    public final InterfaceC10151c m36498b() {
        return this.f39994a;
    }

    /* renamed from: c */
    public final InterfaceC10741z0 m36499c() {
        return this.f39996c;
    }

    /* renamed from: d */
    public final C10155g m36500d() {
        return this.f39995b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo36497a();
    }
}
