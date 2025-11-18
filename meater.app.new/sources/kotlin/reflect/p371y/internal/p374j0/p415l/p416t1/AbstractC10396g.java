package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10355i;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;

/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10396g extends AbstractC10355i {

    /* compiled from: KotlinTypeRefiner.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.g$a */
    public static final class a extends AbstractC10396g {

        /* renamed from: a */
        public static final a f40183a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: b */
        public InterfaceC10585e mo36924b(C10159b c10159b) {
            C9801m.m32346f(c10159b, "classId");
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: c */
        public <S extends InterfaceC10251h> S mo36925c(InterfaceC10585e interfaceC10585e, Function0<? extends S> function0) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            C9801m.m32346f(function0, "compute");
            return function0.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: d */
        public boolean mo36926d(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: e */
        public boolean mo36927e(InterfaceC10345e1 interfaceC10345e1) {
            C9801m.m32346f(interfaceC10345e1, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: g */
        public Collection<AbstractC10344e0> mo36929g(InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            Collection<AbstractC10344e0> collectionMo35998a = interfaceC10585e.mo32877h().mo35998a();
            C9801m.m32345e(collectionMo35998a, "classDescriptor.typeConstructor.supertypes");
            return collectionMo35998a;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10355i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC10344e0 mo36717a(InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "type");
            return (AbstractC10344e0) interfaceC10442i;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC10585e mo36928f(InterfaceC10609m interfaceC10609m) {
            C9801m.m32346f(interfaceC10609m, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract InterfaceC10585e mo36924b(C10159b c10159b);

    /* renamed from: c */
    public abstract <S extends InterfaceC10251h> S mo36925c(InterfaceC10585e interfaceC10585e, Function0<? extends S> function0);

    /* renamed from: d */
    public abstract boolean mo36926d(InterfaceC10592g0 interfaceC10592g0);

    /* renamed from: e */
    public abstract boolean mo36927e(InterfaceC10345e1 interfaceC10345e1);

    /* renamed from: f */
    public abstract InterfaceC10594h mo36928f(InterfaceC10609m interfaceC10609m);

    /* renamed from: g */
    public abstract Collection<AbstractC10344e0> mo36929g(InterfaceC10585e interfaceC10585e);

    /* renamed from: h */
    public abstract AbstractC10344e0 mo36717a(InterfaceC10442i interfaceC10442i);
}
