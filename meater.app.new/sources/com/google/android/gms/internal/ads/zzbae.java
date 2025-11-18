package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzard
/* loaded from: classes2.dex */
public final class zzbae {
    /* renamed from: a */
    public static <T> T m17356a(Context context, String str, zzbaf<IBinder, T> zzbafVar) throws zzbag {
        try {
            return zzbafVar.mo15160a(m17358c(context).m14723d(str));
        } catch (Exception e2) {
            throw new zzbag(e2);
        }
    }

    /* renamed from: b */
    public static Context m17357b(Context context) throws zzbag {
        return m17358c(context).m14722b();
    }

    /* renamed from: c */
    private static DynamiteModule m17358c(Context context) throws zzbag {
        try {
            return DynamiteModule.m14714e(context, DynamiteModule.f18038a, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new zzbag(e2);
        }
    }
}
