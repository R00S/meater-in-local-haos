package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.Iterator;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.c */
/* loaded from: classes3.dex */
final class C10053c implements InterfaceC10620g {

    /* renamed from: f */
    private final C10160c f38209f;

    public C10053c(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqNameToMatch");
        this.f38209f = c10160c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        return InterfaceC10620g.b.m37738b(this, c10160c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C10052b mo33271l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        if (C9801m.m32341a(c10160c, this.f38209f)) {
            return C10052b.f38208a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        return C10817u.m38888j().iterator();
    }
}
