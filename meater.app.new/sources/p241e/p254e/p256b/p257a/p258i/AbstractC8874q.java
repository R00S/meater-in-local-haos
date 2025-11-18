package p241e.p254e.p256b.p257a.p258i;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.EnumC8787d;
import p241e.p254e.p256b.p257a.p258i.C8862e;

/* compiled from: TransportContext.java */
@AutoValue
/* renamed from: e.e.b.a.i.q */
/* loaded from: classes2.dex */
public abstract class AbstractC8874q {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* renamed from: e.e.b.a.i.q$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8874q mo28137a();

        /* renamed from: b */
        public abstract a mo28138b(String str);

        /* renamed from: c */
        public abstract a mo28139c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo28140d(EnumC8787d enumC8787d);
    }

    /* renamed from: a */
    public static a m28169a() {
        return new C8862e.b().mo28140d(EnumC8787d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo28134b();

    /* renamed from: c */
    public abstract byte[] mo28135c();

    /* renamed from: d */
    public abstract EnumC8787d mo28136d();

    /* renamed from: e */
    public boolean m28170e() {
        return mo28135c() != null;
    }

    /* renamed from: f */
    public AbstractC8874q m28171f(EnumC8787d enumC8787d) {
        return m28169a().mo28138b(mo28134b()).mo28140d(enumC8787d).mo28139c(mo28135c()).mo28137a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo28134b();
        objArr[1] = mo28136d();
        objArr[2] = mo28135c() == null ? HttpUrl.FRAGMENT_ENCODE_SET : Base64.encodeToString(mo28135c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
