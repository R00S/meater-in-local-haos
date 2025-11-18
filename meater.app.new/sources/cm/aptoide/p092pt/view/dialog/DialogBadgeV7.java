package cm.aptoide.p092pt.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;

/* loaded from: classes.dex */
public class DialogBadgeV7 extends BaseDialogFragment {
    protected String appName;
    protected Malware malware;
    protected String marketName;
    protected Malware.Rank rank;

    /* renamed from: cm.aptoide.pt.view.dialog.DialogBadgeV7$1 */
    static /* synthetic */ class C47851 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank;

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Reason$Status */
        static final /* synthetic */ int[] f11785xa0d786a2;

        static {
            int[] iArr = new int[Malware.Reason.Status.values().length];
            f11785xa0d786a2 = iArr;
            try {
                iArr[Malware.Reason.Status.passed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11785xa0d786a2[Malware.Reason.Status.failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11785xa0d786a2[Malware.Reason.Status.blacklisted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Malware.Rank.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank = iArr2;
            try {
                iArr2[Malware.Rank.TRUSTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[Malware.Rank.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[Malware.Rank.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateDialog$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8975d(View view) {
        dismiss();
    }

    public static DialogBadgeV7 newInstance(String str, Malware malware, String str2, Malware.Rank rank) {
        DialogBadgeV7 dialogBadgeV7 = new DialogBadgeV7();
        dialogBadgeV7.malware = malware;
        dialogBadgeV7.appName = str2;
        dialogBadgeV7.rank = rank;
        dialogBadgeV7.marketName = str;
        return dialogBadgeV7;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(C1146R.layout.layout_dialog_badge, (ViewGroup) null);
        DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId)).m266w(viewInflate).m244a();
        viewInflate.findViewById(C1146R.id.dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11786f.m8975d(view);
            }
        });
        Malware malware = this.malware;
        if (malware != null && malware.getRank() != null) {
            int i2 = C47851.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[this.malware.getRank().ordinal()];
            if (i2 == 1) {
                viewInflate.findViewById(C1146R.id.trusted_header_layout).setVisibility(0);
            } else if (i2 == 2) {
                viewInflate.findViewById(C1146R.id.warning_header_layout).setVisibility(0);
            } else if (i2 == 3) {
                viewInflate.findViewById(C1146R.id.unknown_header_layout).setVisibility(0);
                viewInflate.findViewById(C1146R.id.tr_unknown).setVisibility(0);
                return dialogInterfaceC0066cM244a;
            }
        }
        Malware malware2 = this.malware;
        if (malware2 != null && malware2.getReason() != null) {
            if (this.malware.getReason().getScanned() != null && this.malware.getReason().getScanned().getStatus() != null && ((Malware.Reason.Status.passed.equals(this.malware.getReason().getScanned().getStatus()) || Malware.Reason.Status.warn.equals(this.malware.getReason().getScanned().getStatus())) && this.malware.getReason().getScanned().getAvInfo() != null)) {
                viewInflate.findViewById(C1146R.id.tr_scanned).setVisibility(0);
                ((TextView) viewInflate.findViewById(C1146R.id.message_virus_no)).setText(getString(C1146R.string.appviewbadge_message_virus_no));
            }
            if (this.malware.getReason().getThirdpartyValidated() != null && Malware.GOOGLE_PLAY.equalsIgnoreCase(this.malware.getReason().getThirdpartyValidated().getStore())) {
                viewInflate.findViewById(C1146R.id.tr_third_party).setVisibility(0);
            }
            if (this.malware.getReason().getSignatureValidated() != null && this.malware.getReason().getSignatureValidated().getStatus() != null) {
                int i3 = C47851.f11785xa0d786a2[this.malware.getReason().getSignatureValidated().getStatus().ordinal()];
                if (i3 == 1) {
                    viewInflate.findViewById(C1146R.id.tr_signature).setVisibility(0);
                    ((TextView) viewInflate.findViewById(C1146R.id.tv_reason_signature_validation)).setText(getString(C1146R.string.appviewbadge_message_signature_matches));
                } else if (i3 == 2) {
                    viewInflate.findViewById(C1146R.id.tr_signature).setVisibility(0);
                    viewInflate.findViewById(C1146R.id.iv_signature).setVisibility(4);
                    ((TextView) viewInflate.findViewById(C1146R.id.tv_reason_signature_validation)).setText(getString(C1146R.string.appviewbadge_message_signature_different));
                }
            }
            if (this.malware.getReason().getManual() != null && this.malware.getReason().getManual().getStatus() != null && Malware.Reason.Status.passed.equals(this.malware.getReason().getManual().getStatus())) {
                viewInflate.findViewById(C1146R.id.tr_manual).setVisibility(0);
                ((TextView) viewInflate.findViewById(C1146R.id.message_virus_no_manual)).setText(getString(C1146R.string.appviewbadge_message_virus_no));
            }
        }
        return dialogInterfaceC0066cM244a;
    }
}
