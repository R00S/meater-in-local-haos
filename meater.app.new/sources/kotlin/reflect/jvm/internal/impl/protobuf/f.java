package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f44046b = new f(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, h.f<?, ?>> f44047a;

    /* compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f44048a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44049b;

        a(Object obj, int i10) {
            this.f44048a = obj;
            this.f44049b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44048a == aVar.f44048a && this.f44049b == aVar.f44049b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f44048a) * 65535) + this.f44049b;
        }
    }

    f() {
        this.f44047a = new HashMap();
    }

    public static f c() {
        return f44046b;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.f<?, ?> fVar) {
        this.f44047a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends o> h.f<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (h.f) this.f44047a.get(new a(containingtype, i10));
    }

    private f(boolean z10) {
        this.f44047a = Collections.emptyMap();
    }
}
