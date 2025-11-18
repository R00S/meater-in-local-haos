package g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3443n {

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f42088a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f42089b;

        /* synthetic */ a(Object obj, Z z10) {
            C3445p.k(obj);
            this.f42089b = obj;
            this.f42088a = new ArrayList();
        }

        public a a(String str, Object obj) {
            C3445p.k(str);
            this.f42088a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f42089b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f42088a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f42088a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
