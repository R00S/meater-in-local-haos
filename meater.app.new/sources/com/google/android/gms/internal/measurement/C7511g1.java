package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes2.dex */
final class C7511g1 extends AbstractC7493d1 {

    /* renamed from: b */
    private final C7505f1 f27729b = new C7505f1();

    C7511g1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7493d1
    /* renamed from: a */
    public final void mo21030a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f27729b.m21050a(th, true).add(th2);
    }
}
