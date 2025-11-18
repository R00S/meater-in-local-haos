package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.q */
/* loaded from: classes3.dex */
public class C10379q extends AbstractC10360j1 {

    /* renamed from: c */
    private final AbstractC10360j1 f40164c;

    public C10379q(AbstractC10360j1 abstractC10360j1) {
        C9801m.m32346f(abstractC10360j1, "substitution");
        this.f40164c = abstractC10360j1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: a */
    public boolean mo36685a() {
        return this.f40164c.mo36685a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: d */
    public InterfaceC10620g mo36727d(InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(interfaceC10620g, "annotations");
        return this.f40164c.mo36727d(interfaceC10620g);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: e */
    public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
        return this.f40164c.mo33536e(abstractC10344e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: f */
    public boolean mo33537f() {
        return this.f40164c.mo33537f();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: g */
    public AbstractC10344e0 mo36728g(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
        C9801m.m32346f(abstractC10344e0, "topLevelType");
        C9801m.m32346f(enumC10384r1, "position");
        return this.f40164c.mo36728g(abstractC10344e0, enumC10384r1);
    }
}
