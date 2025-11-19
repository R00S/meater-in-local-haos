package g7;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class C extends E {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ Intent f41943B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ Activity f41944C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ int f41945D;

    C(Intent intent, Activity activity, int i10) {
        this.f41943B = intent;
        this.f41944C = activity;
        this.f41945D = i10;
    }

    @Override // g7.E
    public final void a() {
        Intent intent = this.f41943B;
        if (intent != null) {
            this.f41944C.startActivityForResult(intent, this.f41945D);
        }
    }
}
