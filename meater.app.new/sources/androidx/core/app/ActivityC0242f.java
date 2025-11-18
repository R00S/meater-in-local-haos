package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.C0293e;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0516l;
import androidx.lifecycle.FragmentC0524t;
import androidx.lifecycle.InterfaceC0515k;
import p024c.p041e.C0873g;

/* compiled from: ComponentActivity.java */
/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public class ActivityC0242f extends Activity implements InterfaceC0515k, C0293e.a {
    private C0873g<Class<? extends a>, a> mExtraDataMap = new C0873g<>();
    private C0516l mLifecycleRegistry = new C0516l(this);

    /* compiled from: ComponentActivity.java */
    @Deprecated
    /* renamed from: androidx.core.app.f$a */
    public static class a {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0293e.m2037d(decorView, keyEvent)) {
            return C0293e.m2038e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0293e.m2037d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public AbstractC0511g getLifecycle() {
        throw null;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0524t.m3896g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m3880j(AbstractC0511g.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    @Override // androidx.core.view.C0293e.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
