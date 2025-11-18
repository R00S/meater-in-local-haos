package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.g */
/* loaded from: classes2.dex */
abstract class AbstractBinderC6414g extends zzy {

    /* renamed from: f */
    private final int f17675f;

    protected AbstractBinderC6414g(byte[] bArr) {
        Preconditions.m14362a(bArr.length == 25);
        this.f17675f = Arrays.hashCode(bArr);
    }

    /* renamed from: k0 */
    protected static byte[] m14274k0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: E0 */
    abstract byte[] mo14275E0();

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: c */
    public final int mo14276c() {
        return this.f17675f;
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: d */
    public final IObjectWrapper mo14277d() {
        return ObjectWrapper.m14708E0(mo14275E0());
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperMo14277d;
        if (obj != null && (obj instanceof zzz)) {
            try {
                zzz zzzVar = (zzz) obj;
                if (zzzVar.mo14276c() == this.f17675f && (iObjectWrapperMo14277d = zzzVar.mo14277d()) != null) {
                    return Arrays.equals(mo14275E0(), (byte[]) ObjectWrapper.m14709k0(iObjectWrapperMo14277d));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17675f;
    }
}
