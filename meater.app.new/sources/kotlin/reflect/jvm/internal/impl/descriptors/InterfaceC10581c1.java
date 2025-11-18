package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C10775u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;

/* compiled from: SupertypeLoopChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1 */
/* loaded from: classes2.dex */
public interface InterfaceC10581c1 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1$a */
    public static final class a implements InterfaceC10581c1 {

        /* renamed from: a */
        public static final a f40737a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1
        /* renamed from: a */
        public Collection<AbstractC10344e0> mo37674a(InterfaceC10345e1 interfaceC10345e1, Collection<? extends AbstractC10344e0> collection, Function1<? super InterfaceC10345e1, ? extends Iterable<? extends AbstractC10344e0>> function1, Function1<? super AbstractC10344e0, C10775u> function12) {
            C9801m.m32346f(interfaceC10345e1, "currentTypeConstructor");
            C9801m.m32346f(collection, "superTypes");
            C9801m.m32346f(function1, "neighbors");
            C9801m.m32346f(function12, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<AbstractC10344e0> mo37674a(InterfaceC10345e1 interfaceC10345e1, Collection<? extends AbstractC10344e0> collection, Function1<? super InterfaceC10345e1, ? extends Iterable<? extends AbstractC10344e0>> function1, Function1<? super AbstractC10344e0, C10775u> function12);
}
