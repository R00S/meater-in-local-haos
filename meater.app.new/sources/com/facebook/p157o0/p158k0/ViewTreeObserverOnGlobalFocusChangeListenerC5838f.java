package com.facebook.p157o0.p158k0;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.p157o0.C5825g0;
import com.facebook.p157o0.p165q0.C5902g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: MetadataViewObserver.kt */
/* renamed from: com.facebook.o0.k0.f */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC5838f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f */
    public static final a f14987f = new a(null);

    /* renamed from: g */
    private static final Map<Integer, ViewTreeObserverOnGlobalFocusChangeListenerC5838f> f14988g = new HashMap();

    /* renamed from: h */
    private final Set<String> f14989h;

    /* renamed from: i */
    private final Handler f14990i;

    /* renamed from: j */
    private final WeakReference<Activity> f14991j;

    /* renamed from: k */
    private final AtomicBoolean f14992k;

    /* compiled from: MetadataViewObserver.kt */
    /* renamed from: com.facebook.o0.k0.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m12300c(String str, String str2) {
            return C9801m.m32341a("r2", str) ? new Regex("[^\\d.]").m37439c(str2, HttpUrl.FRAGMENT_ENCODE_SET) : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12301d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L5c;
                    case 3586: goto L45;
                    case 3587: goto L3c;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L82
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L16
                goto L82
            L16:
                java.lang.String r0 = "-"
                boolean r1 = kotlin.text.C10537l.m37457J(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L82
                kotlin.h0.j r1 = new kotlin.h0.j
                r1.<init>(r0)
                java.util.List r8 = r1.m37440d(r8, r3)
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L34
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L82
            L34:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L3c:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L4e
                goto L82
            L45:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L4e
                goto L82
            L4e:
                kotlin.h0.j r0 = new kotlin.h0.j
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.m37439c(r8, r1)
                goto L82
            L5c:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L65
                goto L82
            L65:
                java.lang.String r0 = "m"
                boolean r4 = kotlin.text.C10537l.m37450E(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L81
                java.lang.String r4 = "b"
                boolean r4 = kotlin.text.C10537l.m37450E(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L81
                java.lang.String r4 = "ge"
                boolean r8 = kotlin.text.C10537l.m37450E(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L7e
                goto L81
            L7e:
                java.lang.String r8 = "f"
                goto L82
            L81:
                r8 = r0
            L82:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p158k0.ViewTreeObserverOnGlobalFocusChangeListenerC5838f.a.m12301d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        /* renamed from: e */
        public final void m12302e(Activity activity) {
            C9801m.m32346f(activity, "activity");
            int iHashCode = activity.hashCode();
            Map map = ViewTreeObserverOnGlobalFocusChangeListenerC5838f.f14988g;
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewTreeObserverOnGlobalFocusChangeListenerC5838f = map.get(numValueOf);
            if (viewTreeObserverOnGlobalFocusChangeListenerC5838f == null) {
                viewTreeObserverOnGlobalFocusChangeListenerC5838f = new ViewTreeObserverOnGlobalFocusChangeListenerC5838f(activity, null);
                map.put(numValueOf, viewTreeObserverOnGlobalFocusChangeListenerC5838f);
            }
            ((ViewTreeObserverOnGlobalFocusChangeListenerC5838f) viewTreeObserverOnGlobalFocusChangeListenerC5838f).m12297h();
        }
    }

    private ViewTreeObserverOnGlobalFocusChangeListenerC5838f(Activity activity) {
        this.f14989h = new LinkedHashSet();
        this.f14990i = new Handler(Looper.getMainLooper());
        this.f14991j = new WeakReference<>(activity);
        this.f14992k = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC5838f(Activity activity, C9789g c9789g) {
        this(activity);
    }

    /* renamed from: d */
    private final void m12293d(final View view) {
        m12296g(new Runnable() { // from class: com.facebook.o0.k0.b
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                ViewTreeObserverOnGlobalFocusChangeListenerC5838f.m12294e(view, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m12294e(View view, ViewTreeObserverOnGlobalFocusChangeListenerC5838f viewTreeObserverOnGlobalFocusChangeListenerC5838f) throws Resources.NotFoundException {
        C9801m.m32346f(view, "$view");
        C9801m.m32346f(viewTreeObserverOnGlobalFocusChangeListenerC5838f, "this$0");
        if (view instanceof EditText) {
            viewTreeObserverOnGlobalFocusChangeListenerC5838f.m12295f(view);
        }
    }

    /* renamed from: f */
    private final void m12295f(View view) throws Resources.NotFoundException {
        String string = ((EditText) view).getText().toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        String string2 = C10547v.m37549O0(string).toString();
        if (string2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string2.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        if ((lowerCase.length() == 0) || this.f14989h.contains(lowerCase) || lowerCase.length() > 100) {
            return;
        }
        this.f14989h.add(lowerCase);
        HashMap map = new HashMap();
        C5836d c5836d = C5836d.f14981a;
        List<String> listM12277b = C5836d.m12277b(view);
        List<String> listM12276a = null;
        for (C5837e c5837e : C5837e.f14982a.m12288c()) {
            a aVar = f14987f;
            String strM12300c = aVar.m12300c(c5837e.m12284c(), lowerCase);
            if (c5837e.m12285d().length() > 0) {
                C5836d c5836d2 = C5836d.f14981a;
                if (!C5836d.m12281f(strM12300c, c5837e.m12285d())) {
                }
            }
            C5836d c5836d3 = C5836d.f14981a;
            if (C5836d.m12280e(listM12277b, c5837e.m12283b())) {
                aVar.m12301d(map, c5837e.m12284c(), strM12300c);
            } else {
                if (listM12276a == null) {
                    listM12276a = C5836d.m12276a(view);
                }
                if (C5836d.m12280e(listM12276a, c5837e.m12283b())) {
                    aVar.m12301d(map, c5837e.m12284c(), strM12300c);
                }
            }
        }
        C5825g0.f14949a.m12253e(map);
    }

    /* renamed from: g */
    private final void m12296g(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f14990i.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m12297h() {
        if (this.f14992k.getAndSet(true)) {
            return;
        }
        C5902g c5902g = C5902g.f15370a;
        View viewM12628e = C5902g.m12628e(this.f14991j.get());
        if (viewM12628e == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewM12628e.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (view != null) {
            m12293d(view);
        }
        if (view2 != null) {
            m12293d(view2);
        }
    }
}
