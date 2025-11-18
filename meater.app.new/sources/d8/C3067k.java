package d8;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import f8.InterfaceC3346a;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3067k implements InterfaceC3346a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f39762a;

    C3067k(C3068l c3068l, Activity activity) {
        this.f39762a = activity;
    }

    @Override // f8.InterfaceC3346a
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        this.f39762a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
