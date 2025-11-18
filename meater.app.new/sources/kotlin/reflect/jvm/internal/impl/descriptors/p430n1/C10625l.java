package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.l */
/* loaded from: classes2.dex */
public final class C10625l implements InterfaceC10620g {

    /* renamed from: f */
    private final InterfaceC10620g f40820f;

    /* renamed from: g */
    private final boolean f40821g;

    /* renamed from: h */
    private final Function1<C10160c, Boolean> f40822h;

    /* JADX WARN: Multi-variable type inference failed */
    public C10625l(InterfaceC10620g interfaceC10620g, boolean z, Function1<? super C10160c, Boolean> function1) {
        C9801m.m32346f(interfaceC10620g, "delegate");
        C9801m.m32346f(function1, "fqNameFilter");
        this.f40820f = interfaceC10620g;
        this.f40821g = z;
        this.f40822h = function1;
    }

    /* renamed from: c */
    private final boolean m37744c(InterfaceC10616c interfaceC10616c) {
        C10160c c10160cMo33162d = interfaceC10616c.mo33162d();
        return c10160cMo33162d != null && this.f40822h.invoke(c10160cMo33162d).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: R0 */
    public boolean mo33270R0(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        if (this.f40822h.invoke(c10160c).booleanValue()) {
            return this.f40820f.mo33270R0(c10160c);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    public boolean isEmpty() {
        boolean z;
        InterfaceC10620g interfaceC10620g = this.f40820f;
        if ((interfaceC10620g instanceof Collection) && ((Collection) interfaceC10620g).isEmpty()) {
            z = false;
        } else {
            Iterator<InterfaceC10616c> it = interfaceC10620g.iterator();
            while (it.hasNext()) {
                if (m37744c(it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return this.f40821g ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10616c> iterator() {
        InterfaceC10620g interfaceC10620g = this.f40820f;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10616c interfaceC10616c : interfaceC10620g) {
            if (m37744c(interfaceC10616c)) {
                arrayList.add(interfaceC10616c);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
    /* renamed from: l */
    public InterfaceC10616c mo33271l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        if (this.f40822h.invoke(c10160c).booleanValue()) {
            return this.f40820f.mo33271l(c10160c);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10625l(InterfaceC10620g interfaceC10620g, Function1<? super C10160c, Boolean> function1) {
        this(interfaceC10620g, false, function1);
        C9801m.m32346f(interfaceC10620g, "delegate");
        C9801m.m32346f(function1, "fqNameFilter");
    }
}
