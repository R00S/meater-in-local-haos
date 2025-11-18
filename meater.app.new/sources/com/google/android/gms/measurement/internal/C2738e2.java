package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import g7.C3445p;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import v7.InterfaceC4913o;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2738e2 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<String[]> f35334b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String[]> f35335c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<String[]> f35336d = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4913o f35337a;

    public C2738e2(InterfaceC4913o interfaceC4913o) {
        this.f35337a = interfaceC4913o;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C3445p.k(strArr);
        C3445p.k(strArr2);
        C3445p.k(atomicReference);
        C3445p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strA);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f35337a.a()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String b(J j10) {
        if (j10 == null) {
            return null;
        }
        if (!this.f35337a.a()) {
            return j10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(j10.f34891D);
        sb2.append(",name=");
        sb2.append(c(j10.f34889B));
        sb2.append(",params=");
        F f10 = j10.f34890C;
        sb2.append(f10 != null ? !this.f35337a.a() ? f10.toString() : a(f10.v0()) : null);
        return sb2.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35337a.a() ? str : d(str, v7.H.f51512c, v7.H.f51510a, f35334b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35337a.a() ? str : d(str, v7.G.f51507b, v7.G.f51506a, f35335c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f35337a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, v7.J.f51515b, v7.J.f51514a, f35336d);
        }
        return "experiment_id(" + str + ")";
    }
}
