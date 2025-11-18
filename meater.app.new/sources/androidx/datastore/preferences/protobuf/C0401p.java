package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0423y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.p */
/* loaded from: classes.dex */
public class C0401p {

    /* renamed from: a */
    private static boolean f2840a = true;

    /* renamed from: c */
    private static volatile C0401p f2842c;

    /* renamed from: e */
    private final Map<a, AbstractC0423y.e<?, ?>> f2844e;

    /* renamed from: b */
    private static final Class<?> f2841b = m3079c();

    /* renamed from: d */
    static final C0401p f2843d = new C0401p(true);

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$a */
    private static final class a {

        /* renamed from: a */
        private final Object f2845a;

        /* renamed from: b */
        private final int f2846b;

        a(Object obj, int i2) {
            this.f2845a = obj;
            this.f2846b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2845a == aVar.f2845a && this.f2846b == aVar.f2846b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2845a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f2846b;
        }
    }

    C0401p() {
        this.f2844e = new HashMap();
    }

    /* renamed from: b */
    public static C0401p m3078b() {
        C0401p c0401pM3068a = f2842c;
        if (c0401pM3068a == null) {
            synchronized (C0401p.class) {
                c0401pM3068a = f2842c;
                if (c0401pM3068a == null) {
                    c0401pM3068a = f2840a ? C0398o.m3068a() : f2843d;
                    f2842c = c0401pM3068a;
                }
            }
        }
        return c0401pM3068a;
    }

    /* renamed from: c */
    static Class<?> m3079c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC0405q0> AbstractC0423y.e<ContainingType, ?> m3080a(ContainingType containingtype, int i2) {
        return (AbstractC0423y.e) this.f2844e.get(new a(containingtype, i2));
    }

    C0401p(boolean z) {
        this.f2844e = Collections.emptyMap();
    }
}
