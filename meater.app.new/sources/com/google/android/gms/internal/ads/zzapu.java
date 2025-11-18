package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C6298R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzapu extends zzaqb {

    /* renamed from: c */
    private final Map<String, String> f22252c;

    /* renamed from: d */
    private final Context f22253d;

    public zzapu(zzbgz zzbgzVar, Map<String, String> map) {
        super(zzbgzVar, "storePicture");
        this.f22252c = map;
        this.f22253d = zzbgzVar.mo14897a();
    }

    /* renamed from: h */
    public final void m16845h() {
        if (this.f22253d == null) {
            m16865e("Activity context is not available");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.m17169y(this.f22253d).m16399d()) {
            m16865e("Feature is not supported by the device.");
            return;
        }
        String str = this.f22252c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m16865e("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            m16865e(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzk.zzlg();
        if (!zzaxi.m17137R(lastPathSegment)) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            m16865e(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesM17050b = zzk.zzlk().m17050b();
        zzk.zzlg();
        AlertDialog.Builder builderM17168x = zzaxi.m17168x(this.f22253d);
        builderM17168x.setTitle(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16865s1) : "Save image");
        builderM17168x.setMessage(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16866s2) : "Allow Ad to store image in Picture gallery?");
        builderM17168x.setPositiveButton(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16867s3) : "Accept", new DialogInterfaceOnClickListenerC6844k3(this, str, lastPathSegment));
        builderM17168x.setNegativeButton(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16868s4) : "Decline", new DialogInterfaceOnClickListenerC6881l3(this));
        builderM17168x.create().show();
    }
}
