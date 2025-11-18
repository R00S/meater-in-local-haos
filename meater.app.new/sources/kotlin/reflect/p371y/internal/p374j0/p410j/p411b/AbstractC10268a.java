package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10268a implements InterfaceC10629o0 {

    /* renamed from: a */
    private final InterfaceC10330n f39708a;

    /* renamed from: b */
    private final InterfaceC10311u f39709b;

    /* renamed from: c */
    private final InterfaceC10592g0 f39710c;

    /* renamed from: d */
    protected C10301k f39711d;

    /* renamed from: e */
    private final InterfaceC10324h<C10160c, InterfaceC10604k0> f39712e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.a$a */
    static final class a extends Lambda implements Function1<C10160c, InterfaceC10604k0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10604k0 invoke(C10160c c10160c) {
            C9801m.m32346f(c10160c, "fqName");
            AbstractC10306p abstractC10306pMo33001d = AbstractC10268a.this.mo33001d(c10160c);
            if (abstractC10306pMo33001d == null) {
                return null;
            }
            abstractC10306pMo33001d.mo36465M0(AbstractC10268a.this.m36198e());
            return abstractC10306pMo33001d;
        }
    }

    public AbstractC10268a(InterfaceC10330n interfaceC10330n, InterfaceC10311u interfaceC10311u, InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10311u, "finder");
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        this.f39708a = interfaceC10330n;
        this.f39709b = interfaceC10311u;
        this.f39710c = interfaceC10592g0;
        this.f39712e = interfaceC10330n.mo36521i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: a */
    public List<InterfaceC10604k0> mo33276a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return C10817u.m38892n(this.f39712e.invoke(c10160c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: b */
    public void mo33277b(C10160c c10160c, Collection<InterfaceC10604k0> collection) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(collection, "packageFragments");
        C10767a.m38508a(collection, this.f39712e.invoke(c10160c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: c */
    public boolean mo33278c(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return (this.f39712e.mo36544f(c10160c) ? (InterfaceC10604k0) this.f39712e.invoke(c10160c) : mo33001d(c10160c)) == null;
    }

    /* renamed from: d */
    protected abstract AbstractC10306p mo33001d(C10160c c10160c);

    /* renamed from: e */
    protected final C10301k m36198e() {
        C10301k c10301k = this.f39711d;
        if (c10301k != null) {
            return c10301k;
        }
        C9801m.m32363w("components");
        return null;
    }

    /* renamed from: f */
    protected final InterfaceC10311u m36199f() {
        return this.f39709b;
    }

    /* renamed from: g */
    protected final InterfaceC10592g0 m36200g() {
        return this.f39710c;
    }

    /* renamed from: h */
    protected final InterfaceC10330n m36201h() {
        return this.f39708a;
    }

    /* renamed from: i */
    protected final void m36202i(C10301k c10301k) {
        C9801m.m32346f(c10301k, "<set-?>");
        this.f39711d = c10301k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: p */
    public Collection<C10160c> mo33280p(C10160c c10160c, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(function1, "nameFilter");
        return C10822w0.m38917d();
    }
}
