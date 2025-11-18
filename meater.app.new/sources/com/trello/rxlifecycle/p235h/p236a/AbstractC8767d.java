package com.trello.rxlifecycle.p235h.p236a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.p234g.C8763c;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import p456rx.C11234e;
import p456rx.p473s.C11417a;

/* compiled from: RxFragment.java */
/* renamed from: com.trello.rxlifecycle.h.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC8767d extends Fragment {
    private final C11417a<EnumC8762b> lifecycleSubject = C11417a.m40634g1();

    public final <T> InterfaceC8756b<T> bindToLifecycle() {
        return C8763c.m27906b(this.lifecycleSubject);
    }

    public final C11234e<EnumC8762b> lifecycle() {
        return this.lifecycleSubject.m40086a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.lifecycleSubject.onNext(EnumC8762b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(EnumC8762b.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.lifecycleSubject.onNext(EnumC8762b.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.lifecycleSubject.onNext(EnumC8762b.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.lifecycleSubject.onNext(EnumC8762b.DETACH);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.lifecycleSubject.onNext(EnumC8762b.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(EnumC8762b.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(EnumC8762b.START);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.lifecycleSubject.onNext(EnumC8762b.STOP);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.lifecycleSubject.onNext(EnumC8762b.CREATE_VIEW);
    }

    public final <T> InterfaceC8756b<T> bindUntilEvent(EnumC8762b enumC8762b) {
        return C8757c.m27898b(this.lifecycleSubject, enumC8762b);
    }
}
