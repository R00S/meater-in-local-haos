package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@zzard
/* loaded from: classes2.dex */
public final class zzada {
    /* renamed from: a */
    public static void m16439a(zzacy zzacyVar, zzacx zzacxVar) {
        if (zzacxVar.m16429a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzacxVar.m16430b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzacyVar.m16436b(zzacxVar.m16429a(), zzacxVar.m16430b(), zzacxVar.m16431c(), zzacxVar.m16432d());
    }
}
