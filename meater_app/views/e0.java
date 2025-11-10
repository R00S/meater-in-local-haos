package com.apptionlabs.meater_app.views;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.widget.TextView;
import com.apptionlabs.meater_app.views.e0;
import kotlin.Metadata;

/* compiled from: MEATERAlertDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apptionlabs/meater_app/views/e0;", "", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class e0 {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: MEATERAlertDialog.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/apptionlabs/meater_app/views/e0$a;", "", "", "a", "Lj6/e;", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", "Lj6/e;", "getListener", "()Lj6/e;", "listener", "<init>", "(Ljava/lang/String;Lj6/e;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.views.e0$a, reason: from toString */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final /* data */ class AlertPair {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final String text;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final j6.e listener;

        public AlertPair(String str, j6.e eVar) {
            wh.m.f(str, "text");
            this.text = str;
            this.listener = eVar;
        }

        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: b, reason: from getter */
        public final j6.e getListener() {
            return this.listener;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertPair)) {
                return false;
            }
            AlertPair alertPair = (AlertPair) other;
            if (wh.m.a(this.text, alertPair.text) && wh.m.a(this.listener, alertPair.listener)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.text.hashCode() * 31;
            j6.e eVar = this.listener;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "AlertPair(text=" + this.text + ", listener=" + this.listener + ")";
        }

        public /* synthetic */ AlertPair(String str, j6.e eVar, int i10, wh.g gVar) {
            this(str, (i10 & 2) != 0 ? null : eVar);
        }
    }

    /* compiled from: MEATERAlertDialog.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002JN\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u0014"}, d2 = {"Lcom/apptionlabs/meater_app/views/e0$b;", "", "Landroid/app/Activity;", "activity", "Landroid/app/AlertDialog;", "dialog", "Lih/u;", "j", "", "title", "message", "", "cancelable", "Lcom/apptionlabs/meater_app/views/e0$a;", "positive", "negative", "neutral", "e", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.views.e0$b, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public static /* synthetic */ AlertDialog f(Companion companion, Activity activity, String str, String str2, boolean z10, AlertPair alertPair, AlertPair alertPair2, AlertPair alertPair3, int i10, Object obj) {
            boolean z11;
            AlertPair alertPair4;
            AlertPair alertPair5;
            AlertPair alertPair6;
            if ((i10 & 8) != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if ((i10 & 16) != 0) {
                alertPair4 = null;
            } else {
                alertPair4 = alertPair;
            }
            if ((i10 & 32) != 0) {
                alertPair5 = null;
            } else {
                alertPair5 = alertPair2;
            }
            if ((i10 & 64) != 0) {
                alertPair6 = null;
            } else {
                alertPair6 = alertPair3;
            }
            return companion.e(activity, str, str2, z11, alertPair4, alertPair5, alertPair6);
        }

        public static final void g(j6.e eVar, DialogInterface dialogInterface, int i10) {
            if (eVar != null) {
                eVar.a();
            }
        }

        public static final void h(j6.e eVar, DialogInterface dialogInterface, int i10) {
            if (eVar != null) {
                eVar.a();
            }
        }

        public static final void i(j6.e eVar, DialogInterface dialogInterface, int i10) {
            if (eVar != null) {
                eVar.a();
            }
        }

        private final void j(Activity activity, AlertDialog alertDialog) {
            Typeface g10 = androidx.core.content.res.h.g(activity, 2131296273);
            try {
                TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
                if (textView != null) {
                    textView.setTypeface(g10);
                }
            } catch (Exception unused) {
            }
            TextView textView2 = (TextView) alertDialog.findViewById(R.id.message);
            if (textView2 != null) {
                textView2.setTypeface(g10);
            }
            TextView textView3 = (TextView) alertDialog.findViewById(R.id.button1);
            if (textView3 != null) {
                textView3.setTypeface(g10);
            }
            TextView textView4 = (TextView) alertDialog.findViewById(R.id.button2);
            if (textView4 != null) {
                textView4.setTypeface(g10);
            }
            TextView textView5 = (TextView) alertDialog.findViewById(R.id.button3);
            if (textView5 != null) {
                textView5.setTypeface(g10);
            }
        }

        public final AlertDialog d(Activity activity, String str, String str2, boolean z10, AlertPair alertPair, AlertPair alertPair2) {
            wh.m.f(activity, "activity");
            wh.m.f(str, "title");
            wh.m.f(str2, "message");
            return f(this, activity, str, str2, z10, alertPair, alertPair2, null, 64, null);
        }

        public final AlertDialog e(Activity activity, String title, String message, boolean cancelable, AlertPair positive, AlertPair negative, AlertPair neutral) {
            wh.m.f(activity, "activity");
            wh.m.f(title, "title");
            wh.m.f(message, "message");
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.setCancelable(cancelable);
            if (positive != null) {
                String text = positive.getText();
                final j6.e listener = positive.getListener();
                builder.setPositiveButton(text, new DialogInterface.OnClickListener() { // from class: com.apptionlabs.meater_app.views.f0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        e0.Companion.g(j6.e.this, dialogInterface, i10);
                    }
                });
            }
            if (negative != null) {
                String text2 = negative.getText();
                final j6.e listener2 = negative.getListener();
                builder.setNegativeButton(text2, new DialogInterface.OnClickListener() { // from class: com.apptionlabs.meater_app.views.g0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        e0.Companion.h(j6.e.this, dialogInterface, i10);
                    }
                });
            }
            if (neutral != null) {
                String text3 = neutral.getText();
                final j6.e listener3 = neutral.getListener();
                builder.setNeutralButton(text3, new DialogInterface.OnClickListener() { // from class: com.apptionlabs.meater_app.views.h0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        e0.Companion.i(j6.e.this, dialogInterface, i10);
                    }
                });
            }
            AlertDialog show = builder.show();
            wh.m.c(show);
            j(activity, show);
            return show;
        }
    }
}
