package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.notification.PullingContentService;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzah extends AbstractC7799q4 {

    /* renamed from: c */
    private long f29064c;

    /* renamed from: d */
    private String f29065d;

    /* renamed from: e */
    private Boolean f29066e;

    /* renamed from: f */
    private AccountManager f29067f;

    /* renamed from: g */
    private Boolean f29068g;

    /* renamed from: h */
    private long f29069h;

    zzah(zzfx zzfxVar) {
        super(zzfxVar);
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        Calendar calendar = Calendar.getInstance();
        this.f29064c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f29065d = sb.toString();
        return false;
    }

    /* renamed from: u */
    public final boolean m22951u(Context context) throws PackageManager.NameNotFoundException {
        if (this.f29066e == null) {
            mo22832G();
            this.f29066e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f29066e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f29066e.booleanValue();
    }

    /* renamed from: v */
    public final long m22952v() {
        m22807p();
        return this.f29064c;
    }

    /* renamed from: w */
    public final String m22953w() {
        m22807p();
        return this.f29065d;
    }

    /* renamed from: x */
    final long m22954x() {
        mo22792d();
        return this.f29069h;
    }

    /* renamed from: y */
    final void m22955y() {
        mo22792d();
        this.f29068g = null;
        this.f29069h = 0L;
    }

    /* renamed from: z */
    final boolean m22956z() throws OperationCanceledException, IOException, AuthenticatorException {
        Account[] result;
        mo22792d();
        long jMo14608a = mo22837j().mo14608a();
        if (jMo14608a - this.f29069h > PullingContentService.UPDATES_INTERVAL) {
            this.f29068g = null;
        }
        Boolean bool = this.f29068g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0255a.m1672a(mo22834f(), "android.permission.GET_ACCOUNTS") != 0) {
            mo22836h().m23141L().m23147a("Permission error checking for dasher/unicorn accounts");
            this.f29069h = jMo14608a;
            this.f29068g = Boolean.FALSE;
            return false;
        }
        if (this.f29067f == null) {
            this.f29067f = AccountManager.get(mo22834f());
        }
        try {
            result = this.f29067f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            mo22836h().m23138I().m23148b("Exception checking account types", e2);
        }
        if (result != null && result.length > 0) {
            this.f29068g = Boolean.TRUE;
            this.f29069h = jMo14608a;
            return true;
        }
        Account[] result2 = this.f29067f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f29068g = Boolean.TRUE;
            this.f29069h = jMo14608a;
            return true;
        }
        this.f29069h = jMo14608a;
        this.f29068g = Boolean.FALSE;
        return false;
    }
}
