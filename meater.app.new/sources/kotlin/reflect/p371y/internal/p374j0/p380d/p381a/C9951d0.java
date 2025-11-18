package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10162e;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.d0 */
/* loaded from: classes2.dex */
public final class C9951d0<T> implements InterfaceC9949c0<T> {

    /* renamed from: b */
    private final Map<C10160c, T> f37842b;

    /* renamed from: c */
    private final C10322f f37843c;

    /* renamed from: d */
    private final InterfaceC10324h<C10160c, T> f37844d;

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.d0$a */
    static final class a extends Lambda implements Function1<C10160c, T> {

        /* renamed from: f */
        final /* synthetic */ C9951d0<T> f37845f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9951d0<T> c9951d0) {
            super(1);
            this.f37845f = c9951d0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke(C10160c c10160c) {
            C9801m.m32345e(c10160c, "it");
            return (T) C10162e.m35443a(c10160c, this.f37845f.m33073b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9951d0(Map<C10160c, ? extends T> map) {
        C9801m.m32346f(map, "states");
        this.f37842b = map;
        C10322f c10322f = new C10322f("Java nullability annotation states");
        this.f37843c = c10322f;
        InterfaceC10324h<C10160c, T> interfaceC10324hMo36521i = c10322f.mo36521i(new a(this));
        C9801m.m32345e(interfaceC10324hMo36521i, "storageManager.createMem…cificFqname(states)\n    }");
        this.f37844d = interfaceC10324hMo36521i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC9949c0
    /* renamed from: a */
    public T mo33066a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return this.f37844d.invoke(c10160c);
    }

    /* renamed from: b */
    public final Map<C10160c, T> m33073b() {
        return this.f37842b;
    }
}
