package com.trello.rxlifecycle.p235h.p236a;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC0067d;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.p234g.C8763c;
import com.trello.rxlifecycle.p234g.EnumC8761a;
import p456rx.C11234e;
import p456rx.p473s.C11417a;

/* compiled from: RxAppCompatActivity.java */
/* renamed from: com.trello.rxlifecycle.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC8764a extends ActivityC0067d {
    private final C11417a<EnumC8761a> lifecycleSubject = C11417a.m40634g1();

    public final <T> InterfaceC8756b<T> bindToLifecycle() {
        return C8763c.m27905a(this.lifecycleSubject);
    }

    public final C11234e<EnumC8761a> lifecycle() {
        return this.lifecycleSubject.m40086a();
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(EnumC8761a.CREATE);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        this.lifecycleSubject.onNext(EnumC8761a.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onPause() {
        this.lifecycleSubject.onNext(EnumC8761a.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(EnumC8761a.RESUME);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(EnumC8761a.START);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStop() {
        this.lifecycleSubject.onNext(EnumC8761a.STOP);
        super.onStop();
    }

    public final <T> InterfaceC8756b<T> bindUntilEvent(EnumC8761a enumC8761a) {
        return C8757c.m27898b(this.lifecycleSubject, enumC8761a);
    }
}
