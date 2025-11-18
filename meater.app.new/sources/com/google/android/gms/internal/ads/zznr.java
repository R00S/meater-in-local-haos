package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zznr {

    /* renamed from: a */
    private static final zzpu f26654a = new n10();

    /* renamed from: b */
    private static final Pattern f26655b = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: c */
    public int f26656c = -1;

    /* renamed from: d */
    public int f26657d = -1;

    /* renamed from: b */
    private final boolean m20334b(String str, String str2) throws NumberFormatException {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f26655b.matcher(str2);
        if (matcher.find()) {
            try {
                int i2 = Integer.parseInt(matcher.group(1), 16);
                int i3 = Integer.parseInt(matcher.group(2), 16);
                if (i2 > 0 || i3 > 0) {
                    this.f26656c = i2;
                    this.f26657d = i3;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m20335a(zzpo zzpoVar) {
        for (int i2 = 0; i2 < zzpoVar.m20387a(); i2++) {
            zzpo.zza zzaVarM20388b = zzpoVar.m20388b(i2);
            if (zzaVarM20388b instanceof zzps) {
                zzps zzpsVar = (zzps) zzaVarM20388b;
                if (m20334b(zzpsVar.f26824h, zzpsVar.f26825i)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m20336c() {
        return (this.f26656c == -1 || this.f26657d == -1) ? false : true;
    }
}
