package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ResolutionScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.k */
/* loaded from: classes3.dex */
public interface InterfaceC10254k {

    /* compiled from: ResolutionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.k$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Collection m36162a(InterfaceC10254k interfaceC10254k, C10247d c10247d, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i2 & 1) != 0) {
                c10247d = C10247d.f39642m;
            }
            if ((i2 & 2) != 0) {
                function1 = InterfaceC10251h.f39667a.m36159a();
            }
            return interfaceC10254k.mo33317g(c10247d, function1);
        }
    }

    /* renamed from: f */
    InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b);

    /* renamed from: g */
    Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1);
}
