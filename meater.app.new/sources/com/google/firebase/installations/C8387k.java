package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.p197q.AbstractC8396d;

/* compiled from: GetIdListener.java */
/* renamed from: com.google.firebase.installations.k */
/* loaded from: classes2.dex */
class C8387k implements InterfaceC8390n {

    /* renamed from: a */
    final TaskCompletionSource<String> f31812a;

    public C8387k(TaskCompletionSource<String> taskCompletionSource) {
        this.f31812a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC8390n
    /* renamed from: a */
    public boolean mo26284a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC8390n
    /* renamed from: b */
    public boolean mo26285b(AbstractC8396d abstractC8396d) {
        if (!abstractC8396d.m26332l() && !abstractC8396d.m26331k() && !abstractC8396d.m26329i()) {
            return false;
        }
        this.f31812a.m23658e(abstractC8396d.mo26301d());
        return true;
    }
}
