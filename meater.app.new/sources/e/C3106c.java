package e;

import Ba.l;
import e.C3106c;
import g.AbstractC3373e;
import g.InterfaceC3370b;
import g.InterfaceC3374f;
import h.AbstractC3466a;
import java.util.UUID;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Lh/a;", "contract", "Lkotlin/Function1;", "Loa/F;", "onResult", "Le/f;", "a", "(Lh/a;LBa/l;LO/l;I)Le/f;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3106c {

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "LO/L;", "LO/K;", "b", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$a */
    static final class a extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3104a<I> f39929B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ AbstractC3373e f39930C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f39931D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC3466a<I, O> f39932E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ x1<l<O, C4153F>> f39933F;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/c$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e.c$a$a, reason: collision with other inner class name */
        public static final class C0507a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3104a f39934a;

            public C0507a(C3104a c3104a) {
                this.f39934a = c3104a;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f39934a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C3104a<I> c3104a, AbstractC3373e abstractC3373e, String str, AbstractC3466a<I, O> abstractC3466a, x1<? extends l<? super O, C4153F>> x1Var) {
            super(1);
            this.f39929B = c3104a;
            this.f39930C = abstractC3373e;
            this.f39931D = str;
            this.f39932E = abstractC3466a;
            this.f39933F = x1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(x1 x1Var, Object obj) {
            ((l) x1Var.getValue()).invoke(obj);
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            C3104a<I> c3104a = this.f39929B;
            AbstractC3373e abstractC3373e = this.f39930C;
            String str = this.f39931D;
            Object obj = this.f39932E;
            final x1<l<O, C4153F>> x1Var = this.f39933F;
            c3104a.b(abstractC3373e.m(str, obj, new InterfaceC3370b() { // from class: e.b
                @Override // g.InterfaceC3370b
                public final void a(Object obj2) {
                    C3106c.a.c(x1Var, obj2);
                }
            }));
            return new C0507a(this.f39929B);
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$b */
    static final class b extends AbstractC3864v implements Ba.a<String> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f39935B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final <I, O> C3109f<I, O> a(AbstractC3466a<I, O> abstractC3466a, l<? super O, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.e(-1408504823);
        x1 x1VarM = m1.m(abstractC3466a, interfaceC1554l, i10 & 14);
        x1 x1VarM2 = m1.m(lVar, interfaceC1554l, (i10 >> 3) & 14);
        String str = (String) Y.b.c(new Object[0], null, null, b.f39935B, interfaceC1554l, 3072, 6);
        InterfaceC3374f interfaceC3374fA = C3108e.f39937a.a(interfaceC1554l, 6);
        if (interfaceC3374fA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC3373e activityResultRegistry = interfaceC3374fA.getActivityResultRegistry();
        interfaceC1554l.e(-1672765924);
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = new C3104a();
            interfaceC1554l.J(objF);
        }
        C3104a c3104a = (C3104a) objF;
        interfaceC1554l.O();
        interfaceC1554l.e(-1672765850);
        Object objF2 = interfaceC1554l.f();
        if (objF2 == companion.a()) {
            objF2 = new C3109f(c3104a, x1VarM);
            interfaceC1554l.J(objF2);
        }
        C3109f<I, O> c3109f = (C3109f) objF2;
        interfaceC1554l.O();
        interfaceC1554l.e(-1672765582);
        boolean zR = interfaceC1554l.R(c3104a) | interfaceC1554l.R(activityResultRegistry) | interfaceC1554l.R(str) | interfaceC1554l.R(abstractC3466a) | interfaceC1554l.R(x1VarM2);
        Object objF3 = interfaceC1554l.f();
        if (zR || objF3 == companion.a()) {
            Object aVar = new a(c3104a, activityResultRegistry, str, abstractC3466a, x1VarM2);
            interfaceC1554l.J(aVar);
            objF3 = aVar;
        }
        interfaceC1554l.O();
        C1516O.c(activityResultRegistry, str, abstractC3466a, (l) objF3, interfaceC1554l, (i10 << 6) & 896);
        interfaceC1554l.O();
        return c3109f;
    }
}
