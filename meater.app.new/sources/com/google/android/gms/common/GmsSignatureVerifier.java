package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GmsSignatureVerifier {

    /* renamed from: a */
    private static final C6350a f17208a;

    /* renamed from: b */
    private static final C6350a f17209b;

    /* renamed from: c */
    private static final HashMap f17210c;

    static {
        C6443o c6443o = new C6443o();
        c6443o.m14542d("com.google.android.gms");
        c6443o.m14539a(204200000L);
        AbstractBinderC6416i abstractBinderC6416i = C6439k.f17877d;
        c6443o.m14541c(zzag.m20918v(abstractBinderC6416i.mo14275E0(), C6439k.f17875b.mo14275E0()));
        AbstractBinderC6416i abstractBinderC6416i2 = C6439k.f17876c;
        c6443o.m14540b(zzag.m20918v(abstractBinderC6416i2.mo14275E0(), C6439k.f17874a.mo14275E0()));
        f17208a = c6443o.m14543e();
        C6443o c6443o2 = new C6443o();
        c6443o2.m14542d("com.android.vending");
        c6443o2.m14539a(82240000L);
        c6443o2.m14541c(zzag.m20917u(abstractBinderC6416i.mo14275E0()));
        c6443o2.m14540b(zzag.m20917u(abstractBinderC6416i2.mo14275E0()));
        f17209b = c6443o2.m14543e();
        f17210c = new HashMap();
    }
}
