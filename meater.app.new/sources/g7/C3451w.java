package g7;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3451w implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C3451w f42118b = c().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f42119a;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: g7.w$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f42120a;

        /* synthetic */ a(C3453y c3453y) {
        }

        public C3451w a() {
            return new C3451w(this.f42120a, null);
        }

        public a b(String str) {
            this.f42120a = str;
            return this;
        }
    }

    /* synthetic */ C3451w(String str, C3454z c3454z) {
        this.f42119a = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f42119a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3451w) {
            return C3443n.a(this.f42119a, ((C3451w) obj).f42119a);
        }
        return false;
    }

    public final int hashCode() {
        return C3443n.b(this.f42119a);
    }
}
