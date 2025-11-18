package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzgx;
import com.google.android.gms.measurement.internal.zzha;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {

    /* renamed from: a */
    private final zzx f28530a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzgx {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzha {
    }

    public AppMeasurementSdk(zzx zzxVar) {
        this.f28530a = zzxVar;
    }

    @KeepForSdk
    /* renamed from: k */
    public static AppMeasurementSdk m22674k(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzx.m22578e(context, str, str2, str3, bundle).m22604f();
    }

    @KeepForSdk
    /* renamed from: a */
    public void m22675a(String str) {
        this.f28530a.m22591B(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public void m22676b(String str, String str2, Bundle bundle) {
        this.f28530a.m22592C(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: c */
    public void m22677c(String str) {
        this.f28530a.m22595I(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public long m22678d() {
        return this.f28530a.m22598P();
    }

    @KeepForSdk
    /* renamed from: e */
    public String m22679e() {
        return this.f28530a.m22601V();
    }

    @KeepForSdk
    /* renamed from: f */
    public String m22680f() {
        return this.f28530a.m22597M();
    }

    @KeepForSdk
    /* renamed from: g */
    public List<Bundle> m22681g(String str, String str2) {
        return this.f28530a.m22590A(str, str2);
    }

    @KeepForSdk
    /* renamed from: h */
    public String m22682h() {
        return this.f28530a.m22600T();
    }

    @KeepForSdk
    /* renamed from: i */
    public String m22683i() {
        return this.f28530a.m22599Q();
    }

    @KeepForSdk
    /* renamed from: j */
    public String m22684j() {
        return this.f28530a.m22594G();
    }

    @KeepForSdk
    /* renamed from: l */
    public int m22685l(String str) {
        return this.f28530a.m22596L(str);
    }

    @KeepForSdk
    /* renamed from: m */
    public Map<String, Object> m22686m(String str, String str2, boolean z) {
        return this.f28530a.m22605h(str, str2, z);
    }

    @KeepForSdk
    /* renamed from: n */
    public void m22687n(String str, String str2, Bundle bundle) {
        this.f28530a.m22612s(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: o */
    public void m22688o(Bundle bundle) {
        this.f28530a.m22602a(bundle, false);
    }

    @KeepForSdk
    /* renamed from: p */
    public Bundle m22689p(Bundle bundle) {
        return this.f28530a.m22602a(bundle, true);
    }

    @KeepForSdk
    /* renamed from: q */
    public void m22690q(Bundle bundle) {
        this.f28530a.m22608k(bundle);
    }

    @KeepForSdk
    /* renamed from: r */
    public void m22691r(Activity activity, String str, String str2) {
        this.f28530a.m22607j(activity, str, str2);
    }

    @KeepForSdk
    /* renamed from: s */
    public void m22692s(String str, String str2, Object obj) {
        this.f28530a.m22613u(str, str2, obj);
    }
}
