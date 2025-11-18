package e7;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import g7.C3443n;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3212b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f40650a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f40651b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f40652c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40653d;

    private C3212b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f40651b = aVar;
        this.f40652c = dVar;
        this.f40653d = str;
        this.f40650a = C3443n.b(aVar, dVar, str);
    }

    public static <O extends a.d> C3212b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new C3212b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f40651b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3212b)) {
            return false;
        }
        C3212b c3212b = (C3212b) obj;
        return C3443n.a(this.f40651b, c3212b.f40651b) && C3443n.a(this.f40652c, c3212b.f40652c) && C3443n.a(this.f40653d, c3212b.f40653d);
    }

    public final int hashCode() {
        return this.f40650a;
    }
}
