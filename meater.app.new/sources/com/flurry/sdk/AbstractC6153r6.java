package com.flurry.sdk;

import android.os.SystemClock;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* renamed from: com.flurry.sdk.r6 */
/* loaded from: classes2.dex */
public abstract class AbstractC6153r6 implements InterfaceC6177u6 {

    /* renamed from: c */
    private InterfaceC6169t6 f16309c;

    /* renamed from: a */
    private long f16307a = System.currentTimeMillis();

    /* renamed from: b */
    private long f16308b = SystemClock.elapsedRealtime();

    /* renamed from: d */
    private boolean f16310d = true;

    public AbstractC6153r6(InterfaceC6169t6 interfaceC6169t6) {
        this.f16309c = interfaceC6169t6;
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: b */
    public final long mo13294b() {
        return this.f16308b;
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: c */
    public final long mo13295c() {
        return this.f16307a;
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: d */
    public final String mo13296d() {
        try {
            return this.f16309c.mo12963a().toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: e */
    public final byte mo13297e() {
        return (byte) ((!this.f16310d ? 1 : 0) | 128);
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: f */
    public final InterfaceC6169t6 mo13298f() {
        return this.f16309c;
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: g */
    public final boolean mo13299g() {
        return this.f16310d;
    }
}
