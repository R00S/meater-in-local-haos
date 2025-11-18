package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfn {

    /* renamed from: a */
    private final zzfs f29252a;

    public zzfn(zzfs zzfsVar) {
        Preconditions.m14372k(zzfsVar);
        this.f29252a = zzfsVar;
    }

    /* renamed from: b */
    public static boolean m23169b(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.m14372k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void m23170a(Context context, Intent intent) throws IllegalStateException {
        zzfx zzfxVarM23203a = zzfx.m23203a(context, null);
        zzet zzetVarMo22836h = zzfxVarM23203a.mo22836h();
        if (intent == null) {
            zzetVarMo22836h.m23140K().m23147a("Receiver called with null intent");
            return;
        }
        zzfxVarM23203a.mo22832G();
        String action = intent.getAction();
        zzetVarMo22836h.m23145P().m23148b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzetVarMo22836h.m23145P().m23147a("Starting wakeful intent.");
            this.f29252a.mo22667a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zzfxVarM23203a.mo22835g().m23201z(new RunnableC7834u3(this, zzfxVarM23203a, zzetVarMo22836h));
            } catch (Exception e2) {
                zzetVarMo22836h.m23140K().m23148b("Install Referrer Reporter encountered a problem", e2);
            }
            BroadcastReceiver.PendingResult pendingResultMo22668b = this.f29252a.mo22668b();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                zzetVarMo22836h.m23145P().m23147a("Install referrer extras are null");
                if (pendingResultMo22668b != null) {
                    pendingResultMo22668b.finish();
                    return;
                }
                return;
            }
            zzetVarMo22836h.m23143N().m23148b("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new String("?");
            }
            Bundle bundleM23553y = zzfxVarM23203a.m23217I().m23553y(Uri.parse(stringExtra));
            if (bundleM23553y == null) {
                zzetVarMo22836h.m23145P().m23147a("No campaign defined in install referrer broadcast");
                if (pendingResultMo22668b != null) {
                    pendingResultMo22668b.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                zzetVarMo22836h.m23140K().m23147a("Install referrer is missing timestamp");
            }
            zzfxVarM23203a.mo22835g().m23201z(new RunnableC7825t3(this, zzfxVarM23203a, longExtra, bundleM23553y, context, zzetVarMo22836h, pendingResultMo22668b));
        }
    }
}
