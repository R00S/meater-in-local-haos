package Oa;

import Ra.H;
import Ra.O;
import java.util.ServiceLoader;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13311a = a.f13312a;

    /* compiled from: BuiltInsLoader.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f13312a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC4164i<b> f13313b = C4165j.b(EnumC4168m.f46627C, Oa.a.f13310B);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            C3862t.d(serviceLoaderLoad);
            b bVar = (b) kotlin.collections.r.k0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return f13313b.getValue();
        }
    }

    O a(Gb.n nVar, H h10, Iterable<? extends Ta.b> iterable, Ta.c cVar, Ta.a aVar, boolean z10);
}
