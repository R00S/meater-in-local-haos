package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10676z;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: DeserializedPackageFragment.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.p */
/* loaded from: classes3.dex */
public abstract class AbstractC10306p extends AbstractC10676z {

    /* renamed from: l */
    private final InterfaceC10330n f39945l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10306p(C10160c c10160c, InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0) {
        super(interfaceC10592g0, c10160c);
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "module");
        this.f39945l = interfaceC10330n;
    }

    /* renamed from: A0 */
    public abstract InterfaceC10298h mo36463A0();

    /* renamed from: L0 */
    public boolean m36464L0(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        InterfaceC10251h interfaceC10251hMo32988q = mo32988q();
        return (interfaceC10251hMo32988q instanceof AbstractC10291h) && ((AbstractC10291h) interfaceC10251hMo32988q).m36326q().contains(c10163f);
    }

    /* renamed from: M0 */
    public abstract void mo36465M0(C10301k c10301k);
}
