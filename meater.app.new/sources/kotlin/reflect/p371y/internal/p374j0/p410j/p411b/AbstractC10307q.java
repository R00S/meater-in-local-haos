package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10134m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10136o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10137p;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10152d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10292i;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.q */
/* loaded from: classes3.dex */
public abstract class AbstractC10307q extends AbstractC10306p {

    /* renamed from: m */
    private final AbstractC10149a f39946m;

    /* renamed from: n */
    private final InterfaceC10289f f39947n;

    /* renamed from: o */
    private final C10152d f39948o;

    /* renamed from: p */
    private final C10315y f39949p;

    /* renamed from: q */
    private C10134m f39950q;

    /* renamed from: r */
    private InterfaceC10251h f39951r;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.q$a */
    static final class a extends Lambda implements Function1<C10159b, InterfaceC10741z0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10741z0 invoke(C10159b c10159b) {
            C9801m.m32346f(c10159b, "it");
            InterfaceC10289f interfaceC10289f = AbstractC10307q.this.f39947n;
            if (interfaceC10289f != null) {
                return interfaceC10289f;
            }
            InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
            C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
            return interfaceC10741z0;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.q$b */
    static final class b extends Lambda implements Function0<Collection<? extends C10163f>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10163f> invoke() {
            Collection<C10159b> collectionM36496b = AbstractC10307q.this.mo36463A0().m36496b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionM36496b) {
                C10159b c10159b = (C10159b) obj;
                if ((c10159b.m35417l() || C10299i.f39901a.m36412a().contains(c10159b)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C10159b) it.next()).m35415j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10307q(C10160c c10160c, InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, C10134m c10134m, AbstractC10149a abstractC10149a, InterfaceC10289f interfaceC10289f) {
        super(c10160c, interfaceC10330n, interfaceC10592g0);
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10134m, "proto");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        this.f39946m = abstractC10149a;
        this.f39947n = interfaceC10289f;
        C10137p c10137pM34835O = c10134m.m34835O();
        C9801m.m32345e(c10137pM34835O, "proto.strings");
        C10136o c10136oM34834N = c10134m.m34834N();
        C9801m.m32345e(c10136oM34834N, "proto.qualifiedNames");
        C10152d c10152d = new C10152d(c10137pM34835O, c10136oM34834N);
        this.f39948o = c10152d;
        this.f39949p = new C10315y(c10134m, c10152d, abstractC10149a, new a());
        this.f39950q = c10134m;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10306p
    /* renamed from: M0 */
    public void mo36465M0(C10301k c10301k) {
        C9801m.m32346f(c10301k, "components");
        C10134m c10134m = this.f39950q;
        if (c10134m == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f39950q = null;
        C10133l c10133lM34833M = c10134m.m34833M();
        C9801m.m32345e(c10133lM34833M, "proto.`package`");
        this.f39951r = new C10292i(this, c10133lM34833M, this.f39948o, this.f39946m, this.f39947n, c10301k, "scope of " + this, new b());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10306p
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C10315y mo36463A0() {
        return this.f39949p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0
    /* renamed from: q */
    public InterfaceC10251h mo32988q() {
        InterfaceC10251h interfaceC10251h = this.f39951r;
        if (interfaceC10251h != null) {
            return interfaceC10251h;
        }
        C9801m.m32363w("_memberScope");
        return null;
    }
}
