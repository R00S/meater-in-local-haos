package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzt {

    /* renamed from: a */
    private static final Uri f17867a;

    /* renamed from: b */
    private static final Uri f17868b;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f17867a = uri;
        f17868b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m14511a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m14512b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m14513c(String str) {
        Uri uriFromParts = Uri.fromParts(cm.aptoide.p092pt.downloadmanager.Constants.PACKAGE, "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }
}
