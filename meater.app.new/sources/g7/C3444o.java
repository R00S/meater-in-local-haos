package g7;

import d7.AbstractC3049c;
import d7.InterfaceC3051e;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3444o {

    /* renamed from: a, reason: collision with root package name */
    private static final L f42091a = new J();

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: g7.o$a */
    public interface a<R extends InterfaceC3051e, T> {
        T a(R r10);
    }

    public static <R extends InterfaceC3051e, T> AbstractC5208j<T> a(AbstractC3049c<R> abstractC3049c, a<R, T> aVar) {
        L l10 = f42091a;
        C5209k c5209k = new C5209k();
        abstractC3049c.b(new K(abstractC3049c, c5209k, aVar, l10));
        return c5209k.a();
    }
}
