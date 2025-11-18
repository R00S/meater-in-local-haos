package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C5641a0;
import com.facebook.FacebookException;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5680h0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p160m0.p161n.C5869a;
import com.facebook.p157o0.p160m0.p161n.C5870b;
import com.facebook.p157o0.p160m0.p161n.C5871c;
import com.facebook.p157o0.p160m0.p161n.C5874f;
import com.facebook.p157o0.p165q0.C5902g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONException;

/* compiled from: CodelessMatcher.kt */
/* renamed from: com.facebook.o0.m0.j */
/* loaded from: classes.dex */
public final class C5865j {

    /* renamed from: a */
    public static final a f15182a = new a(null);

    /* renamed from: b */
    private static final String f15183b = C5865j.class.getCanonicalName();

    /* renamed from: c */
    private static C5865j f15184c;

    /* renamed from: d */
    private final Handler f15185d;

    /* renamed from: e */
    private final Set<Activity> f15186e;

    /* renamed from: f */
    private final Set<c> f15187f;

    /* renamed from: g */
    private HashSet<String> f15188g;

    /* renamed from: h */
    private final HashMap<Integer, HashSet<String>> f15189h;

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C5865j m12403a() {
            C5865j c5865j;
            if (C5865j.f15184c == null) {
                C5865j.f15184c = new C5865j(null);
            }
            c5865j = C5865j.f15184c;
            if (c5865j == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return c5865j;
        }

        /* renamed from: b */
        public final Bundle m12404b(C5869a c5869a, View view, View view2) {
            List<C5870b> listM12437c;
            List<b> listM12415a;
            C9801m.m32346f(view, "rootView");
            C9801m.m32346f(view2, "hostView");
            Bundle bundle = new Bundle();
            if (c5869a != null && (listM12437c = c5869a.m12437c()) != null) {
                for (C5870b c5870b : listM12437c) {
                    if (c5870b.m12446d() != null) {
                        if (c5870b.m12446d().length() > 0) {
                            bundle.putString(c5870b.m12443a(), c5870b.m12446d());
                        }
                    }
                    if (c5870b.m12444b().size() > 0) {
                        if (C9801m.m32341a(c5870b.m12445c(), "relative")) {
                            c.a aVar = c.f15192f;
                            List<C5871c> listM12444b = c5870b.m12444b();
                            String simpleName = view2.getClass().getSimpleName();
                            C9801m.m32345e(simpleName, "hostView.javaClass.simpleName");
                            listM12415a = aVar.m12415a(c5869a, view2, listM12444b, 0, -1, simpleName);
                        } else {
                            c.a aVar2 = c.f15192f;
                            List<C5871c> listM12444b2 = c5870b.m12444b();
                            String simpleName2 = view.getClass().getSimpleName();
                            C9801m.m32345e(simpleName2, "rootView.javaClass.simpleName");
                            listM12415a = aVar2.m12415a(c5869a, view, listM12444b2, 0, -1, simpleName2);
                        }
                        Iterator<b> it = listM12415a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b next = it.next();
                                if (next.m12405a() != null) {
                                    C5874f c5874f = C5874f.f15257a;
                                    String strM12478k = C5874f.m12478k(next.m12405a());
                                    if (strM12478k.length() > 0) {
                                        bundle.putString(c5870b.m12443a(), strM12478k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$b */
    public static final class b {

        /* renamed from: a */
        private final WeakReference<View> f15190a;

        /* renamed from: b */
        private final String f15191b;

        public b(View view, String str) {
            C9801m.m32346f(view, "view");
            C9801m.m32346f(str, "viewMapKey");
            this.f15190a = new WeakReference<>(view);
            this.f15191b = str;
        }

        /* renamed from: a */
        public final View m12405a() {
            WeakReference<View> weakReference = this.f15190a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: b */
        public final String m12406b() {
            return this.f15191b;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        public static final a f15192f = new a(null);

        /* renamed from: g */
        private final WeakReference<View> f15193g;

        /* renamed from: h */
        private List<C5869a> f15194h;

        /* renamed from: i */
        private final Handler f15195i;

        /* renamed from: j */
        private final HashSet<String> f15196j;

        /* renamed from: k */
        private final String f15197k;

        /* compiled from: CodelessMatcher.kt */
        /* renamed from: com.facebook.o0.m0.j$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }

            /* renamed from: b */
            private final List<View> m12413b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt.getVisibility() == 0) {
                            C9801m.m32345e(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i3 >= childCount) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (kotlin.jvm.internal.C9801m.m32341a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) != false) goto L16;
             */
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private final boolean m12414c(android.view.View r9, com.facebook.p157o0.p160m0.p161n.C5871c r10, int r11) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.C5865j.c.a.m12414c(android.view.View, com.facebook.o0.m0.n.c, int):boolean");
            }

            /* renamed from: a */
            public final List<b> m12415a(C5869a c5869a, View view, List<C5871c> list, int i2, int i3, String str) {
                List<View> listM12413b;
                int size;
                List<View> listM12413b2;
                int size2;
                C9801m.m32346f(list, "path");
                C9801m.m32346f(str, "mapKey");
                String str2 = str + '.' + i3;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i2 >= list.size()) {
                    arrayList.add(new b(view, str2));
                } else {
                    C5871c c5871c = list.get(i2);
                    if (C9801m.m32341a(c5871c.m12447a(), "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (listM12413b = m12413b((ViewGroup) parent)).size()) > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                arrayList.addAll(m12415a(c5869a, listM12413b.get(i4), list, i2 + 1, i4, str2));
                                if (i5 >= size) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        return arrayList;
                    }
                    if (C9801m.m32341a(c5871c.m12447a(), ".")) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    }
                    if (!m12414c(view, c5871c, i3)) {
                        return arrayList;
                    }
                    if (i2 == list.size() - 1) {
                        arrayList.add(new b(view, str2));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (listM12413b2 = m12413b((ViewGroup) view)).size()) > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        arrayList.addAll(m12415a(c5869a, listM12413b2.get(i6), list, i2 + 1, i6, str2));
                        if (i7 >= size2) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                return arrayList;
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            C9801m.m32346f(handler, "handler");
            C9801m.m32346f(hashSet, "listenerSet");
            C9801m.m32346f(str, "activityName");
            this.f15193g = new WeakReference<>(view);
            this.f15195i = handler;
            this.f15196j = hashSet;
            this.f15197k = str;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: a */
        private final void m12407a(b bVar, View view, C5869a c5869a) {
            if (c5869a == null) {
                return;
            }
            try {
                View viewM12405a = bVar.m12405a();
                if (viewM12405a == null) {
                    return;
                }
                C5874f c5874f = C5874f.f15257a;
                View viewM12468a = C5874f.m12468a(viewM12405a);
                if (viewM12468a != null && c5874f.m12486p(viewM12405a, viewM12468a)) {
                    m12410d(bVar, view, c5869a);
                    return;
                }
                String name = viewM12405a.getClass().getName();
                C9801m.m32345e(name, "view.javaClass.name");
                if (C10546u.m37511E(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewM12405a instanceof AdapterView)) {
                    m12408b(bVar, view, c5869a);
                } else if (viewM12405a instanceof ListView) {
                    m12409c(bVar, view, c5869a);
                }
            } catch (Exception e2) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11573i0(C5865j.f15183b, e2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m12408b(com.facebook.p157o0.p160m0.C5865j.b r4, android.view.View r5, com.facebook.p157o0.p160m0.p161n.C5869a r6) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
            /*
                r3 = this;
                android.view.View r0 = r4.m12405a()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.String r4 = r4.m12406b()
                com.facebook.o0.m0.n.f r1 = com.facebook.p157o0.p160m0.p161n.C5874f.f15257a
                android.view.View$OnClickListener r1 = com.facebook.p157o0.p160m0.p161n.C5874f.m12474g(r0)
                boolean r2 = r1 instanceof com.facebook.p157o0.p160m0.C5863h.a
                if (r2 == 0) goto L29
                if (r1 == 0) goto L21
                com.facebook.o0.m0.h$a r1 = (com.facebook.p157o0.p160m0.C5863h.a) r1
                boolean r1 = r1.m12377a()
                if (r1 == 0) goto L29
                r1 = 1
                goto L2a
            L21:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener"
                r4.<init>(r5)
                throw r4
            L29:
                r1 = 0
            L2a:
                java.util.HashSet<java.lang.String> r2 = r3.f15196j
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L42
                if (r1 != 0) goto L42
                com.facebook.o0.m0.h r1 = com.facebook.p157o0.p160m0.C5863h.f15163a
                com.facebook.o0.m0.h$a r5 = com.facebook.p157o0.p160m0.C5863h.m12371a(r6, r5, r0)
                r0.setOnClickListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.f15196j
                r5.add(r4)
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.C5865j.c.m12408b(com.facebook.o0.m0.j$b, android.view.View, com.facebook.o0.m0.n.a):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m12409c(com.facebook.p157o0.p160m0.C5865j.b r4, android.view.View r5, com.facebook.p157o0.p160m0.p161n.C5869a r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.m12405a()
                android.widget.AdapterView r0 = (android.widget.AdapterView) r0
                if (r0 != 0) goto L9
                return
            L9:
                java.lang.String r4 = r4.m12406b()
                android.widget.AdapterView$OnItemClickListener r1 = r0.getOnItemClickListener()
                boolean r2 = r1 instanceof com.facebook.p157o0.p160m0.C5863h.b
                if (r2 == 0) goto L29
                if (r1 == 0) goto L21
                com.facebook.o0.m0.h$b r1 = (com.facebook.p157o0.p160m0.C5863h.b) r1
                boolean r1 = r1.m12378a()
                if (r1 == 0) goto L29
                r1 = 1
                goto L2a
            L21:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener"
                r4.<init>(r5)
                throw r4
            L29:
                r1 = 0
            L2a:
                java.util.HashSet<java.lang.String> r2 = r3.f15196j
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L42
                if (r1 != 0) goto L42
                com.facebook.o0.m0.h r1 = com.facebook.p157o0.p160m0.C5863h.f15163a
                com.facebook.o0.m0.h$b r5 = com.facebook.p157o0.p160m0.C5863h.m12372b(r6, r5, r0)
                r0.setOnItemClickListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.f15196j
                r5.add(r4)
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.C5865j.c.m12409c(com.facebook.o0.m0.j$b, android.view.View, com.facebook.o0.m0.n.a):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m12410d(com.facebook.p157o0.p160m0.C5865j.b r4, android.view.View r5, com.facebook.p157o0.p160m0.p161n.C5869a r6) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
            /*
                r3 = this;
                android.view.View r0 = r4.m12405a()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.String r4 = r4.m12406b()
                com.facebook.o0.m0.n.f r1 = com.facebook.p157o0.p160m0.p161n.C5874f.f15257a
                android.view.View$OnTouchListener r1 = com.facebook.p157o0.p160m0.p161n.C5874f.m12475h(r0)
                boolean r2 = r1 instanceof com.facebook.p157o0.p160m0.C5866k.a
                if (r2 == 0) goto L29
                if (r1 == 0) goto L21
                com.facebook.o0.m0.k$a r1 = (com.facebook.p157o0.p160m0.C5866k.a) r1
                boolean r1 = r1.m12417a()
                if (r1 == 0) goto L29
                r1 = 1
                goto L2a
            L21:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener"
                r4.<init>(r5)
                throw r4
            L29:
                r1 = 0
            L2a:
                java.util.HashSet<java.lang.String> r2 = r3.f15196j
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L42
                if (r1 != 0) goto L42
                com.facebook.o0.m0.k r1 = com.facebook.p157o0.p160m0.C5866k.f15198a
                com.facebook.o0.m0.k$a r5 = com.facebook.p157o0.p160m0.C5866k.m12416a(r6, r5, r0)
                r0.setOnTouchListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.f15196j
                r5.add(r4)
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.C5865j.c.m12410d(com.facebook.o0.m0.j$b, android.view.View, com.facebook.o0.m0.n.a):void");
        }

        /* renamed from: e */
        private final void m12411e(C5869a c5869a, View view) {
            if (c5869a == null || view == null) {
                return;
            }
            String strM12435a = c5869a.m12435a();
            if ((strM12435a == null || strM12435a.length() == 0) || C9801m.m32341a(c5869a.m12435a(), this.f15197k)) {
                List<C5871c> listM12438d = c5869a.m12438d();
                if (listM12438d.size() > 25) {
                    return;
                }
                Iterator<b> it = f15192f.m12415a(c5869a, view, listM12438d, 0, -1, this.f15197k).iterator();
                while (it.hasNext()) {
                    m12407a(it.next(), view, c5869a);
                }
            }
        }

        /* renamed from: f */
        private final void m12412f() {
            List<C5869a> list = this.f15194h;
            if (list == null || this.f15193g.get() == null) {
                return;
            }
            int i2 = 0;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i3 = i2 + 1;
                m12411e(list.get(i2), this.f15193g.get());
                if (i3 > size) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m12412f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m12412f();
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            View view;
            C5641a0 c5641a0 = C5641a0.f14199a;
            String strM11285d = C5641a0.m11285d();
            C5672d0 c5672d0 = C5672d0.f14392a;
            C5670c0 c5670c0M11417c = C5672d0.m11417c(strM11285d);
            if (c5670c0M11417c == null || !c5670c0M11417c.m11398b()) {
                return;
            }
            List<C5869a> listM12441b = C5869a.f15215a.m12441b(c5670c0M11417c.m11400d());
            this.f15194h = listM12441b;
            if (listM12441b == null || (view = this.f15193g.get()) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            m12412f();
        }
    }

    private C5865j() {
        this.f15185d = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C9801m.m32345e(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f15186e = setNewSetFromMap;
        this.f15187f = new LinkedHashSet();
        this.f15188g = new HashSet<>();
        this.f15189h = new HashMap<>();
    }

    public /* synthetic */ C5865j(C9789g c9789g) {
        this();
    }

    /* renamed from: g */
    private final void m12397g() {
        for (Activity activity : this.f15186e) {
            if (activity != null) {
                C5902g c5902g = C5902g.f15370a;
                View viewM12628e = C5902g.m12628e(activity);
                String simpleName = activity.getClass().getSimpleName();
                Handler handler = this.f15185d;
                HashSet<String> hashSet = this.f15188g;
                C9801m.m32345e(simpleName, "activityName");
                this.f15187f.add(new c(viewM12628e, handler, hashSet, simpleName));
            }
        }
    }

    /* renamed from: i */
    private final void m12398i() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m12397g();
        } else {
            this.f15185d.post(new Runnable() { // from class: com.facebook.o0.m0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5865j.m12399j(this.f15157f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m12399j(C5865j c5865j) {
        C9801m.m32346f(c5865j, "this$0");
        c5865j.m12397g();
    }

    /* renamed from: d */
    public final void m12400d(Activity activity) {
        C9801m.m32346f(activity, "activity");
        C5680h0 c5680h0 = C5680h0.f14422a;
        if (C5680h0.m11442b()) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        }
        this.f15186e.add(activity);
        this.f15188g.clear();
        HashSet<String> hashSet = this.f15189h.get(Integer.valueOf(activity.hashCode()));
        if (hashSet != null) {
            this.f15188g = hashSet;
        }
        m12398i();
    }

    /* renamed from: e */
    public final void m12401e(Activity activity) {
        C9801m.m32346f(activity, "activity");
        this.f15189h.remove(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: h */
    public final void m12402h(Activity activity) {
        C9801m.m32346f(activity, "activity");
        C5680h0 c5680h0 = C5680h0.f14422a;
        if (C5680h0.m11442b()) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        }
        this.f15186e.remove(activity);
        this.f15187f.clear();
        this.f15189h.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f15188g.clone());
        this.f15188g.clear();
    }
}
