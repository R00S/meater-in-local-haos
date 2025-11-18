package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.C9247a4;
import io.sentry.C9573q4;
import io.sentry.EnumC9587s4;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class SentryInitProvider extends AbstractC9354x0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C9287i0 c9287i0 = new C9287i0();
        Context context = getContext();
        if (context == null) {
            c9287i0.mo30214c(EnumC9587s4.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!C9273d1.m30166c(context, c9287i0)) {
            return true;
        }
        C9282g1.m30205b(context, c9287i0);
        C9573q4.m31555c().m31556a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        C9247a4.m30035e();
    }
}
