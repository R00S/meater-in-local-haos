package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: ScopesHolderForClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0 */
/* loaded from: classes2.dex */
public final class C10737x0<T extends InterfaceC10251h> {

    /* renamed from: c */
    private final InterfaceC10585e f41238c;

    /* renamed from: d */
    private final Function1<AbstractC10396g, T> f41239d;

    /* renamed from: e */
    private final AbstractC10396g f41240e;

    /* renamed from: f */
    private final InterfaceC10325i f41241f;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f41237b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10737x0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public static final a f41236a = new a(null);

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final <T extends InterfaceC10251h> C10737x0<T> m38159a(InterfaceC10585e interfaceC10585e, InterfaceC10330n interfaceC10330n, AbstractC10396g abstractC10396g, Function1<? super AbstractC10396g, ? extends T> function1) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            C9801m.m32346f(interfaceC10330n, "storageManager");
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefinerForOwnerModule");
            C9801m.m32346f(function1, "scopeFactory");
            return new C10737x0<>(interfaceC10585e, interfaceC10330n, function1, abstractC10396g, null);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$b */
    static final class b extends Lambda implements Function0<T> {

        /* renamed from: f */
        final /* synthetic */ C10737x0<T> f41242f;

        /* renamed from: g */
        final /* synthetic */ AbstractC10396g f41243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10737x0<T> c10737x0, AbstractC10396g abstractC10396g) {
            super(0);
            this.f41242f = c10737x0;
            this.f41243g = abstractC10396g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((C10737x0) this.f41242f).f41239d.invoke(this.f41243g);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$c */
    static final class c extends Lambda implements Function0<T> {

        /* renamed from: f */
        final /* synthetic */ C10737x0<T> f41244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C10737x0<T> c10737x0) {
            super(0);
            this.f41244f = c10737x0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((C10737x0) this.f41244f).f41239d.invoke(((C10737x0) this.f41244f).f41240e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10737x0(InterfaceC10585e interfaceC10585e, InterfaceC10330n interfaceC10330n, Function1<? super AbstractC10396g, ? extends T> function1, AbstractC10396g abstractC10396g) {
        this.f41238c = interfaceC10585e;
        this.f41239d = function1;
        this.f41240e = abstractC10396g;
        this.f41241f = interfaceC10330n.mo36516d(new c(this));
    }

    public /* synthetic */ C10737x0(InterfaceC10585e interfaceC10585e, InterfaceC10330n interfaceC10330n, Function1 function1, AbstractC10396g abstractC10396g, C9789g c9789g) {
        this(interfaceC10585e, interfaceC10330n, function1, abstractC10396g);
    }

    /* renamed from: d */
    private final T m38157d() {
        return (T) C10329m.m36555a(this.f41241f, this, f41237b[0]);
    }

    /* renamed from: c */
    public final T m38158c(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        if (!abstractC10396g.mo36926d(C10235a.m36078l(this.f41238c))) {
            return (T) m38157d();
        }
        InterfaceC10345e1 interfaceC10345e1Mo32877h = this.f41238c.mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "classDescriptor.typeConstructor");
        return !abstractC10396g.mo36927e(interfaceC10345e1Mo32877h) ? (T) m38157d() : (T) abstractC10396g.mo36925c(this.f41238c, new b(this, abstractC10396g));
    }
}
