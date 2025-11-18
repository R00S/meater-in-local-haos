package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: DeserializedAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.a */
/* loaded from: classes3.dex */
public class C10284a implements InterfaceC10620g {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f39762f = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10284a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: g */
    private final InterfaceC10325i f39763g;

    public C10284a(InterfaceC10330n interfaceC10330n, Function0<? extends List<? extends InterfaceC10616c>> function0) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(function0, "compute");
        this.f39763g = interfaceC10330n.mo36516d(function0);
    }

    /* renamed from: c */
    private final List<InterfaceC10616c> m36256c() {
        return (List) C10329m.m36555a(this.f39763g, this, f39762f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        return InterfaceC10620g.b.m37738b(this, c10160c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        return m36256c().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        return m36256c().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: l */
    public InterfaceC10616c mo33271l(C10160c c10160c) {
        return InterfaceC10620g.b.m37737a(this, c10160c);
    }
}
