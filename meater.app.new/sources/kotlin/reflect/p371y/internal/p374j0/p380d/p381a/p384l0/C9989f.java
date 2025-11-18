package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Collection;
import java.util.List;
import kotlin.C10563j;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9994k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10002h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10317a;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.f */
/* loaded from: classes2.dex */
public final class C9989f implements InterfaceC10629o0 {

    /* renamed from: a */
    private final C9990g f37994a;

    /* renamed from: b */
    private final InterfaceC10317a<C10160c, C10002h> f37995b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.f$a */
    static final class a extends Lambda implements Function0<C10002h> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10044u f37997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10044u interfaceC10044u) {
            super(0);
            this.f37997g = interfaceC10044u;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10002h invoke() {
            return new C10002h(C9989f.this.f37994a, this.f37997g);
        }
    }

    public C9989f(C9985b c9985b) {
        C9801m.m32346f(c9985b, "components");
        C9990g c9990g = new C9990g(c9985b, InterfaceC9994k.a.f38010a, C10563j.m37644c(null));
        this.f37994a = c9990g;
        this.f37995b = c9990g.m33286e().mo36514b();
    }

    /* renamed from: e */
    private final C10002h m33275e(C10160c c10160c) {
        InterfaceC10044u interfaceC10044uM33632a = InterfaceC10050o.a.m33632a(this.f37994a.m33282a().m33244d(), c10160c, false, 2, null);
        if (interfaceC10044uM33632a == null) {
            return null;
        }
        return this.f37995b.mo36506b(c10160c, new a(interfaceC10044uM33632a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: a */
    public List<C10002h> mo33276a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return C10817u.m38892n(m33275e(c10160c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: b */
    public void mo33277b(C10160c c10160c, Collection<InterfaceC10604k0> collection) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(collection, "packageFragments");
        C10767a.m38508a(collection, m33275e(c10160c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: c */
    public boolean mo33278c(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return InterfaceC10050o.a.m33632a(this.f37994a.m33282a().m33244d(), c10160c, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<C10160c> mo33280p(C10160c c10160c, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(function1, "nameFilter");
        C10002h c10002hM33275e = m33275e(c10160c);
        List<C10160c> listM33429P0 = c10002hM33275e != null ? c10002hM33275e.m33429P0() : null;
        return listM33429P0 == null ? C10817u.m38888j() : listM33429P0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f37994a.m33282a().m33253m();
    }
}
