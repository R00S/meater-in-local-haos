package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public static final class ToStringHelper {

        /* renamed from: a */
        private final List f17772a;

        /* renamed from: b */
        private final Object f17773b;

        /* synthetic */ ToStringHelper(Object obj, zzah zzahVar) {
            Preconditions.m14372k(obj);
            this.f17773b = obj;
            this.f17772a = new ArrayList();
        }

        @KeepForSdk
        /* renamed from: a */
        public ToStringHelper m14358a(String str, Object obj) {
            List list = this.f17772a;
            Preconditions.m14372k(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f17773b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f17772a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((String) this.f17772a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m14355a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m14356b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    /* renamed from: c */
    public static ToStringHelper m14357c(Object obj) {
        return new ToStringHelper(obj, null);
    }
}
