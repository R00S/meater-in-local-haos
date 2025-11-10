package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b6.c9;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CloudConnectionDetailView extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public c9 f10238q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10239a;

        static {
            int[] iArr = new int[CloudDisconnectedState.values().length];
            f10239a = iArr;
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10239a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10239a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10239a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_DEVICES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10239a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10239a[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_INTERNET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CloudConnectionDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet, context);
    }

    private String e(j6.g gVar) {
        String cloudEmail = gVar.getCloudEmail();
        if (cloudEmail == null || cloudEmail.length() == 0) {
            return getContext().getString(2132018882);
        }
        return cloudEmail;
    }

    private View.OnClickListener f(CloudDisconnectedState cloudDisconnectedState) {
        final Context context = getContext();
        int i10 = a.f10239a[cloudDisconnectedState.ordinal()];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return null;
                    }
                    return new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            f8.l0.H(context, "https://support.meater.com/contact-us");
                        }
                    };
                }
                return new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CloudConnectionDetailView.m(context, view);
                    }
                };
            }
            return new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CloudConnectionDetailView.l(context, view);
                }
            };
        }
        return new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudConnectionDetailView.k(context, view);
            }
        };
    }

    private int g(CloudDisconnectedState cloudDisconnectedState) {
        if (a.f10239a[cloudDisconnectedState.ordinal()] != 1) {
            return 2131231365;
        }
        return 2131231364;
    }

    private CharSequence h(j6.g gVar, CloudDisconnectedState cloudDisconnectedState) {
        int i10;
        int i11;
        Context context = getContext();
        if (!gVar.getHasReceivedMasterStatus()) {
            return context.getString(2132018396);
        }
        switch (a.f10239a[cloudDisconnectedState.ordinal()]) {
            case 1:
                return i(context.getString(2132017447), e(gVar));
            case 2:
                if (gVar instanceof ThisDevice) {
                    i10 = 2132018712;
                } else {
                    i10 = 2132017618;
                }
                return context.getString(i10);
            case 3:
                if (gVar instanceof MEATERBlock) {
                    i11 = 2132017448;
                } else {
                    i11 = 2132017449;
                }
                return context.getString(i11);
            case 4:
                return context.getString(2132017207);
            case 5:
                return context.getString(2132018088);
            case 6:
                return context.getString(2132017598);
            default:
                return "";
        }
    }

    private SpannableStringBuilder i(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (str + ":"));
        SpannableString spannableString = new SpannableString("\n" + str2);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    private void j(AttributeSet attributeSet, Context context) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet != null) {
            this.f10238q = (c9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558404, this, true);
            return;
        }
        throw new IllegalArgumentException("Attributes should be provided to this view,");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) CloudAccountActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) CustomSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Context context, View view) {
        int I = com.apptionlabs.meater_app.app.a.u().I();
        w6.d dVar = w6.d.N;
        if (I != dVar.getProgress()) {
            com.apptionlabs.meater_app.app.a.u().A0(dVar.getProgress());
        }
        b1.f10486z = true;
        Intent intent = new Intent(context, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        context.startActivity(intent);
    }

    public void o(j6.g gVar) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z10;
        boolean z11;
        if (gVar == null) {
            return;
        }
        boolean hasReceivedMasterStatus = gVar.getHasReceivedMasterStatus();
        CloudDisconnectedState cloudDisconnectedState = gVar.getCloudDisconnectedState();
        View.OnClickListener f10 = f(cloudDisconnectedState);
        CharSequence h10 = h(gVar, cloudDisconnectedState);
        RelativeLayout relativeLayout = this.f10238q.R;
        if (hasReceivedMasterStatus) {
            onClickListener = f10;
        } else {
            onClickListener = null;
        }
        relativeLayout.setOnClickListener(onClickListener);
        ImageView imageView = this.f10238q.Q;
        if (hasReceivedMasterStatus) {
            i10 = g(cloudDisconnectedState);
        } else {
            i10 = 2131231366;
        }
        imageView.setImageResource(i10);
        this.f10238q.T.setText(h10);
        RelativeLayout relativeLayout2 = this.f10238q.R;
        if ((gVar instanceof ThisDevice) && f10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        relativeLayout2.setClickable(z10);
        boolean equals = e(gVar).equals(ThisDevice.INSTANCE.getCloudEmail());
        if (cloudDisconnectedState == CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE && !equals && hasReceivedMasterStatus) {
            z11 = true;
        } else {
            z11 = false;
        }
        f8.q0.g(z11, this.f10238q.S);
    }
}
