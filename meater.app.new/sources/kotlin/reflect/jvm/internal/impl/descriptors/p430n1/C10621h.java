package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: AnnotationsImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.h */
/* loaded from: classes2.dex */
public final class C10621h implements InterfaceC10620g {

    /* renamed from: f */
    private final List<InterfaceC10616c> f40811f;

    /* JADX WARN: Multi-variable type inference failed */
    public C10621h(List<? extends InterfaceC10616c> list) {
        C9801m.m32346f(list, "annotations");
        this.f40811f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        return InterfaceC10620g.b.m37738b(this, c10160c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        return this.f40811f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        return this.f40811f.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: l */
    public InterfaceC10616c mo33271l(C10160c c10160c) {
        return InterfaceC10620g.b.m37737a(this, c10160c);
    }

    public String toString() {
        return this.f40811f.toString();
    }
}
