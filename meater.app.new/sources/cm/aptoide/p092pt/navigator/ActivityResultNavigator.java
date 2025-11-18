package cm.aptoide.p092pt.navigator;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.fragment.FragmentView;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import p241e.p294g.p306b.C8986a;
import p241e.p294g.p306b.C8988c;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public abstract class ActivityResultNavigator extends BaseActivity implements ActivityNavigator {

    @Inject
    AccountNavigator accountNavigator;
    private FragmentNavigator fragmentNavigator;
    private Map<Integer, Result> fragmentResultMap;
    private C8986a<Map<Integer, Result>> fragmentResultRelay;

    @Inject
    @Named
    String marketName;
    private C8988c<Result> resultRelay;

    @Inject
    public ThemeManager themeManager;

    public AccountNavigator getAccountNavigator() {
        return this.accountNavigator;
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public Activity getActivity() {
        return this;
    }

    public ActivityNavigator getActivityNavigator() {
        return this;
    }

    public FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public Map<Integer, Result> getFragmentResultMap() {
        return this.fragmentResultMap;
    }

    public C8986a<Map<Integer, Result>> getFragmentResultRelay() {
        return this.fragmentResultRelay;
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateBack() {
        finish();
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateBackWithResult(int i2, Bundle bundle) {
        setResult(i2, new Intent().putExtras(bundle));
        finish();
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateForResult(Class<? extends Activity> cls, int i2, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        intent.putExtras(bundle);
        startActivityForResult(intent, i2);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public C11234e<Result> navigateForResultWithOutput(String str, Uri uri, final int i2) {
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getPackageManager()) == null) {
            return C11234e.m40016B();
        }
        intent.putExtra("output", uri);
        startActivityForResult(intent, i2);
        return this.resultRelay.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.navigator.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getRequestCode() == i2);
            }
        });
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateTo(Class<? extends Activity> cls) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        startActivity(intent);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateWithIntent(Intent intent) {
        startActivity(intent);
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.resultRelay.call(new Result(i2, i3, intent));
        Fragment fragment = getFragmentNavigator().getFragment();
        if (fragment == null || !(fragment instanceof FragmentView) || ((FragmentView) fragment).isStartActivityForResultCalled()) {
            return;
        }
        fragment.onActivityResult(i2, i3, intent);
    }

    @Override // cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.fragmentResultRelay = ((AptoideApplication) getApplicationContext()).getFragmentResultRelay();
        this.fragmentResultMap = ((AptoideApplication) getApplicationContext()).getFragmentResultMap();
        this.fragmentNavigator = new FragmentResultNavigator(getSupportFragmentManager(), C1146R.id.fragment_placeholder, R.anim.fade_in, R.anim.fade_out, this.fragmentResultMap, this.fragmentResultRelay);
        super.onCreate(bundle);
        this.resultRelay = C8988c.m28593f1();
        getActivityComponent().inject(this);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public C11234e<Result> results(final int i2) {
        return this.resultRelay.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.navigator.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getRequestCode() == i2);
            }
        });
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public C11234e<Result> results() {
        return this.resultRelay;
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateTo(Class<? extends Activity> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, cls));
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public C11234e<Result> navigateForResult(String str, Uri uri, final int i2) {
        startActivityForResult(new Intent(str, uri), i2);
        return this.resultRelay.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.navigator.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getRequestCode() == i2);
            }
        });
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateForResult(String str, Uri uri, int i2, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.setData(uri);
        intent.putExtra(str2, str3);
        startActivityForResult(intent, i2);
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityNavigator
    public void navigateTo(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        startActivity(intent);
    }
}
