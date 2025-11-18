package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.m */
/* loaded from: classes2.dex */
abstract class AbstractC6339m<T> {

    /* renamed from: a */
    final int f17170a;

    /* renamed from: b */
    final TaskCompletionSource<T> f17171b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f17172c;

    /* renamed from: d */
    final Bundle f17173d;

    AbstractC6339m(int i2, int i3, Bundle bundle) {
        this.f17170a = i2;
        this.f17172c = i3;
        this.f17173d = bundle;
    }

    /* renamed from: a */
    abstract void mo13772a(Bundle bundle);

    /* renamed from: b */
    final void m13775b(zzp zzpVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzpVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f17171b.m23655b(zzpVar);
    }

    /* renamed from: c */
    final void m13776c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f17171b.m23656c(t);
    }

    /* renamed from: d */
    abstract boolean mo13773d();

    public String toString() {
        int i2 = this.f17172c;
        int i3 = this.f17170a;
        boolean zMo13773d = mo13773d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(zMo13773d);
        sb.append("}");
        return sb.toString();
    }
}
