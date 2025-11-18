package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.k3 */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC6844k3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ String f19516f;

    /* renamed from: g */
    private final /* synthetic */ String f19517g;

    /* renamed from: h */
    private final /* synthetic */ zzapu f19518h;

    DialogInterfaceOnClickListenerC6844k3(zzapu zzapuVar, String str, String str2) {
        this.f19518h = zzapuVar;
        this.f19516f = str;
        this.f19517g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        DownloadManager downloadManager = (DownloadManager) this.f19518h.f22253d.getSystemService(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        try {
            String str = this.f19516f;
            String str2 = this.f19517g;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzk.zzli();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f19518h.m16865e("Could not store picture.");
        }
    }
}
