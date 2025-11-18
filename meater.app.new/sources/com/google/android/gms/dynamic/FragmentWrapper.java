package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: f */
    private Fragment f18032f;

    private FragmentWrapper(Fragment fragment) {
        this.f18032f = fragment;
    }

    @KeepForSdk
    /* renamed from: P */
    public static FragmentWrapper m14680P(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: A0 */
    public final boolean mo14681A0() {
        return this.f18032f.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D2 */
    public final void mo14682D2(Intent intent, int i2) {
        this.f18032f.startActivityForResult(intent, i2);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: G */
    public final boolean mo14683G() {
        return this.f18032f.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: P0 */
    public final void mo14684P0(boolean z) {
        this.f18032f.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: U */
    public final boolean mo14685U() {
        return this.f18032f.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: X */
    public final boolean mo14686X() {
        return this.f18032f.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: Z6 */
    public final boolean mo14687Z6() {
        return this.f18032f.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: b */
    public final int mo14688b() {
        return this.f18032f.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: b2 */
    public final void mo14689b2(boolean z) {
        this.f18032f.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: c */
    public final int mo14690c() {
        return this.f18032f.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: d */
    public final Bundle mo14691d() {
        return this.f18032f.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: e */
    public final IFragmentWrapper mo14692e() {
        return m14680P(this.f18032f.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: f0 */
    public final boolean mo14693f0() {
        return this.f18032f.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: h6 */
    public final void mo14694h6(boolean z) {
        this.f18032f.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: l */
    public final IObjectWrapper mo14695l() {
        return ObjectWrapper.m14708E0(this.f18032f.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: l0 */
    public final boolean mo14696l0() {
        return this.f18032f.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: m */
    public final IObjectWrapper mo14697m() {
        return ObjectWrapper.m14708E0(this.f18032f.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: q */
    public final IFragmentWrapper mo14698q() {
        return m14680P(this.f18032f.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: r1 */
    public final void mo14699r1(boolean z) {
        this.f18032f.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: s */
    public final IObjectWrapper mo14700s() {
        return ObjectWrapper.m14708E0(this.f18032f.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: s0 */
    public final void mo14701s0(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m14709k0(iObjectWrapper);
        Fragment fragment = this.f18032f;
        Preconditions.m14372k(view);
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: v */
    public final String mo14702v() {
        return this.f18032f.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: w0 */
    public final void mo14703w0(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m14709k0(iObjectWrapper);
        Fragment fragment = this.f18032f;
        Preconditions.m14372k(view);
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: w2 */
    public final void mo14704w2(Intent intent) {
        this.f18032f.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: x */
    public final boolean mo14705x() {
        return this.f18032f.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: y */
    public final boolean mo14706y() {
        return this.f18032f.getUserVisibleHint();
    }
}
