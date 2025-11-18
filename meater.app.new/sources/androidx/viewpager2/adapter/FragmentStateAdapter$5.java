package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0513i {

    /* renamed from: a */
    final /* synthetic */ Handler f4432a;

    /* renamed from: b */
    final /* synthetic */ Runnable f4433b;

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
        if (bVar == AbstractC0511g.b.ON_DESTROY) {
            this.f4432a.removeCallbacks(this.f4433b);
            interfaceC0515k.getLifecycle().mo3863c(this);
        }
    }
}
