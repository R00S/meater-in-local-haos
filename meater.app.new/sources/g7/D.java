package g7;

import android.content.Intent;
import e7.InterfaceC3219i;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class D extends E {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ Intent f41946B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ InterfaceC3219i f41947C;

    D(Intent intent, InterfaceC3219i interfaceC3219i, int i10) {
        this.f41946B = intent;
        this.f41947C = interfaceC3219i;
    }

    @Override // g7.E
    public final void a() {
        Intent intent = this.f41946B;
        if (intent != null) {
            this.f41947C.startActivityForResult(intent, 2);
        }
    }
}
