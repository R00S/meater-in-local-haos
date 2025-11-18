package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ModuleDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0 */
/* loaded from: classes2.dex */
public interface InterfaceC10592g0 extends InterfaceC10609m {

    /* compiled from: ModuleDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0$a */
    public static final class a {
        /* renamed from: a */
        public static <R, D> R m37689a(InterfaceC10592g0 interfaceC10592g0, InterfaceC10628o<R, D> interfaceC10628o, D d2) {
            C9801m.m32346f(interfaceC10628o, "visitor");
            return interfaceC10628o.mo35680j(interfaceC10592g0, d2);
        }

        /* renamed from: b */
        public static InterfaceC10609m m37690b(InterfaceC10592g0 interfaceC10592g0) {
            return null;
        }
    }

    /* renamed from: I0 */
    <T> T mo37016I0(C10589f0<T> c10589f0);

    /* renamed from: N */
    InterfaceC10636p0 mo37018N(C10160c c10160c);

    /* renamed from: e0 */
    boolean mo37020e0(InterfaceC10592g0 interfaceC10592g0);

    /* renamed from: o */
    AbstractC9914h mo37021o();

    /* renamed from: p */
    Collection<C10160c> mo37022p(C10160c c10160c, Function1<? super C10163f, Boolean> function1);

    /* renamed from: t0 */
    List<InterfaceC10592g0> mo37023t0();
}
