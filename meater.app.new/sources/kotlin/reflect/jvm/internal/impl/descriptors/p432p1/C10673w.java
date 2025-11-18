package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9801m;

/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.w */
/* loaded from: classes2.dex */
public final class C10673w implements InterfaceC10672v {

    /* renamed from: a */
    private final List<C10674x> f41104a;

    /* renamed from: b */
    private final Set<C10674x> f41105b;

    /* renamed from: c */
    private final List<C10674x> f41106c;

    /* renamed from: d */
    private final Set<C10674x> f41107d;

    public C10673w(List<C10674x> list, Set<C10674x> set, List<C10674x> list2, Set<C10674x> set2) {
        C9801m.m32346f(list, "allDependencies");
        C9801m.m32346f(set, "modulesWhoseInternalsAreVisible");
        C9801m.m32346f(list2, "directExpectedByDependencies");
        C9801m.m32346f(set2, "allExpectedByDependencies");
        this.f41104a = list;
        this.f41105b = set;
        this.f41106c = list2;
        this.f41107d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10672v
    /* renamed from: a */
    public List<C10674x> mo37979a() {
        return this.f41104a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10672v
    /* renamed from: b */
    public Set<C10674x> mo37980b() {
        return this.f41105b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10672v
    /* renamed from: c */
    public List<C10674x> mo37981c() {
        return this.f41106c;
    }
}
