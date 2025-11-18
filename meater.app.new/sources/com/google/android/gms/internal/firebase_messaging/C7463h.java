package com.google.android.gms.internal.firebase_messaging;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase_messaging.h */
/* loaded from: classes2.dex */
final class C7463h extends AbstractC7460e {

    /* renamed from: a */
    private final C7462g f27619a = new C7462g();

    C7463h() {
    }

    @Override // com.google.android.gms.internal.firebase_messaging.AbstractC7460e
    /* renamed from: a */
    public final void mo20935a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.f27619a.m20936a(th, true).add(th2);
    }
}
