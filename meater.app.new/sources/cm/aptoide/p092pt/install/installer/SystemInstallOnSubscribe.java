package cm.aptoide.p092pt.install.installer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import cm.aptoide.p092pt.install.exception.InstallationException;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;
import p019b.p020a.p021a.InterfaceC0820a;
import p456rx.AbstractC11245j;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class SystemInstallOnSubscribe implements C11234e.a<Void> {
    private static final int INSTALL_REPLACE_EXISTING = 2;
    private static final int INSTALL_SUCCEEDED = 1;
    private final Context context;
    private final PackageManager packageManager;
    private final Uri packageUri;

    public SystemInstallOnSubscribe(Context context, PackageManager packageManager, Uri uri) {
        this.context = context;
        this.packageManager = packageManager;
        this.packageUri = uri;
    }

    private boolean isSystem(Context context) {
        try {
            return (this.packageManager.getApplicationInfo(context.getPackageName(), 0).flags & 1) == 1;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Aptoide application not found by package manager.");
        }
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Void> abstractC11245j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0820a.a aVar = new InterfaceC0820a.a() { // from class: cm.aptoide.pt.install.installer.SystemInstallOnSubscribe.1
            @Override // p019b.p020a.p021a.InterfaceC0820a.a
            public void packageInstalled(String str, int i2) throws RemoteException {
                if (i2 == 1) {
                    if (abstractC11245j.isUnsubscribed()) {
                        return;
                    }
                    abstractC11245j.onNext(null);
                    abstractC11245j.onCompleted();
                    return;
                }
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onError(new InstallationException("Package not installed with error code: " + i2));
            }
        };
        if (!isSystem(this.context)) {
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            abstractC11245j.onError(new InstallationException("Aptoide does not hold system privilege!"));
        } else {
            try {
                this.packageManager.getClass().getMethod("installPackage", Uri.class, InterfaceC0820a.class, Integer.TYPE, String.class).invoke(this.packageManager, this.packageUri, aVar, 2, HttpUrl.FRAGMENT_ENCODE_SET);
            } catch (Exception e2) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onError(new InstallationException(e2));
            }
        }
    }
}
