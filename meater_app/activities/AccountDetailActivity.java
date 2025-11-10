package com.apptionlabs.meater_app.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import bn.s;
import com.apptionlabs.meater_app.activities.AccountDetailActivity;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudState;
import com.apptionlabs.meater_app.views.e0;
import f8.l0;
import f8.t;
import j6.r;
import kotlin.Metadata;

/* compiled from: AccountDetailActivity.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b1\u00102J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ$\u0010\u0016\u001a\u00020\u00072\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/apptionlabs/meater_app/activities/AccountDetailActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "Lj6/r;", "", "alertMessage", "", "isNetworkAlert", "Lih/u;", "n2", "p2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onDeleteButtonClick", "k2", "onHelpButtonClick", "Lbn/s;", "Lcom/apptionlabs/meater_app/cloud/responses/MeaterCloudAccountResponse;", "response", "params", "x", "u", "Lb6/a;", "a0", "Lb6/a;", "binding", "Lcom/apptionlabs/meater_app/model/MEATERCloudAccount;", "b0", "Lcom/apptionlabs/meater_app/model/MEATERCloudAccount;", "account", "Lj6/n;", "c0", "Lj6/n;", "iAccountPresenter", "d0", "Z", "isProgressBarRunning", "e0", "isLogoutRequestSent", "Landroidx/activity/o;", "f0", "Landroidx/activity/o;", "getOnBackPressedCallback", "()Landroidx/activity/o;", "setOnBackPressedCallback", "(Landroidx/activity/o;)V", "onBackPressedCallback", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class AccountDetailActivity extends j implements r {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private b6.a binding;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private MEATERCloudAccount account;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private j6.n iAccountPresenter;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private boolean isProgressBarRunning;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private boolean isLogoutRequestSent;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private android.view.o onBackPressedCallback = new b();

    /* compiled from: AccountDetailActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9210a;

        static {
            int[] iArr = new int[MEATERCloudAccount.AccountType.values().length];
            try {
                iArr[MEATERCloudAccount.AccountType.Google.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERCloudAccount.AccountType.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9210a = iArr;
        }
    }

    /* compiled from: AccountDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/apptionlabs/meater_app/activities/AccountDetailActivity$b", "Landroidx/activity/o;", "Lih/u;", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends android.view.o {
        b() {
            super(true);
        }

        @Override // android.view.o
        public void d() {
            if (AccountDetailActivity.this.isProgressBarRunning) {
                Toast.makeText(com.apptionlabs.meater_app.app.a.i(), "Please wait...", 1).show();
            } else {
                AccountDetailActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(final AccountDetailActivity accountDetailActivity, View view) {
        wh.m.f(accountDetailActivity, "this$0");
        accountDetailActivity.isLogoutRequestSent = true;
        if (t.f12516a.b()) {
            b6.a aVar = accountDetailActivity.binding;
            if (aVar == null) {
                wh.m.t("binding");
                aVar = null;
            }
            aVar.Z.setVisibility(0);
            accountDetailActivity.isProgressBarRunning = true;
            new Handler().postDelayed(new Runnable() { // from class: p5.e
                @Override // java.lang.Runnable
                public final void run() {
                    AccountDetailActivity.m2(AccountDetailActivity.this);
                }
            }, 1000L);
            return;
        }
        String string = accountDetailActivity.getResources().getString(2132018873);
        wh.m.e(string, "getString(...)");
        accountDetailActivity.n2(string, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m2(AccountDetailActivity accountDetailActivity) {
        wh.m.f(accountDetailActivity, "this$0");
        MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        meaterCloudAccountResponse.setDevice_id(com.apptionlabs.meater_app.app.a.u().q());
        j6.n nVar = accountDetailActivity.iAccountPresenter;
        if (nVar == null) {
            wh.m.t("iAccountPresenter");
            nVar = null;
        }
        nVar.j(meaterCloudAccountResponse);
    }

    private final void n2(String str, final boolean z10) {
        this.isProgressBarRunning = false;
        if (isFinishing()) {
            return;
        }
        e0.Companion companion = e0.INSTANCE;
        String string = getString(2132018340);
        wh.m.e(string, "getString(...)");
        e0.Companion.f(companion, this, "", str, false, new e0.AlertPair(string, new j6.e() { // from class: p5.d
            @Override // j6.e
            public final void a() {
                AccountDetailActivity.o2(z10, this);
            }
        }), null, null, 96, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(boolean z10, AccountDetailActivity accountDetailActivity) {
        wh.m.f(accountDetailActivity, "this$0");
        if (!z10) {
            accountDetailActivity.finish();
        }
    }

    private final void p2() {
        e0.Companion companion = e0.INSTANCE;
        String string = getString(2132017186);
        wh.m.e(string, "getString(...)");
        String r10 = l0.r(this, "\n", 2132017183, 2132017184, 2132017185);
        wh.m.e(r10, "getStrings(...)");
        String string2 = getString(2132017187);
        wh.m.e(string2, "getString(...)");
        e0.AlertPair alertPair = new e0.AlertPair(string2, new j6.e() { // from class: p5.b
            @Override // j6.e
            public final void a() {
                AccountDetailActivity.q2(AccountDetailActivity.this);
            }
        });
        String string3 = getString(2132017405);
        wh.m.e(string3, "getString(...)");
        e0.Companion.f(companion, this, string, r10, false, alertPair, new e0.AlertPair(string3, new j6.e() { // from class: p5.c
            @Override // j6.e
            public final void a() {
                AccountDetailActivity.s2();
            }
        }), null, 64, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(final AccountDetailActivity accountDetailActivity) {
        wh.m.f(accountDetailActivity, "this$0");
        if (t.f12516a.b()) {
            b6.a aVar = accountDetailActivity.binding;
            if (aVar == null) {
                wh.m.t("binding");
                aVar = null;
            }
            aVar.Z.setVisibility(0);
            accountDetailActivity.isProgressBarRunning = true;
            new Handler().postDelayed(new Runnable() { // from class: p5.f
                @Override // java.lang.Runnable
                public final void run() {
                    AccountDetailActivity.r2(AccountDetailActivity.this);
                }
            }, 1000L);
            return;
        }
        String string = accountDetailActivity.getResources().getString(2132018873);
        wh.m.e(string, "getString(...)");
        accountDetailActivity.n2(string, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(AccountDetailActivity accountDetailActivity) {
        int i10;
        wh.m.f(accountDetailActivity, "this$0");
        MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        MEATERCloudAccount mEATERCloudAccount = accountDetailActivity.account;
        j6.n nVar = null;
        if (mEATERCloudAccount == null) {
            wh.m.t("account");
            mEATERCloudAccount = null;
        }
        MEATERCloudAccount.AccountType accountType = mEATERCloudAccount.type;
        if (accountType == null) {
            i10 = -1;
        } else {
            i10 = a.f9210a[accountType.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                MEATERCloudAccount mEATERCloudAccount2 = accountDetailActivity.account;
                if (mEATERCloudAccount2 == null) {
                    wh.m.t("account");
                    mEATERCloudAccount2 = null;
                }
                meaterCloudAccountResponse.setEmail(mEATERCloudAccount2.email);
                MEATERCloudAccount mEATERCloudAccount3 = accountDetailActivity.account;
                if (mEATERCloudAccount3 == null) {
                    wh.m.t("account");
                    mEATERCloudAccount3 = null;
                }
                meaterCloudAccountResponse.setPassword(mEATERCloudAccount3.password);
            } else {
                MEATERCloudAccount mEATERCloudAccount4 = accountDetailActivity.account;
                if (mEATERCloudAccount4 == null) {
                    wh.m.t("account");
                    mEATERCloudAccount4 = null;
                }
                meaterCloudAccountResponse.setFb_token(mEATERCloudAccount4.password);
            }
        } else {
            MEATERCloudAccount mEATERCloudAccount5 = accountDetailActivity.account;
            if (mEATERCloudAccount5 == null) {
                wh.m.t("account");
                mEATERCloudAccount5 = null;
            }
            meaterCloudAccountResponse.setGoogle_token(mEATERCloudAccount5.password);
        }
        j6.n nVar2 = accountDetailActivity.iAccountPresenter;
        if (nVar2 == null) {
            wh.m.t("iAccountPresenter");
        } else {
            nVar = nVar2;
        }
        nVar.d(meaterCloudAccountResponse);
    }

    public final void k2() {
        b6.a aVar = this.binding;
        if (aVar == null) {
            wh.m.t("binding");
            aVar = null;
        }
        aVar.f7514m0.setOnClickListener(new View.OnClickListener() { // from class: p5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountDetailActivity.l2(AccountDetailActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding j10 = androidx.databinding.g.j(this, 2131558435);
        wh.m.e(j10, "setContentView(...)");
        this.binding = (b6.a) j10;
        this.iAccountPresenter = new v7.b(this);
        MEATERCloudAccount k10 = com.apptionlabs.meater_app.app.a.u().k();
        b6.a aVar = this.binding;
        MEATERCloudAccount mEATERCloudAccount = null;
        if (aVar == null) {
            wh.m.t("binding");
            aVar = null;
        }
        aVar.f7508g0.setText(getString(2132017839));
        b6.a aVar2 = this.binding;
        if (aVar2 == null) {
            wh.m.t("binding");
            aVar2 = null;
        }
        aVar2.f7511j0.setText(getString(2132017839));
        b6.a aVar3 = this.binding;
        if (aVar3 == null) {
            wh.m.t("binding");
            aVar3 = null;
        }
        aVar3.f7512k0.S.setText(2132017189);
        b6.a aVar4 = this.binding;
        if (aVar4 == null) {
            wh.m.t("binding");
            aVar4 = null;
        }
        aVar4.f7505d0.S.setText(2132018380);
        if (k10 == null) {
            finish();
            return;
        }
        this.account = k10;
        b6.a aVar5 = this.binding;
        if (aVar5 == null) {
            wh.m.t("binding");
            aVar5 = null;
        }
        TextView textView = aVar5.f7504c0;
        MEATERCloudAccount mEATERCloudAccount2 = this.account;
        if (mEATERCloudAccount2 == null) {
            wh.m.t("account");
            mEATERCloudAccount2 = null;
        }
        textView.setText(mEATERCloudAccount2.name);
        b6.a aVar6 = this.binding;
        if (aVar6 == null) {
            wh.m.t("binding");
            aVar6 = null;
        }
        AppCompatTextView appCompatTextView = aVar6.W;
        MEATERCloudAccount mEATERCloudAccount3 = this.account;
        if (mEATERCloudAccount3 == null) {
            wh.m.t("account");
        } else {
            mEATERCloudAccount = mEATERCloudAccount3;
        }
        appCompatTextView.setText(mEATERCloudAccount.email);
        k2();
        getOnBackPressedDispatcher().h(this, this.onBackPressedCallback);
    }

    public final void onDeleteButtonClick(View view) {
        p2();
    }

    public final void onHelpButtonClick(View view) {
        startActivity(new Intent(this, (Class<?>) MEATERHelpActivity.class));
    }

    @Override // j6.r
    public void u() {
        String string = getResources().getString(2132017459);
        wh.m.e(string, "getString(...)");
        n2(string, false);
    }

    @Override // j6.r
    public void x(s<MeaterCloudAccountResponse> sVar, MeaterCloudAccountResponse meaterCloudAccountResponse) {
        b6.a aVar = this.binding;
        if (aVar == null) {
            wh.m.t("binding");
            aVar = null;
        }
        aVar.Z.setVisibility(8);
        this.isProgressBarRunning = false;
        wh.m.c(sVar);
        if (sVar.f()) {
            com.apptionlabs.meater_app.app.a.u().c();
            y5.g.E().M();
            c6.h.f8879a.e(MEATERCloudState.MEATER_CLOUD_STATE_SOCKET_OPEN);
            if (!this.isLogoutRequestSent) {
                String string = getResources().getString(2132017446);
                wh.m.e(string, "getString(...)");
                n2(string, false);
                return;
            } else {
                String string2 = getResources().getString(2132017455);
                wh.m.e(string2, "getString(...)");
                n2(string2, false);
                return;
            }
        }
        MeaterCloudAccountResponse.ErrorStatus parseError = MeaterCloudAccountResponse.parseError(sVar);
        String str = parseError.message;
        if (parseError.code == y5.f.INTERNAL_ERROR.n()) {
            String string3 = getResources().getString(2132017459);
            wh.m.e(string3, "getString(...)");
            n2(string3, false);
        } else {
            wh.m.c(str);
            n2(str, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2() {
    }
}
