package p7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g1.C3377a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class h extends C3377a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (g.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != g.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
