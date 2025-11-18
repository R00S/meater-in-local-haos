package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class zaj extends zal {

    /* renamed from: k */
    private final SparseArray<C6407a> f17590k;

    /* renamed from: com.google.android.gms.common.api.internal.zaj$a */
    private class C6407a implements GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: f */
        public final int f17591f;

        /* renamed from: g */
        public final GoogleApiClient f17592g;

        /* renamed from: h */
        public final GoogleApiClient.OnConnectionFailedListener f17593h;

        public C6407a(int i2, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f17591f = i2;
            this.f17592g = googleApiClient;
            this.f17593h = onConnectionFailedListener;
            googleApiClient.mo13883t(this);
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
        /* renamed from: E0 */
        public final void mo13895E0(ConnectionResult connectionResult) {
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(strValueOf);
            Log.d("AutoManageHelper", sb.toString());
            zaj.this.m14217m(connectionResult, this.f17591f);
        }
    }

    private zaj(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f17590k = new SparseArray<>();
        this.f17375f.mo14040a("AutoManageHelper", this);
    }

    /* renamed from: p */
    public static zaj m14209p(LifecycleActivity lifecycleActivity) {
        LifecycleFragment lifecycleFragmentM14030c = LifecycleCallback.m14030c(lifecycleActivity);
        zaj zajVar = (zaj) lifecycleFragmentM14030c.mo14041b("AutoManageHelper", zaj.class);
        return zajVar != null ? zajVar : new zaj(lifecycleFragmentM14030c);
    }

    /* renamed from: s */
    private final C6407a m14210s(int i2) {
        if (this.f17590k.size() <= i2) {
            return null;
        }
        SparseArray<C6407a> sparseArray = this.f17590k;
        return sparseArray.get(sparseArray.keyAt(i2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo14031a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.f17590k.size(); i2++) {
            C6407a c6407aM14210s = m14210s(i2);
            if (c6407aM14210s != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(c6407aM14210s.f17591f);
                printWriter.println(":");
                c6407aM14210s.f17592g.mo13873i(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public void mo14038i() {
        super.mo14038i();
        boolean z = this.f17600g;
        String strValueOf = String.valueOf(this.f17590k);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(strValueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f17601h.get() == null) {
            for (int i2 = 0; i2 < this.f17590k.size(); i2++) {
                C6407a c6407aM14210s = m14210s(i2);
                if (c6407aM14210s != null) {
                    c6407aM14210s.f17592g.mo13870f();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo14039j() {
        super.mo14039j();
        for (int i2 = 0; i2 < this.f17590k.size(); i2++) {
            C6407a c6407aM14210s = m14210s(i2);
            if (c6407aM14210s != null) {
                c6407aM14210s.f17592g.mo13872h();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: l */
    protected final void mo14115l(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C6407a c6407a = this.f17590k.get(i2);
        if (c6407a != null) {
            m14211q(i2);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = c6407a.f17593h;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.mo13895E0(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal
    /* renamed from: n */
    protected final void mo14116n() {
        for (int i2 = 0; i2 < this.f17590k.size(); i2++) {
            C6407a c6407aM14210s = m14210s(i2);
            if (c6407aM14210s != null) {
                c6407aM14210s.f17592g.mo13870f();
            }
        }
    }

    /* renamed from: q */
    public final void m14211q(int i2) {
        C6407a c6407a = this.f17590k.get(i2);
        this.f17590k.remove(i2);
        if (c6407a != null) {
            c6407a.f17592g.mo13884u(c6407a);
            c6407a.f17592g.mo13872h();
        }
    }

    /* renamed from: r */
    public final void m14212r(int i2, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m14373l(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f17590k.indexOfKey(i2) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i2);
        Preconditions.m14376o(z, sb.toString());
        C6383n0 c6383n0 = this.f17601h.get();
        boolean z2 = this.f17600g;
        String strValueOf = String.valueOf(c6383n0);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i2);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f17590k.put(i2, new C6407a(i2, googleApiClient, onConnectionFailedListener));
        if (this.f17600g && c6383n0 == null) {
            String strValueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 11);
            sb3.append("connecting ");
            sb3.append(strValueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.mo13870f();
        }
    }
}
