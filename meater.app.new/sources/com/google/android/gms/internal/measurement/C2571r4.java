package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2571r4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C2571r4 f34284b;

    /* renamed from: c, reason: collision with root package name */
    static final C2571r4 f34285c = new C2571r4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, F4.d<?, ?>> f34286a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.r4$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f34287a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34288b;

        a(Object obj, int i10) {
            this.f34287a = obj;
            this.f34288b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34287a == aVar.f34287a && this.f34288b == aVar.f34288b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f34287a) * 65535) + this.f34288b;
        }
    }

    C2571r4() {
        this.f34286a = new HashMap();
    }

    public static C2571r4 a() {
        C2571r4 c2571r4 = f34284b;
        if (c2571r4 != null) {
            return c2571r4;
        }
        synchronized (C2571r4.class) {
            try {
                C2571r4 c2571r42 = f34284b;
                if (c2571r42 != null) {
                    return c2571r42;
                }
                C2571r4 c2571r4B = E4.b(C2571r4.class);
                f34284b = c2571r4B;
                return c2571r4B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends InterfaceC2517k5> F4.d<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (F4.d) this.f34286a.get(new a(containingtype, i10));
    }

    private C2571r4(boolean z10) {
        this.f34286a = Collections.emptyMap();
    }
}
