package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class SignInButtonCreator extends RemoteCreator<ISignInButtonCreator> {

    /* renamed from: c */
    private static final SignInButtonCreator f17797c = new SignInButtonCreator();

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m14394c(Context context, int i2, int i3) throws RemoteCreator.RemoteCreatorException {
        return f17797c.m14395e(context, i2, i3);
    }

    /* renamed from: e */
    private final View m14395e(Context context, int i2, int i3) throws RemoteCreator.RemoteCreatorException {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i2, i3, null);
            return (View) ObjectWrapper.m14709k0(m14710b(context).mo14354l3(ObjectWrapper.m14708E0(context), signInButtonConfig));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i2);
            sb.append(" and color ");
            sb.append(i3);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ISignInButtonCreator mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof ISignInButtonCreator ? (ISignInButtonCreator) iInterfaceQueryLocalInterface : new zah(iBinder);
    }
}
