package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q4 */
/* loaded from: classes2.dex */
final class C7574q4 extends IllegalArgumentException {
    C7574q4(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i2);
        sb.append(" of ");
        sb.append(i3);
        super(sb.toString());
    }
}
