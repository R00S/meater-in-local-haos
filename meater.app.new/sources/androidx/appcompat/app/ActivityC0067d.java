package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0195v0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0237a;
import androidx.core.app.C0243g;
import androidx.core.app.C0252p;
import androidx.fragment.app.ActivityC0468d;
import p024c.p025a.p032o.AbstractC0842b;

/* compiled from: AppCompatActivity.java */
/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class ActivityC0067d extends ActivityC0468d implements InterfaceC0068e, C0252p.a {
    private AbstractC0069f mDelegate;
    private Resources mResources;

    public ActivityC0067d() {
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo283d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo286h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0064a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo215f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0242f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0064a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo224o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) getDelegate().mo287k(i2);
    }

    public AbstractC0069f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0069f.m272i(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0065b getDrawerToggleDelegate() {
        return getDelegate().mo288m();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo290o();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C0195v0.m1228b()) {
            this.mResources = new C0195v0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0064a getSupportActionBar() {
        return getDelegate().mo291p();
    }

    @Override // androidx.core.app.C0252p.a
    public Intent getSupportParentActivityIntent() {
        return C0243g.m1550a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo293r();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo294s(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AbstractC0069f delegate = getDelegate();
        delegate.mo292q();
        delegate.mo295t(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(C0252p c0252p) {
        c0252p.m1658f(this);
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().mo296u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        AbstractC0064a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo218i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    protected void onNightModeChanged(int i2) {
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo297v(bundle);
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().mo298w();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0252p c0252p) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo299x(bundle);
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().mo300y();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().mo301z();
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public void onSupportActionModeFinished(AbstractC0842b abstractC0842b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public void onSupportActionModeStarted(AbstractC0842b abstractC0842b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C0252p c0252pM1656h = C0252p.m1656h(this);
        onCreateSupportNavigateUpTaskStack(c0252pM1656h);
        onPrepareSupportNavigateUpTaskStack(c0252pM1656h);
        c0252pM1656h.m1660i();
        try {
            C0237a.m1521m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        getDelegate().mo281J(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public AbstractC0842b onWindowStartingSupportActionMode(AbstractC0842b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0064a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo225p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        getDelegate().mo276D(i2);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo279H(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        getDelegate().mo280I(i2);
    }

    public AbstractC0842b startSupportActionMode(AbstractC0842b.a aVar) {
        return getDelegate().mo282K(aVar);
    }

    @Override // androidx.fragment.app.ActivityC0468d
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo293r();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0243g.m1554e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i2) {
        return getDelegate().mo275C(i2);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0243g.m1555f(this, intent);
    }

    public ActivityC0067d(int i2) {
        super(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        getDelegate().mo277E(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo278F(view, layoutParams);
    }
}
