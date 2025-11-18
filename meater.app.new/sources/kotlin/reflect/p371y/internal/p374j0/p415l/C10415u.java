package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u */
/* loaded from: classes3.dex */
public final class C10415u extends AbstractC10360j1 {

    /* renamed from: c */
    public static final a f40222c = new a(null);

    /* renamed from: d */
    private final AbstractC10360j1 f40223d;

    /* renamed from: e */
    private final AbstractC10360j1 f40224e;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10360j1 m36984a(AbstractC10360j1 abstractC10360j1, AbstractC10360j1 abstractC10360j12) {
            C9801m.m32346f(abstractC10360j1, "first");
            C9801m.m32346f(abstractC10360j12, "second");
            return abstractC10360j1.mo33537f() ? abstractC10360j12 : abstractC10360j12.mo33537f() ? abstractC10360j1 : new C10415u(abstractC10360j1, abstractC10360j12, null);
        }
    }

    private C10415u(AbstractC10360j1 abstractC10360j1, AbstractC10360j1 abstractC10360j12) {
        this.f40223d = abstractC10360j1;
        this.f40224e = abstractC10360j12;
    }

    public /* synthetic */ C10415u(AbstractC10360j1 abstractC10360j1, AbstractC10360j1 abstractC10360j12, C9789g c9789g) {
        this(abstractC10360j1, abstractC10360j12);
    }

    /* renamed from: i */
    public static final AbstractC10360j1 m36983i(AbstractC10360j1 abstractC10360j1, AbstractC10360j1 abstractC10360j12) {
        return f40222c.m36984a(abstractC10360j1, abstractC10360j12);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: a */
    public boolean mo36685a() {
        return this.f40223d.mo36685a() || this.f40224e.mo36685a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: b */
    public boolean mo36012b() {
        return this.f40223d.mo36012b() || this.f40224e.mo36012b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: d */
    public InterfaceC10620g mo36727d(InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(interfaceC10620g, "annotations");
        return this.f40224e.mo36727d(this.f40223d.mo36727d(interfaceC10620g));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: e */
    public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
        InterfaceC10351g1 interfaceC10351g1Mo33536e = this.f40223d.mo33536e(abstractC10344e0);
        return interfaceC10351g1Mo33536e == null ? this.f40224e.mo33536e(abstractC10344e0) : interfaceC10351g1Mo33536e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: g */
    public AbstractC10344e0 mo36728g(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
        C9801m.m32346f(abstractC10344e0, "topLevelType");
        C9801m.m32346f(enumC10384r1, "position");
        return this.f40224e.mo36728g(this.f40223d.mo36728g(abstractC10344e0, enumC10384r1), enumC10384r1);
    }
}
