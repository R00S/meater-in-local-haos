package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ServiceLoader;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: BuiltInsLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.b.a */
/* loaded from: classes2.dex */
public interface InterfaceC9907a {

    /* renamed from: a */
    public static final a f37446a = a.f37447a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.a$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f37447a = new a();

        /* renamed from: b */
        private static final Lazy<InterfaceC9907a> f37448b = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, C11541a.f37449f);

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.a$a$a, reason: collision with other inner class name */
        static final class C11541a extends Lambda implements Function0<InterfaceC9907a> {

            /* renamed from: f */
            public static final C11541a f37449f = new C11541a();

            C11541a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC9907a invoke() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC9907a.class, InterfaceC9907a.class.getClassLoader());
                C9801m.m32345e(serviceLoaderLoad, "implementations");
                InterfaceC9907a interfaceC9907a = (InterfaceC9907a) C10813s.m38831V(serviceLoaderLoad);
                if (interfaceC9907a != null) {
                    return interfaceC9907a;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC9907a m32698a() {
            return f37448b.getValue();
        }
    }

    /* renamed from: a */
    InterfaceC10607l0 mo32697a(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, Iterable<? extends InterfaceC10631b> iterable, InterfaceC10632c interfaceC10632c, InterfaceC10630a interfaceC10630a, boolean z);
}
