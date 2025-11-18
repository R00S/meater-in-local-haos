package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzdh {

    /* renamed from: a */
    private static final String[] f25568a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: b */
    private String f25569b = "googleads.g.doubleclick.net";

    /* renamed from: c */
    private String f25570c = "/pagead/ads";

    /* renamed from: d */
    private String f25571d = "ad.doubleclick.net";

    /* renamed from: e */
    private String[] f25572e = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private zzdc f25573f;

    public zzdh(zzdc zzdcVar) {
        this.f25573f = zzdcVar;
    }

    /* renamed from: b */
    private final Uri m19450b(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws zzdi {
        try {
            boolean zM19451d = m19451d(uri);
            if (zM19451d) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzdi("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzdi("Query parameter already exists: ms");
            }
            String strZza = z ? this.f25573f.zza(context, str, view, activity) : this.f25573f.zza(context);
            if (!zM19451d) {
                String string = uri.toString();
                int iIndexOf = string.indexOf("&adurl");
                if (iIndexOf == -1) {
                    iIndexOf = string.indexOf("?adurl");
                }
                if (iIndexOf == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", strZza).build();
                }
                int i2 = iIndexOf + 1;
                return Uri.parse(string.substring(0, i2) + "ms=" + strZza + "&" + string.substring(i2));
            }
            String string2 = uri.toString();
            int iIndexOf2 = string2.indexOf(";adurl");
            if (iIndexOf2 != -1) {
                int i3 = iIndexOf2 + 1;
                return Uri.parse(string2.substring(0, i3) + "dc_ms=" + strZza + ";" + string2.substring(i3));
            }
            String encodedPath = uri.getEncodedPath();
            int iIndexOf3 = string2.indexOf(encodedPath);
            return Uri.parse(string2.substring(0, encodedPath.length() + iIndexOf3) + ";dc_ms=" + strZza + ";" + string2.substring(iIndexOf3 + encodedPath.length()));
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: d */
    private final boolean m19451d(Uri uri) {
        uri.getClass();
        try {
            return uri.getHost().equals(this.f25571d);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final Uri m19452a(Uri uri, Context context, View view, Activity activity) throws zzdi {
        try {
            return m19450b(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: c */
    public final void m19453c(MotionEvent motionEvent) {
        this.f25573f.zza(motionEvent);
    }

    /* renamed from: e */
    public final boolean m19454e(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.f25572e) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final zzdc m19455f() {
        return this.f25573f;
    }

    /* renamed from: g */
    public final boolean m19456g(Uri uri) {
        if (m19454e(uri)) {
            for (String str : f25568a) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
