package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;

/* compiled from: CustomActionBar.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    androidx.appcompat.app.a f10587a;

    /* renamed from: b, reason: collision with root package name */
    private CloudConnectionButton f10588b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10589c;

    /* renamed from: d, reason: collision with root package name */
    ImageView f10590d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10591e;

    /* renamed from: f, reason: collision with root package name */
    TextView f10592f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10593g;

    /* renamed from: h, reason: collision with root package name */
    private b f10594h;

    /* renamed from: i, reason: collision with root package name */
    private final c f10595i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomActionBar.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10596a;

        static {
            int[] iArr = new int[c.values().length];
            f10596a = iArr;
            try {
                iArr[c.MAIN_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10596a[c.MEATER_DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10596a[c.GUIDE_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10596a[c.MEATER_GUIDE_ACTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10596a[c.REGISTER_ACTIVITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10596a[c.SIGN_IN_ACTIVITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10596a[c.ACCOUNT_ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CustomActionBar.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface b {
        void G();

        void J();

        void z();
    }

    /* compiled from: CustomActionBar.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        MAIN_ACTIVITY,
        MEATER_DETAIL,
        MEATER_TARGET,
        GUIDE_ACTIVITY,
        MEATER_GUIDE_ACTIVITY,
        ACCOUNT_ACTIVITY,
        REGISTER_ACTIVITY,
        SIGN_IN_ACTIVITY,
        NONE
    }

    public r(Activity activity, androidx.appcompat.app.a aVar, c cVar) {
        this.f10587a = aVar;
        this.f10595i = cVar;
        f(activity);
    }

    private void f(Activity activity) {
        this.f10587a.u(activity.getLayoutInflater().inflate(2131558593, (ViewGroup) new LinearLayout(activity), false), new a.C0017a(-1, -1, 17));
        this.f10587a.x(16);
        ((Toolbar) this.f10587a.j().getParent()).K(0, 0);
        this.f10591e = (ImageView) this.f10587a.j().findViewById(2131361900);
        ImageView imageView = (ImageView) this.f10587a.j().findViewById(2131362716);
        this.f10589c = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.this.g(view);
            }
        });
        CloudConnectionButton cloudConnectionButton = (CloudConnectionButton) this.f10587a.j().findViewById(2131362161);
        this.f10588b = cloudConnectionButton;
        cloudConnectionButton.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.this.h(view);
            }
        });
        ImageView imageView2 = (ImageView) this.f10587a.j().findViewById(2131362624);
        this.f10590d = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.this.i(view);
            }
        });
        TextView textView = (TextView) this.f10587a.j().findViewById(2131363187);
        this.f10593g = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.this.j(view);
            }
        });
        TextView textView2 = (TextView) this.f10587a.j().findViewById(2131362747);
        this.f10592f = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.this.k(view);
            }
        });
        m(this.f10595i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        b bVar = this.f10594h;
        if (bVar != null) {
            bVar.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        b bVar = this.f10594h;
        if (bVar != null) {
            bVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        b bVar = this.f10594h;
        if (bVar != null) {
            bVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        b bVar = this.f10594h;
        if (bVar != null) {
            bVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        b bVar = this.f10594h;
        if (bVar != null) {
            bVar.G();
        }
    }

    public void l(b bVar) {
        this.f10594h = bVar;
    }

    public void m(c cVar) {
        if (this.f10587a == null) {
            return;
        }
        int i10 = a.f10596a[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 6) {
                            if (i10 == 7) {
                                this.f10590d.setVisibility(0);
                                this.f10589c.setVisibility(4);
                                this.f10590d.setImageDrawable(f8.l0.j(com.apptionlabs.meater_app.app.a.i(), 2131231409));
                                return;
                            }
                            return;
                        }
                        this.f10589c.setVisibility(4);
                        this.f10593g.setVisibility(0);
                        this.f10589c.setImageDrawable(f8.l0.j(com.apptionlabs.meater_app.app.a.i(), 2131231523));
                        return;
                    }
                    this.f10590d.setVisibility(0);
                    this.f10590d.setImageDrawable(f8.l0.j(com.apptionlabs.meater_app.app.a.i(), 2131231409));
                    this.f10589c.setImageDrawable(f8.l0.j(com.apptionlabs.meater_app.app.a.i(), 2131231523));
                    return;
                }
                this.f10589c.setVisibility(4);
                return;
            }
            this.f10590d.setVisibility(0);
            return;
        }
        this.f10588b.setVisibility(0);
    }
}
