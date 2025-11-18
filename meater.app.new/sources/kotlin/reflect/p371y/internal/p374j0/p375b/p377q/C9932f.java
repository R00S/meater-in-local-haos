package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10674x;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: JvmBuiltIns.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.f */
/* loaded from: classes2.dex */
public final class C9932f extends AbstractC9914h {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f37699h = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9932f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: i */
    private final a f37700i;

    /* renamed from: j */
    private Function0<b> f37701j;

    /* renamed from: k */
    private final InterfaceC10325i f37702k;

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$a */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$b */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC10592g0 f37707a;

        /* renamed from: b */
        private final boolean f37708b;

        public b(InterfaceC10592g0 interfaceC10592g0, boolean z) {
            C9801m.m32346f(interfaceC10592g0, "ownerModuleDescriptor");
            this.f37707a = interfaceC10592g0;
            this.f37708b = z;
        }

        /* renamed from: a */
        public final InterfaceC10592g0 m32959a() {
            return this.f37707a;
        }

        /* renamed from: b */
        public final boolean m32960b() {
            return this.f37708b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37709a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[a.FALLBACK.ordinal()] = 3;
            f37709a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$d */
    static final class d extends Lambda implements Function0<C9933g> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10330n f37711g;

        /* compiled from: JvmBuiltIns.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.q.f$d$a */
        static final class a extends Lambda implements Function0<b> {

            /* renamed from: f */
            final /* synthetic */ C9932f f37712f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9932f c9932f) {
                super(0);
                this.f37712f = c9932f;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                Function0 function0 = this.f37712f.f37701j;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                b bVar = (b) function0.invoke();
                this.f37712f.f37701j = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC10330n interfaceC10330n) {
            super(0);
            this.f37711g = interfaceC10330n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C9933g invoke() {
            C10674x c10674xM32798r = C9932f.this.m32798r();
            C9801m.m32345e(c10674xM32798r, "builtInsModule");
            return new C9933g(c10674xM32798r, this.f37711g, new a(C9932f.this));
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.f$e */
    static final class e extends Lambda implements Function0<b> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10592g0 f37713f;

        /* renamed from: g */
        final /* synthetic */ boolean f37714g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC10592g0 interfaceC10592g0, boolean z) {
            super(0);
            this.f37713f = interfaceC10592g0;
            this.f37714g = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f37713f, this.f37714g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9932f(InterfaceC10330n interfaceC10330n, a aVar) {
        super(interfaceC10330n);
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(aVar, "kind");
        this.f37700i = aVar;
        this.f37702k = interfaceC10330n.mo36516d(new d(interfaceC10330n));
        int i2 = c.f37709a[aVar.ordinal()];
        if (i2 == 2) {
            m32788f(false);
        } else {
            if (i2 != 3) {
                return;
            }
            m32788f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10631b> mo32802v() {
        Iterable<InterfaceC10631b> iterableMo32802v = super.mo32802v();
        C9801m.m32345e(iterableMo32802v, "super.getClassDescriptorFactories()");
        InterfaceC10330n interfaceC10330nM32782U = m32782U();
        C9801m.m32345e(interfaceC10330nM32782U, "storageManager");
        C10674x c10674xM32798r = m32798r();
        C9801m.m32345e(c10674xM32798r, "builtInsModule");
        return C10782c0.m38608n0(iterableMo32802v, new C9931e(interfaceC10330nM32782U, c10674xM32798r, null, 4, null));
    }

    /* renamed from: H0 */
    public final C9933g m32955H0() {
        return (C9933g) C10329m.m36555a(this.f37702k, this, f37699h[0]);
    }

    /* renamed from: I0 */
    public final void m32956I0(InterfaceC10592g0 interfaceC10592g0, boolean z) {
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        m32957J0(new e(interfaceC10592g0, z));
    }

    /* renamed from: J0 */
    public final void m32957J0(Function0<b> function0) {
        C9801m.m32346f(function0, "computation");
        Function0<b> function02 = this.f37701j;
        this.f37701j = function0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h
    /* renamed from: M */
    protected InterfaceC10632c mo32778M() {
        return m32955H0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h
    /* renamed from: g */
    protected InterfaceC10630a mo32789g() {
        return m32955H0();
    }
}
