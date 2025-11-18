package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Iterator;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9965c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.sequences.C10522n;

/* compiled from: LazyJavaAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.d */
/* loaded from: classes2.dex */
public final class C9987d implements InterfaceC10620g {

    /* renamed from: f */
    private final C9990g f37989f;

    /* renamed from: g */
    private final InterfaceC10025d f37990g;

    /* renamed from: h */
    private final boolean f37991h;

    /* renamed from: i */
    private final InterfaceC10324h<InterfaceC10019a, InterfaceC10616c> f37992i;

    /* compiled from: LazyJavaAnnotations.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.d$a */
    static final class a extends Lambda implements Function1<InterfaceC10019a, InterfaceC10616c> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10616c invoke(InterfaceC10019a interfaceC10019a) {
            C9801m.m32346f(interfaceC10019a, "annotation");
            return C9965c.f37907a.m33171e(interfaceC10019a, C9987d.this.f37989f, C9987d.this.f37991h);
        }
    }

    public C9987d(C9990g c9990g, InterfaceC10025d interfaceC10025d, boolean z) {
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10025d, "annotationOwner");
        this.f37989f = c9990g;
        this.f37990g = interfaceC10025d;
        this.f37991h = z;
        this.f37992i = c9990g.m33282a().m33261u().mo36521i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        return InterfaceC10620g.b.m37738b(this, c10160c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        return this.f37990g.getAnnotations().isEmpty() && !this.f37990g.mo33583m();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        return C10522n.m37384n(C10522n.m37394x(C10522n.m37391u(C10782c0.m38575J(this.f37990g.getAnnotations()), this.f37992i), C9965c.f37907a.m33167a(C9917k.a.f37608y, this.f37990g, this.f37989f))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: l */
    public InterfaceC10616c mo33271l(C10160c c10160c) {
        InterfaceC10616c interfaceC10616cInvoke;
        C9801m.m32346f(c10160c, "fqName");
        InterfaceC10019a interfaceC10019aMo33582l = this.f37990g.mo33582l(c10160c);
        return (interfaceC10019aMo33582l == null || (interfaceC10616cInvoke = this.f37992i.invoke(interfaceC10019aMo33582l)) == null) ? C9965c.f37907a.m33167a(c10160c, this.f37990g, this.f37989f) : interfaceC10616cInvoke;
    }

    public /* synthetic */ C9987d(C9990g c9990g, InterfaceC10025d interfaceC10025d, boolean z, int i2, C9789g c9789g) {
        this(c9990g, interfaceC10025d, (i2 & 4) != 0 ? false : z);
    }
}
