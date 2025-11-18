package cm.aptoide.p092pt.utils;

import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0066c;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11429e;

/* loaded from: classes.dex */
public class GenericDialogs {

    public enum EResponse {
        YES,
        NO,
        CANCEL
    }

    public static C11234e<EResponse> createGenericContinueCancelMessage(final Context context, final String str, final String str2, final int i2) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericContinueCancelMessage$20(context, i2, str, str2, (AbstractC11245j) obj);
            }
        });
    }

    public static C11234e<EResponse> createGenericContinueMessage(final Context context, final View view, final String str, final String str2, final int i2, final int i3) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericContinueMessage$15(context, i3, str, str2, i2, view, (AbstractC11245j) obj);
            }
        });
    }

    public static C11234e<EResponse> createGenericOkCancelMessage(final Context context, final String str, final String str2, final int i2) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericOkCancelMessage$8(context, i2, str, str2, (AbstractC11245j) obj);
            }
        });
    }

    public static C11234e<EResponse> createGenericOkCancelMessageWithColorButton(final Context context, final String str, final String str2, final String str3, final String str4) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericOkCancelMessageWithColorButton$12(context, str, str2, str3, str4, (AbstractC11245j) obj);
            }
        });
    }

    public static C11234e<EResponse> createGenericOkMessage(Context context, String str, String str2, int i2) {
        return createGenericContinueMessage(context, null, str, str2, R.string.ok, i2);
    }

    public static ProgressDialog createGenericPleaseWaitDialog(Context context, int i2) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(context, i2));
        progressDialog.setMessage(context.getString(C4641R.string.please_wait));
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static C11234e<EResponse> createGenericYesNoCancelMessage(final Context context, final String str, final String str2, final int i2) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericYesNoCancelMessage$4(context, i2, str, str2, (AbstractC11245j) obj);
            }
        }).m40065I0(C11250a.m40156b());
    }

    static /* synthetic */ void lambda$createGenericContinueCancelMessage$16(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericContinueCancelMessage$17(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.NO);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericContinueCancelMessage$18(AbstractC11245j abstractC11245j, DialogInterface dialogInterface) {
        abstractC11245j.onNext(EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericContinueCancelMessage$20(Context context, int i2, String str, String str2, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, i2)).m265v(str).m253j(str2).m260q(R.string.ok, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericContinueCancelMessage$16(abstractC11245j, dialogInterface, i3);
            }
        }).m255l(R.string.cancel, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericContinueCancelMessage$17(abstractC11245j, dialogInterface, i3);
            }
        }).m258o(new DialogInterface.OnCancelListener() { // from class: cm.aptoide.pt.utils.n
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                GenericDialogs.lambda$createGenericContinueCancelMessage$18(abstractC11245j, dialogInterface);
            }
        }).m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.h0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    static /* synthetic */ void lambda$createGenericContinueMessage$13(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericContinueMessage$15(Context context, int i2, String str, String str2, int i3, View view, final AbstractC11245j abstractC11245j) {
        DialogInterfaceC0066c.a aVarM260q = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, i2)).m265v(str).m253j(str2).m260q(i3, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                GenericDialogs.lambda$createGenericContinueMessage$13(abstractC11245j, dialogInterface, i4);
            }
        });
        if (view != null) {
            aVarM260q.m266w(view);
        }
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = aVarM260q.m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.d0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$21(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$22(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.NO);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$23(AbstractC11245j abstractC11245j, DialogInterface dialogInterface) {
        abstractC11245j.onNext(EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$25(Context context, int i2, String str, int i3, int i4, int i5, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, i2)).m265v(str).m252i(i3).m260q(i4, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                GenericDialogs.lambda$createGenericOkCancelMessage$21(abstractC11245j, dialogInterface, i6);
            }
        }).m255l(i5, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                GenericDialogs.lambda$createGenericOkCancelMessage$22(abstractC11245j, dialogInterface, i6);
            }
        }).m258o(new DialogInterface.OnCancelListener() { // from class: cm.aptoide.pt.utils.i0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                GenericDialogs.lambda$createGenericOkCancelMessage$23(abstractC11245j, dialogInterface);
            }
        }).m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.u
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$5(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$6(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessage$8(Context context, int i2, String str, String str2, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, i2)).m265v(str).m253j(str2).m260q(R.string.ok, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericOkCancelMessage$5(abstractC11245j, dialogInterface, i3);
            }
        }).m255l(R.string.cancel, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericOkCancelMessage$6(abstractC11245j, dialogInterface, i3);
            }
        }).m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.a0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessageWithColorButton$10(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessageWithColorButton$12(Context context, String str, String str2, String str3, String str4, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(context).m265v(str).m253j(str2).m261r(str3, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.e0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                GenericDialogs.lambda$createGenericOkCancelMessageWithColorButton$9(abstractC11245j, dialogInterface, i2);
            }
        }).m256m(str4, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                GenericDialogs.lambda$createGenericOkCancelMessageWithColorButton$10(abstractC11245j, dialogInterface, i2);
            }
        }).m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.g0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
        dialogInterfaceC0066cM244a.m241e(-2).setTextColor(-7829368);
    }

    static /* synthetic */ void lambda$createGenericOkCancelMessageWithColorButton$9(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericYesNoCancelMessage$0(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.YES);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericYesNoCancelMessage$1(AbstractC11245j abstractC11245j, DialogInterface dialogInterface, int i2) {
        abstractC11245j.onNext(EResponse.NO);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericYesNoCancelMessage$2(AbstractC11245j abstractC11245j, DialogInterface dialogInterface) {
        abstractC11245j.onNext(EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    static /* synthetic */ void lambda$createGenericYesNoCancelMessage$4(Context context, int i2, String str, String str2, final AbstractC11245j abstractC11245j) {
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, i2)).m265v(str).m253j(str2).m260q(R.string.yes, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericYesNoCancelMessage$0(abstractC11245j, dialogInterface, i3);
            }
        }).m255l(R.string.no, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.utils.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                GenericDialogs.lambda$createGenericYesNoCancelMessage$1(abstractC11245j, dialogInterface, i3);
            }
        }).m258o(new DialogInterface.OnCancelListener() { // from class: cm.aptoide.pt.utils.k0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                GenericDialogs.lambda$createGenericYesNoCancelMessage$2(abstractC11245j, dialogInterface);
            }
        }).m244a();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.utils.s
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    public static C11234e<EResponse> createGenericOkCancelMessage(final Context context, final String str, final int i2, final int i3, final int i4, final int i5) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.utils.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                GenericDialogs.lambda$createGenericOkCancelMessage$25(context, i5, str, i2, i3, i4, (AbstractC11245j) obj);
            }
        });
    }

    public static ProgressDialog createGenericPleaseWaitDialog(Context context, int i2, String str) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(context, i2));
        progressDialog.setMessage(str);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}
