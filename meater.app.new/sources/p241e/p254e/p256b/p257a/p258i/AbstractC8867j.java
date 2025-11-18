package p241e.p254e.p256b.p257a.p258i;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.C8853c;

/* compiled from: EventInternal.java */
@AutoValue
/* renamed from: e.e.b.a.i.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8867j {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    /* renamed from: e.e.b.a.i.j$a */
    public static abstract class a {
        /* renamed from: a */
        public final a m28156a(String str, int i2) {
            mo28103e().put(str, String.valueOf(i2));
            return this;
        }

        /* renamed from: b */
        public final a m28157b(String str, long j2) {
            mo28103e().put(str, String.valueOf(j2));
            return this;
        }

        /* renamed from: c */
        public final a m28158c(String str, String str2) {
            mo28103e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC8867j mo28102d();

        /* renamed from: e */
        protected abstract Map<String, String> mo28103e();

        /* renamed from: f */
        protected abstract a mo28104f(Map<String, String> map);

        /* renamed from: g */
        public abstract a mo28105g(Integer num);

        /* renamed from: h */
        public abstract a mo28106h(C8866i c8866i);

        /* renamed from: i */
        public abstract a mo28107i(long j2);

        /* renamed from: j */
        public abstract a mo28108j(String str);

        /* renamed from: k */
        public abstract a mo28109k(long j2);
    }

    /* renamed from: a */
    public static a m28150a() {
        return new C8853c.b().mo28104f(new HashMap());
    }

    /* renamed from: b */
    public final String m28151b(String str) {
        String str2 = mo28096c().get(str);
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* renamed from: c */
    protected abstract Map<String, String> mo28096c();

    /* renamed from: d */
    public abstract Integer mo28097d();

    /* renamed from: e */
    public abstract C8866i mo28098e();

    /* renamed from: f */
    public abstract long mo28099f();

    /* renamed from: g */
    public final int m28152g(String str) {
        String str2 = mo28096c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m28153h(String str) {
        String str2 = mo28096c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m28154i() {
        return Collections.unmodifiableMap(mo28096c());
    }

    /* renamed from: j */
    public abstract String mo28100j();

    /* renamed from: k */
    public abstract long mo28101k();

    /* renamed from: l */
    public a m28155l() {
        return new C8853c.b().mo28108j(mo28100j()).mo28105g(mo28097d()).mo28106h(mo28098e()).mo28107i(mo28099f()).mo28109k(mo28101k()).mo28104f(new HashMap(mo28096c()));
    }
}
