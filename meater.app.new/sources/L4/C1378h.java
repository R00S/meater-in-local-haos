package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.AlertView;

/* compiled from: ActivityGmailFbRegisterBinding.java */
/* renamed from: L4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1378h {

    /* renamed from: A, reason: collision with root package name */
    public final LinearLayout f10076A;

    /* renamed from: B, reason: collision with root package name */
    public final View f10077B;

    /* renamed from: C, reason: collision with root package name */
    public final View f10078C;

    /* renamed from: D, reason: collision with root package name */
    public final LinearLayout f10079D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f10080E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f10081F;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f10082G;

    /* renamed from: H, reason: collision with root package name */
    public final LinearLayout f10083H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f10084I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f10085J;

    /* renamed from: K, reason: collision with root package name */
    public final LinearLayout f10086K;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10087a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10088b;

    /* renamed from: c, reason: collision with root package name */
    public final AlertView f10089c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10090d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10091e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10092f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckBox f10093g;

    /* renamed from: h, reason: collision with root package name */
    public final CheckBox f10094h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10095i;

    /* renamed from: j, reason: collision with root package name */
    public final View f10096j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f10097k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10098l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10099m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f10100n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10101o;

    /* renamed from: p, reason: collision with root package name */
    public final ProgressBar f10102p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10103q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10104r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f10105s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f10106t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10107u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f10108v;

    /* renamed from: w, reason: collision with root package name */
    public final View f10109w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f10110x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10111y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f10112z;

    private C1378h(RelativeLayout relativeLayout, TextView textView, AlertView alertView, TextView textView2, LinearLayout linearLayout, ImageView imageView, CheckBox checkBox, CheckBox checkBox2, LinearLayout linearLayout2, View view, AppCompatTextView appCompatTextView, TextView textView3, LinearLayout linearLayout3, ImageView imageView2, TextView textView4, ProgressBar progressBar, TextView textView5, TextView textView6, LinearLayout linearLayout4, ImageView imageView3, TextView textView7, LinearLayout linearLayout5, View view2, LinearLayout linearLayout6, TextView textView8, TextView textView9, LinearLayout linearLayout7, View view3, View view4, LinearLayout linearLayout8, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout9, TextView textView13, TextView textView14, LinearLayout linearLayout10) {
        this.f10087a = relativeLayout;
        this.f10088b = textView;
        this.f10089c = alertView;
        this.f10090d = textView2;
        this.f10091e = linearLayout;
        this.f10092f = imageView;
        this.f10093g = checkBox;
        this.f10094h = checkBox2;
        this.f10095i = linearLayout2;
        this.f10096j = view;
        this.f10097k = appCompatTextView;
        this.f10098l = textView3;
        this.f10099m = linearLayout3;
        this.f10100n = imageView2;
        this.f10101o = textView4;
        this.f10102p = progressBar;
        this.f10103q = textView5;
        this.f10104r = textView6;
        this.f10105s = linearLayout4;
        this.f10106t = imageView3;
        this.f10107u = textView7;
        this.f10108v = linearLayout5;
        this.f10109w = view2;
        this.f10110x = linearLayout6;
        this.f10111y = textView8;
        this.f10112z = textView9;
        this.f10076A = linearLayout7;
        this.f10077B = view3;
        this.f10078C = view4;
        this.f10079D = linearLayout8;
        this.f10080E = textView10;
        this.f10081F = textView11;
        this.f10082G = textView12;
        this.f10083H = linearLayout9;
        this.f10084I = textView13;
        this.f10085J = textView14;
        this.f10086K = linearLayout10;
    }

    public static C1378h a(View view) {
        int i10 = R.id.about_heading;
        TextView textView = (TextView) A3.a.a(view, R.id.about_heading);
        if (textView != null) {
            i10 = R.id.alert_view;
            AlertView alertView = (AlertView) A3.a.a(view, R.id.alert_view);
            if (alertView != null) {
                i10 = R.id.cancelButton;
                TextView textView2 = (TextView) A3.a.a(view, R.id.cancelButton);
                if (textView2 != null) {
                    i10 = R.id.check_box_container;
                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.check_box_container);
                    if (linearLayout != null) {
                        i10 = R.id.cloudImage;
                        ImageView imageView = (ImageView) A3.a.a(view, R.id.cloudImage);
                        if (imageView != null) {
                            i10 = R.id.confirm_check_box;
                            CheckBox checkBox = (CheckBox) A3.a.a(view, R.id.confirm_check_box);
                            if (checkBox != null) {
                                i10 = R.id.emailClubCheckBox;
                                CheckBox checkBox2 = (CheckBox) A3.a.a(view, R.id.emailClubCheckBox);
                                if (checkBox2 != null) {
                                    i10 = R.id.emailClubCheckBoxContainer;
                                    LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.emailClubCheckBoxContainer);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.emailClubDivider;
                                        View viewA = A3.a.a(view, R.id.emailClubDivider);
                                        if (viewA != null) {
                                            i10 = R.id.email_field;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.email_field);
                                            if (appCompatTextView != null) {
                                                i10 = R.id.email_label;
                                                TextView textView3 = (TextView) A3.a.a(view, R.id.email_label);
                                                if (textView3 != null) {
                                                    i10 = R.id.email_layout;
                                                    LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.email_layout);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.email_valid_image;
                                                        ImageView imageView2 = (ImageView) A3.a.a(view, R.id.email_valid_image);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.heading_text;
                                                            TextView textView4 = (TextView) A3.a.a(view, R.id.heading_text);
                                                            if (textView4 != null) {
                                                                i10 = R.id.mProgressBar;
                                                                ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.mProgressBar);
                                                                if (progressBar != null) {
                                                                    i10 = R.id.name_field;
                                                                    TextView textView5 = (TextView) A3.a.a(view, R.id.name_field);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.name_label;
                                                                        TextView textView6 = (TextView) A3.a.a(view, R.id.name_label);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.name_layout;
                                                                            LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.name_layout);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.name_valid_image;
                                                                                ImageView imageView3 = (ImageView) A3.a.a(view, R.id.name_valid_image);
                                                                                if (imageView3 != null) {
                                                                                    i10 = R.id.policy_text;
                                                                                    TextView textView7 = (TextView) A3.a.a(view, R.id.policy_text);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.privacy_container;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) A3.a.a(view, R.id.privacy_container);
                                                                                        if (linearLayout5 != null) {
                                                                                            i10 = R.id.privacyTopDevider;
                                                                                            View viewA2 = A3.a.a(view, R.id.privacyTopDevider);
                                                                                            if (viewA2 != null) {
                                                                                                i10 = R.id.register_about_me_text_view;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) A3.a.a(view, R.id.register_about_me_text_view);
                                                                                                if (linearLayout6 != null) {
                                                                                                    i10 = R.id.screen_heading;
                                                                                                    TextView textView8 = (TextView) A3.a.a(view, R.id.screen_heading);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = R.id.submitButton;
                                                                                                        TextView textView9 = (TextView) A3.a.a(view, R.id.submitButton);
                                                                                                        if (textView9 != null) {
                                                                                                            i10 = R.id.t_m_heading;
                                                                                                            LinearLayout linearLayout7 = (LinearLayout) A3.a.a(view, R.id.t_m_heading);
                                                                                                            if (linearLayout7 != null) {
                                                                                                                i10 = R.id.termBoxDevider;
                                                                                                                View viewA3 = A3.a.a(view, R.id.termBoxDevider);
                                                                                                                if (viewA3 != null) {
                                                                                                                    i10 = R.id.termViewline;
                                                                                                                    View viewA4 = A3.a.a(view, R.id.termViewline);
                                                                                                                    if (viewA4 != null) {
                                                                                                                        i10 = R.id.terms_condition_container;
                                                                                                                        LinearLayout linearLayout8 = (LinearLayout) A3.a.a(view, R.id.terms_condition_container);
                                                                                                                        if (linearLayout8 != null) {
                                                                                                                            i10 = R.id.termsConditionText1;
                                                                                                                            TextView textView10 = (TextView) A3.a.a(view, R.id.termsConditionText1);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i10 = R.id.termsConditionText2;
                                                                                                                                TextView textView11 = (TextView) A3.a.a(view, R.id.termsConditionText2);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i10 = R.id.termsConditionTitle;
                                                                                                                                    TextView textView12 = (TextView) A3.a.a(view, R.id.termsConditionTitle);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i10 = R.id.termsConditionTop;
                                                                                                                                        LinearLayout linearLayout9 = (LinearLayout) A3.a.a(view, R.id.termsConditionTop);
                                                                                                                                        if (linearLayout9 != null) {
                                                                                                                                            i10 = R.id.terms_text;
                                                                                                                                            TextView textView13 = (TextView) A3.a.a(view, R.id.terms_text);
                                                                                                                                            if (textView13 != null) {
                                                                                                                                                i10 = R.id.tm_heading;
                                                                                                                                                TextView textView14 = (TextView) A3.a.a(view, R.id.tm_heading);
                                                                                                                                                if (textView14 != null) {
                                                                                                                                                    i10 = R.id.top_view;
                                                                                                                                                    LinearLayout linearLayout10 = (LinearLayout) A3.a.a(view, R.id.top_view);
                                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                                        return new C1378h((RelativeLayout) view, textView, alertView, textView2, linearLayout, imageView, checkBox, checkBox2, linearLayout2, viewA, appCompatTextView, textView3, linearLayout3, imageView2, textView4, progressBar, textView5, textView6, linearLayout4, imageView3, textView7, linearLayout5, viewA2, linearLayout6, textView8, textView9, linearLayout7, viewA3, viewA4, linearLayout8, textView10, textView11, textView12, linearLayout9, textView13, textView14, linearLayout10);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1378h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1378h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_gmail_fb_register, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.f10087a;
    }
}
