package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.sequences.C10517i;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k */
/* loaded from: classes2.dex */
public final class C10624k implements InterfaceC10620g {

    /* renamed from: f */
    private final List<InterfaceC10620g> f40817f;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k$a */
    static final class a extends Lambda implements Function1<InterfaceC10620g, InterfaceC10616c> {

        /* renamed from: f */
        final /* synthetic */ C10160c f40818f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10160c c10160c) {
            super(1);
            this.f40818f = c10160c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10616c invoke(InterfaceC10620g interfaceC10620g) {
            C9801m.m32346f(interfaceC10620g, "it");
            return interfaceC10620g.mo33271l(this.f40818f);
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.k$b */
    static final class b extends Lambda implements Function1<InterfaceC10620g, Sequence<? extends InterfaceC10616c>> {

        /* renamed from: f */
        public static final b f40819f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<InterfaceC10616c> invoke(InterfaceC10620g interfaceC10620g) {
            C9801m.m32346f(interfaceC10620g, "it");
            return C10782c0.m38575J(interfaceC10620g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10624k(List<? extends InterfaceC10620g> list) {
        C9801m.m32346f(list, "delegates");
        this.f40817f = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        Iterator it = C10782c0.m38575J(this.f40817f).iterator();
        while (it.hasNext()) {
            if (((InterfaceC10620g) it.next()).mo33270R0(c10160c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        List<InterfaceC10620g> list = this.f40817f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC10620g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        return C10522n.m37386p(C10782c0.m38575J(this.f40817f), b.f40819f).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: l */
    public InterfaceC10616c mo33271l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return (InterfaceC10616c) C10517i.m37359o(C10522n.m37392v(C10782c0.m38575J(this.f40817f), new a(c10160c)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10624k(InterfaceC10620g... interfaceC10620gArr) {
        this((List<? extends InterfaceC10620g>) C10803n.m38746Z(interfaceC10620gArr));
        C9801m.m32346f(interfaceC10620gArr, "delegates");
    }
}
