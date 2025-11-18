package cm.aptoide.p092pt.install.installer;

import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.install.RootCommandTimeoutException;
import cm.aptoide.p092pt.install.exception.InstallationException;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.root.RootShell;
import cm.aptoide.p092pt.root.exceptions.RootDeniedException;
import cm.aptoide.p092pt.root.execution.Command;
import cm.aptoide.p092pt.root.execution.Shell;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11429e;

/* loaded from: classes.dex */
public class RootCommandOnSubscribe implements C11234e.a<Void> {
    public static final String SUCCESS_OUTPUT_CONFIRMATION = "success";
    private static final String TAG = "RootCommandOnSubscribe";
    public static final String TIMEOUT_EXCEPTION = "Timeout Exception";
    private InstallerAnalytics analytics;
    private String command;
    private final int installId;
    private boolean success = false;

    public RootCommandOnSubscribe(int i2, String str, InstallerAnalytics installerAnalytics) {
        this.installId = i2;
        this.command = str;
        this.analytics = installerAnalytics;
    }

    static /* synthetic */ void lambda$call$0(Shell shell) {
        try {
            shell.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Void> abstractC11245j) {
        Logger logger = Logger.getInstance();
        String str = TAG;
        logger.m8273d(str, "call: start with installation id: " + this.installId);
        try {
            final Shell shell = RootShell.getShell(true);
            if (!RootShell.isRootAvailable()) {
                abstractC11245j.onError(new InstallationException("No root permissions"));
                Logger.getInstance().m8273d(str, "call: root not available");
            } else {
                this.analytics.rootInstallStart();
                Command command = new Command(this.installId, new String[]{this.command}) { // from class: cm.aptoide.pt.install.installer.RootCommandOnSubscribe.1
                    @Override // cm.aptoide.p092pt.root.execution.Command
                    public void commandCompleted(int i2, int i3) {
                        Logger.getInstance().m8273d(RootCommandOnSubscribe.TAG, "commandCompleted: " + i3);
                        if (!abstractC11245j.isUnsubscribed() && RootCommandOnSubscribe.this.installId == i2) {
                            if (RootCommandOnSubscribe.this.success || i3 == 0) {
                                abstractC11245j.onCompleted();
                                RootCommandOnSubscribe.this.analytics.rootInstallCompleted(i3);
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("success message wasn't received. Exit code: " + i3);
                                RootCommandOnSubscribe.this.analytics.rootInstallFail(illegalStateException);
                                abstractC11245j.onError(illegalStateException);
                            }
                        }
                        super.commandCompleted(i2, i3);
                    }

                    @Override // cm.aptoide.p092pt.root.execution.Command
                    public void commandOutput(int i2, String str2) {
                        Logger.getInstance().m8273d(RootCommandOnSubscribe.TAG, "commandOutput: " + str2);
                        if (i2 == RootCommandOnSubscribe.this.installId && str2.toLowerCase().equals(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                            RootCommandOnSubscribe.this.success = true;
                        }
                        super.commandOutput(i2, str2);
                    }

                    @Override // cm.aptoide.p092pt.root.execution.Command
                    public void commandTerminated(int i2, String str2) {
                        Logger.getInstance().m8273d(RootCommandOnSubscribe.TAG, "commandTerminated: " + str2);
                        super.commandTerminated(i2, str2);
                        if (RootCommandOnSubscribe.this.installId == i2) {
                            if (str2.equals(RootCommandOnSubscribe.TIMEOUT_EXCEPTION)) {
                                RootCommandOnSubscribe.this.analytics.rootInstallTimeout();
                                abstractC11245j.onError(new RootCommandTimeoutException());
                            } else {
                                if (abstractC11245j.isUnsubscribed()) {
                                    return;
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(str2);
                                RootCommandOnSubscribe.this.analytics.rootInstallFail(illegalStateException);
                                abstractC11245j.onError(illegalStateException);
                            }
                        }
                    }
                };
                abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.installer.n0
                    @Override // p456rx.p460m.InterfaceC11252a
                    public final void call() {
                        RootCommandOnSubscribe.lambda$call$0(shell);
                    }
                }));
                shell.add(command);
            }
        } catch (RootDeniedException | IOException | TimeoutException e2) {
            if (e2 instanceof RootDeniedException) {
                this.analytics.rootInstallCancelled();
                abstractC11245j.onError(new InstallationException("User didn't accept root permissions"));
            } else if (!(e2 instanceof TimeoutException)) {
                this.analytics.rootInstallFail(e2);
                abstractC11245j.onError(e2);
            } else {
                abstractC11245j.onError(new RootCommandTimeoutException());
                this.analytics.rootInstallTimeout();
                Logger.getInstance().m8273d(TAG, "call: timeout reached");
            }
        }
    }
}
