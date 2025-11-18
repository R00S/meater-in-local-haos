package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0051b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0050a;
import androidx.activity.result.p002d.C0055c;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.facebook.common.C5648b;
import com.facebook.common.C5649c;
import com.facebook.login.LoginClient;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: LoginFragment.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u000eJ#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u000eJ)\u0010)\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010-\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010\u000eJ\u000f\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b.\u0010\u000eR$\u00102\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178\u0006@BX\u0086.¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\u0019R0\u00107\u001a\b\u0012\u0004\u0012\u00020'032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020'038\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0016\u0010?\u001a\u00020$8U@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b9\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010A¨\u0006E"}, m32267d2 = {"Lcom/facebook/login/v;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/d;", "activity", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "Lkotlin/u;", "j", "(Landroidx/fragment/app/d;)Lkotlin/a0/c/l;", "Lcom/facebook/login/LoginClient$Result;", "outcome", "q", "(Lcom/facebook/login/LoginClient$Result;)V", "t", "()V", "k", "Landroid/app/Activity;", "l", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/facebook/login/LoginClient;", "f", "()Lcom/facebook/login/LoginClient;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", HttpUrl.FRAGMENT_ENCODE_SET, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "s", "r", "<set-?>", "i", "Lcom/facebook/login/LoginClient;", "loginClient", "Landroidx/activity/result/b;", "Landroidx/activity/result/b;", "g", "()Landroidx/activity/result/b;", "launcher", "Lcom/facebook/login/LoginClient$Request;", "h", "Lcom/facebook/login/LoginClient$Request;", "request", "Landroid/view/View;", "progressBar", "()I", "layoutResId", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/String;", "callingPackage", "<init>", "a", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* renamed from: com.facebook.login.v */
/* loaded from: classes2.dex */
public class C5802v extends Fragment {

    /* renamed from: g, reason: from kotlin metadata */
    private String callingPackage;

    /* renamed from: h, reason: from kotlin metadata */
    private LoginClient.Request request;

    /* renamed from: i, reason: from kotlin metadata */
    private LoginClient loginClient;

    /* renamed from: j, reason: from kotlin metadata */
    private AbstractC0051b<Intent> launcher;

    /* renamed from: k, reason: from kotlin metadata */
    private View progressBar;

    /* compiled from: LoginFragment.kt */
    /* renamed from: com.facebook.login.v$b */
    static final class b extends Lambda implements Function1<ActivityResult, C10775u> {

        /* renamed from: g */
        final /* synthetic */ ActivityC0468d f14851g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ActivityC0468d activityC0468d) {
            super(1);
            this.f14851g = activityC0468d;
        }

        /* renamed from: b */
        public final void m12085b(ActivityResult activityResult) {
            C9801m.m32346f(activityResult, "result");
            if (activityResult.m144b() == -1) {
                C5802v.this.m12082i().m11948u(LoginClient.f14714f.m11996b(), activityResult.m144b(), activityResult.m143a());
            } else {
                this.f14851g.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(ActivityResult activityResult) {
            m12085b(activityResult);
            return C10775u.f41439a;
        }
    }

    /* compiled from: LoginFragment.kt */
    /* renamed from: com.facebook.login.v$c */
    public static final class c implements LoginClient.InterfaceC5768a {
        c() {
        }

        @Override // com.facebook.login.LoginClient.InterfaceC5768a
        /* renamed from: a */
        public void mo11991a() {
            C5802v.this.m12078t();
        }

        @Override // com.facebook.login.LoginClient.InterfaceC5768a
        /* renamed from: b */
        public void mo11992b() {
            C5802v.this.m12071k();
        }
    }

    /* renamed from: j */
    private final Function1<ActivityResult, C10775u> m12070j(ActivityC0468d activity) {
        return new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m12071k() {
        View view = this.progressBar;
        if (view == null) {
            C9801m.m32363w("progressBar");
            throw null;
        }
        view.setVisibility(8);
        m12083r();
    }

    /* renamed from: l */
    private final void m12072l(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m12075o(C5802v c5802v, LoginClient.Result result) {
        C9801m.m32346f(c5802v, "this$0");
        C9801m.m32346f(result, "outcome");
        c5802v.m12077q(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m12076p(Function1 function1, ActivityResult activityResult) {
        C9801m.m32346f(function1, "$tmp0");
        function1.invoke(activityResult);
    }

    /* renamed from: q */
    private final void m12077q(LoginClient.Result outcome) {
        this.request = null;
        int i2 = outcome.f14747g == LoginClient.Result.EnumC5765a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC0468d activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i2, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m12078t() {
        View view = this.progressBar;
        if (view == null) {
            C9801m.m32363w("progressBar");
            throw null;
        }
        view.setVisibility(0);
        m12084s();
    }

    /* renamed from: f */
    protected LoginClient m12079f() {
        return new LoginClient(this);
    }

    /* renamed from: g */
    public final AbstractC0051b<Intent> m12080g() {
        AbstractC0051b<Intent> abstractC0051b = this.launcher;
        if (abstractC0051b != null) {
            return abstractC0051b;
        }
        C9801m.m32363w("launcher");
        throw null;
    }

    /* renamed from: h */
    protected int m12081h() {
        return C5649c.f14256c;
    }

    /* renamed from: i */
    public final LoginClient m12082i() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        C9801m.m32363w("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        m12082i().m11948u(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        LoginClient loginClientM12079f = savedInstanceState == null ? null : (LoginClient) savedInstanceState.getParcelable("loginClient");
        if (loginClientM12079f != null) {
            loginClientM12079f.m11950w(this);
        } else {
            loginClientM12079f = m12079f();
        }
        this.loginClient = loginClientM12079f;
        m12082i().m11951x(new LoginClient.InterfaceC5771d() { // from class: com.facebook.login.j
            @Override // com.facebook.login.LoginClient.InterfaceC5771d
            /* renamed from: a */
            public final void mo11997a(LoginClient.Result result) {
                C5802v.m12075o(this.f14803a, result);
            }
        });
        ActivityC0468d activity = getActivity();
        if (activity == null) {
            return;
        }
        m12072l(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        C0055c c0055c = new C0055c();
        final Function1<ActivityResult, C10775u> function1M12070j = m12070j(activity);
        AbstractC0051b<Intent> abstractC0051bRegisterForActivityResult = registerForActivityResult(c0055c, new InterfaceC0050a() { // from class: com.facebook.login.k
            @Override // androidx.activity.result.InterfaceC0050a
            /* renamed from: a */
            public final void mo171a(Object obj) {
                C5802v.m12076p(function1M12070j, (ActivityResult) obj);
            }
        });
        C9801m.m32345e(abstractC0051bRegisterForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.launcher = abstractC0051bRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C9801m.m32346f(inflater, "inflater");
        View viewInflate = inflater.inflate(m12081h(), container, false);
        View viewFindViewById = viewInflate.findViewById(C5648b.f14251d);
        C9801m.m32345e(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        m12082i().m11949v(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m12082i().m11935c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(C5648b.f14251d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            m12082i().m11952y(this.request);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        ActivityC0468d activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        C9801m.m32346f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", m12082i());
    }

    /* renamed from: r */
    protected void m12083r() {
    }

    /* renamed from: s */
    protected void m12084s() {
    }
}
