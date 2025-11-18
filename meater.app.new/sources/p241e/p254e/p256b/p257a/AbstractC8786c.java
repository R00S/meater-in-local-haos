package p241e.p254e.p256b.p257a;

import com.google.auto.value.AutoValue;

/* compiled from: Event.java */
@AutoValue
/* renamed from: e.e.b.a.c */
/* loaded from: classes2.dex */
public abstract class AbstractC8786c<T> {
    /* renamed from: d */
    public static <T> AbstractC8786c<T> m27947d(T t) {
        return new C8784a(null, t, EnumC8787d.DEFAULT);
    }

    /* renamed from: e */
    public static <T> AbstractC8786c<T> m27948e(T t) {
        return new C8784a(null, t, EnumC8787d.VERY_LOW);
    }

    /* renamed from: f */
    public static <T> AbstractC8786c<T> m27949f(T t) {
        return new C8784a(null, t, EnumC8787d.HIGHEST);
    }

    /* renamed from: a */
    public abstract Integer mo27942a();

    /* renamed from: b */
    public abstract T mo27943b();

    /* renamed from: c */
    public abstract EnumC8787d mo27944c();
}
