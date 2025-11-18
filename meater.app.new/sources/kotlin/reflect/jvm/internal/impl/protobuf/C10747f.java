package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* loaded from: classes3.dex */
public class C10747f {

    /* renamed from: a */
    private static final C10747f f41284a = new C10747f(true);

    /* renamed from: b */
    private final Map<a, AbstractC10749h.f<?, ?>> f41285b;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$a */
    private static final class a {

        /* renamed from: a */
        private final Object f41286a;

        /* renamed from: b */
        private final int f41287b;

        a(Object obj, int i2) {
            this.f41286a = obj;
            this.f41287b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41286a == aVar.f41286a && this.f41287b == aVar.f41287b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f41286a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f41287b;
        }
    }

    C10747f() {
        this.f41285b = new HashMap();
    }

    /* renamed from: c */
    public static C10747f m38347c() {
        return f41284a;
    }

    /* renamed from: d */
    public static C10747f m38348d() {
        return new C10747f();
    }

    /* renamed from: a */
    public final void m38349a(AbstractC10749h.f<?, ?> fVar) {
        this.f41285b.put(new a(fVar.m38410b(), fVar.m38412d()), fVar);
    }

    /* renamed from: b */
    public <ContainingType extends InterfaceC10756o> AbstractC10749h.f<ContainingType, ?> m38350b(ContainingType containingtype, int i2) {
        return (AbstractC10749h.f) this.f41285b.get(new a(containingtype, i2));
    }

    private C10747f(boolean z) {
        this.f41285b = Collections.emptyMap();
    }
}
