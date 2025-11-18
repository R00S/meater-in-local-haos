package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.p197q.AbstractC8396d;

/* compiled from: GetAuthTokenListener.java */
/* renamed from: com.google.firebase.installations.j */
/* loaded from: classes2.dex */
class C8386j implements InterfaceC8390n {

    /* renamed from: a */
    private final C8391o f31810a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC8388l> f31811b;

    public C8386j(C8391o c8391o, TaskCompletionSource<AbstractC8388l> taskCompletionSource) {
        this.f31810a = c8391o;
        this.f31811b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC8390n
    /* renamed from: a */
    public boolean mo26284a(Exception exc) {
        this.f31811b.m23657d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC8390n
    /* renamed from: b */
    public boolean mo26285b(AbstractC8396d abstractC8396d) {
        if (!abstractC8396d.m26331k() || this.f31810a.m26297f(abstractC8396d)) {
            return false;
        }
        this.f31811b.m23656c(AbstractC8388l.m26286a().mo26249b(abstractC8396d.mo26299b()).mo26251d(abstractC8396d.mo26300c()).mo26250c(abstractC8396d.mo26305h()).mo26248a());
        return true;
    }
}
