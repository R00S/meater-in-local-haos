package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.j1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10360j1 {

    /* renamed from: a */
    public static final b f40131a = new b(null);

    /* renamed from: b */
    public static final AbstractC10360j1 f40132b = new a();

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$a */
    public static final class a extends AbstractC10360j1 {
        a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
            return (InterfaceC10351g1) m36730i(abstractC10344e0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: f */
        public boolean mo33537f() {
            return true;
        }

        /* renamed from: i */
        public Void m36730i(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.j1$c */
    public static final class c extends AbstractC10360j1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: a */
        public boolean mo36685a() {
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: b */
        public boolean mo36012b() {
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: d */
        public InterfaceC10620g mo36727d(InterfaceC10620g interfaceC10620g) {
            C9801m.m32346f(interfaceC10620g, "annotations");
            return AbstractC10360j1.this.mo36727d(interfaceC10620g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: e */
        public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
            return AbstractC10360j1.this.mo33536e(abstractC10344e0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: f */
        public boolean mo33537f() {
            return AbstractC10360j1.this.mo33537f();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
        /* renamed from: g */
        public AbstractC10344e0 mo36728g(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
            C9801m.m32346f(abstractC10344e0, "topLevelType");
            C9801m.m32346f(enumC10384r1, "position");
            return AbstractC10360j1.this.mo36728g(abstractC10344e0, enumC10384r1);
        }
    }

    /* renamed from: a */
    public boolean mo36685a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo36012b() {
        return false;
    }

    /* renamed from: c */
    public final C10366l1 m36726c() {
        C10366l1 c10366l1M36747g = C10366l1.m36747g(this);
        C9801m.m32345e(c10366l1M36747g, "create(this)");
        return c10366l1M36747g;
    }

    /* renamed from: d */
    public InterfaceC10620g mo36727d(InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(interfaceC10620g, "annotations");
        return interfaceC10620g;
    }

    /* renamed from: e */
    public abstract InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0);

    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC10344e0 mo36728g(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
        C9801m.m32346f(abstractC10344e0, "topLevelType");
        C9801m.m32346f(enumC10384r1, "position");
        return abstractC10344e0;
    }

    /* renamed from: h */
    public final AbstractC10360j1 m36729h() {
        return new c();
    }
}
