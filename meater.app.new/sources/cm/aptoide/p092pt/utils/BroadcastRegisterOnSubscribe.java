package cm.aptoide.p092pt.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11429e;

/* loaded from: classes.dex */
public class BroadcastRegisterOnSubscribe implements C11234e.a<Intent> {
    private final String broadcastPermission;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Handler schedulerHandler;

    public BroadcastRegisterOnSubscribe(Context context, IntentFilter intentFilter, String str, Handler handler) {
        this.context = context;
        this.intentFilter = intentFilter;
        this.broadcastPermission = str;
        this.schedulerHandler = handler;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Intent> abstractC11245j) {
        final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: cm.aptoide.pt.utils.BroadcastRegisterOnSubscribe.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(intent);
            }
        };
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.BroadcastRegisterOnSubscribe.2
            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                BroadcastRegisterOnSubscribe.this.context.unregisterReceiver(broadcastReceiver);
            }
        }));
        this.context.registerReceiver(broadcastReceiver, this.intentFilter, this.broadcastPermission, this.schedulerHandler);
    }
}
