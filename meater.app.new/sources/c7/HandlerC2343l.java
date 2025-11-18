package c7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SuppressLint({"HandlerLeak"})
/* renamed from: c7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class HandlerC2343l extends p7.j {

    /* renamed from: b, reason: collision with root package name */
    private final Context f31097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2336e f31098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2343l(C2336e c2336e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f31098c = c2336e;
        this.f31097b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C2336e c2336e = this.f31098c;
        int iG = c2336e.g(this.f31097b);
        if (c2336e.j(iG)) {
            this.f31098c.o(this.f31097b, iG);
        }
    }
}
