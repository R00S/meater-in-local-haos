package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.C9801m;

/* compiled from: RequestProgress.kt */
/* renamed from: com.facebook.m0 */
/* loaded from: classes.dex */
public final class C5808m0 {

    /* renamed from: a */
    private final Handler f14884a;

    /* renamed from: b */
    private final GraphRequest f14885b;

    /* renamed from: c */
    private final long f14886c;

    /* renamed from: d */
    private long f14887d;

    /* renamed from: e */
    private long f14888e;

    /* renamed from: f */
    private long f14889f;

    public C5808m0(Handler handler, GraphRequest graphRequest) {
        C9801m.m32346f(graphRequest, "request");
        this.f14884a = handler;
        this.f14885b = graphRequest;
        C5641a0 c5641a0 = C5641a0.f14199a;
        this.f14886c = C5641a0.m11299r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m12134e(GraphRequest.InterfaceC5631b interfaceC5631b, long j2, long j3) {
        ((GraphRequest.InterfaceC5635f) interfaceC5631b).m11240a(j2, j3);
    }

    /* renamed from: a */
    public final void m12135a(long j2) {
        long j3 = this.f14887d + j2;
        this.f14887d = j3;
        if (j3 >= this.f14888e + this.f14886c || j3 >= this.f14889f) {
            m12137d();
        }
    }

    /* renamed from: b */
    public final void m12136b(long j2) {
        this.f14889f += j2;
    }

    /* renamed from: d */
    public final void m12137d() {
        if (this.f14887d > this.f14888e) {
            final GraphRequest.InterfaceC5631b interfaceC5631bM11182n = this.f14885b.m11182n();
            final long j2 = this.f14889f;
            if (j2 <= 0 || !(interfaceC5631bM11182n instanceof GraphRequest.InterfaceC5635f)) {
                return;
            }
            final long j3 = this.f14887d;
            Handler handler = this.f14884a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: com.facebook.s
                @Override // java.lang.Runnable
                public final void run() {
                    C5808m0.m12134e(interfaceC5631bM11182n, j3, j2);
                }
            }))) == null) {
                ((GraphRequest.InterfaceC5635f) interfaceC5631bM11182n).m11240a(j3, j2);
            }
            this.f14888e = this.f14887d;
        }
    }
}
