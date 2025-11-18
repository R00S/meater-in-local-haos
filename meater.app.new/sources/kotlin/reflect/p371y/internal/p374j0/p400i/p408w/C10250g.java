package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: LazyScopeAdapter.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.g */
/* loaded from: classes3.dex */
public final class C10250g extends AbstractC10244a {

    /* renamed from: b */
    private final InterfaceC10325i<InterfaceC10251h> f39665b;

    /* compiled from: LazyScopeAdapter.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.g$a */
    static final class a extends Lambda implements Function0<InterfaceC10251h> {

        /* renamed from: f */
        final /* synthetic */ Function0<InterfaceC10251h> f39666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends InterfaceC10251h> function0) {
            super(0);
            this.f39666f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10251h invoke() {
            InterfaceC10251h interfaceC10251hInvoke = this.f39666f.invoke();
            return interfaceC10251hInvoke instanceof AbstractC10244a ? ((AbstractC10244a) interfaceC10251hInvoke).m36121h() : interfaceC10251hInvoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10250g(Function0<? extends InterfaceC10251h> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        C9801m.m32346f(function0, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C10250g(InterfaceC10330n interfaceC10330n, Function0 function0, int i2, C9789g c9789g) {
        if ((i2 & 1) != 0) {
            interfaceC10330n = C10322f.f40008b;
            C9801m.m32345e(interfaceC10330n, "NO_LOCKS");
        }
        this(interfaceC10330n, function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10244a
    /* renamed from: i */
    protected InterfaceC10251h mo36122i() {
        return this.f39665b.invoke();
    }

    public C10250g(InterfaceC10330n interfaceC10330n, Function0<? extends InterfaceC10251h> function0) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(function0, "getScope");
        this.f39665b = interfaceC10330n.mo36516d(new a(function0));
    }
}
