package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: KatanaProxyLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: k */
    private final String f14713k;

    /* renamed from: j */
    public static final C5762b f14712j = new C5762b(null);
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C5761a();

    /* compiled from: KatanaProxyLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    public static final class C5761a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        C5761a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i2) {
            return new KatanaProxyLoginMethodHandler[i2];
        }
    }

    /* compiled from: KatanaProxyLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$b */
    public static final class C5762b {
        private C5762b() {
        }

        public /* synthetic */ C5762b(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14713k = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14713k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: n */
    public boolean mo11923n() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo11852o(com.facebook.login.LoginClient.Request r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "request"
            r2 = r24
            kotlin.jvm.internal.C9801m.m32346f(r2, r1)
            com.facebook.login.t r1 = r24.m11963j()
            boolean r3 = com.facebook.C5641a0.f14216r
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L23
            com.facebook.internal.v r3 = com.facebook.internal.C5733v.f14626a
            java.lang.String r3 = com.facebook.internal.C5733v.m11803a()
            if (r3 == 0) goto L23
            boolean r1 = r1.m12059k()
            if (r1 == 0) goto L23
            r15 = 1
            goto L24
        L23:
            r15 = 0
        L24:
            com.facebook.login.LoginClient$c r1 = com.facebook.login.LoginClient.f14714f
            java.lang.String r1 = r1.m11995a()
            com.facebook.internal.k0 r3 = com.facebook.internal.C5686k0.f14437a
            com.facebook.login.LoginClient r3 = r23.m12000d()
            androidx.fragment.app.d r6 = r3.m11940i()
            java.lang.String r7 = r24.m11954a()
            java.util.Set r8 = r24.m11967n()
            boolean r10 = r24.m11972s()
            boolean r11 = r24.m11969p()
            com.facebook.login.r r3 = r24.m11960g()
            if (r3 != 0) goto L4c
            com.facebook.login.r r3 = com.facebook.login.EnumC5798r.NONE
        L4c:
            r12 = r3
            java.lang.String r3 = r24.m11955b()
            java.lang.String r13 = r0.m11999c(r3)
            java.lang.String r14 = r24.m11956c()
            java.lang.String r16 = r24.m11965l()
            boolean r17 = r24.m11968o()
            boolean r18 = r24.m11970q()
            boolean r19 = r24.m11979z()
            java.lang.String r20 = r24.m11966m()
            java.lang.String r21 = r24.m11957d()
            com.facebook.login.p r2 = r24.m11958e()
            if (r2 != 0) goto L79
            r2 = 0
            goto L7d
        L79:
            java.lang.String r2 = r2.name()
        L7d:
            r22 = r2
            r9 = r1
            java.util.List r2 = com.facebook.internal.C5686k0.m11471m(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = "e2e"
            r0.m11998a(r3, r1)
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
        L8e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            int r2 = r2 + r4
            java.lang.Object r3 = r1.next()
            android.content.Intent r3 = (android.content.Intent) r3
            com.facebook.login.LoginClient$c r6 = com.facebook.login.LoginClient.f14714f
            int r6 = r6.m11996b()
            boolean r3 = r0.m12016B(r3, r6)
            if (r3 == 0) goto L8e
            return r2
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.KatanaProxyLoginMethodHandler.mo11852o(com.facebook.login.LoginClient$Request):int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
        this.f14713k = "katana_proxy_auth";
    }
}
