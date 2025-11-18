package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.AbstractC0816w;
import androidx.work.AbstractC0819z;
import androidx.work.EnumC0708g;
import androidx.work.InterfaceC0810q;
import androidx.work.impl.utils.RunnableC0783b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* renamed from: androidx.work.impl.g */
/* loaded from: classes.dex */
public class C0734g extends AbstractC0816w {

    /* renamed from: a */
    private static final String f4643a = AbstractC0807n.m5223f("WorkContinuationImpl");

    /* renamed from: b */
    private final C0737j f4644b;

    /* renamed from: c */
    private final String f4645c;

    /* renamed from: d */
    private final EnumC0708g f4646d;

    /* renamed from: e */
    private final List<? extends AbstractC0819z> f4647e;

    /* renamed from: f */
    private final List<String> f4648f;

    /* renamed from: g */
    private final List<String> f4649g;

    /* renamed from: h */
    private final List<C0734g> f4650h;

    /* renamed from: i */
    private boolean f4651i;

    /* renamed from: j */
    private InterfaceC0810q f4652j;

    public C0734g(C0737j c0737j, List<? extends AbstractC0819z> list) {
        this(c0737j, null, EnumC0708g.KEEP, list, null);
    }

    /* renamed from: i */
    private static boolean m4959i(C0734g c0734g, Set<String> set) {
        set.addAll(c0734g.m4963c());
        Set<String> setM4960l = m4960l(c0734g);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM4960l.contains(it.next())) {
                return true;
            }
        }
        List<C0734g> listM4965e = c0734g.m4965e();
        if (listM4965e != null && !listM4965e.isEmpty()) {
            Iterator<C0734g> it2 = listM4965e.iterator();
            while (it2.hasNext()) {
                if (m4959i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c0734g.m4963c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m4960l(C0734g c0734g) {
        HashSet hashSet = new HashSet();
        List<C0734g> listM4965e = c0734g.m4965e();
        if (listM4965e != null && !listM4965e.isEmpty()) {
            Iterator<C0734g> it = listM4965e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m4963c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC0810q m4961a() {
        if (this.f4651i) {
            AbstractC0807n.m5221c().mo5228h(f4643a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f4648f)), new Throwable[0]);
        } else {
            RunnableC0783b runnableC0783b = new RunnableC0783b(this);
            this.f4644b.m4998u().mo5205b(runnableC0783b);
            this.f4652j = runnableC0783b.m5155d();
        }
        return this.f4652j;
    }

    /* renamed from: b */
    public EnumC0708g m4962b() {
        return this.f4646d;
    }

    /* renamed from: c */
    public List<String> m4963c() {
        return this.f4648f;
    }

    /* renamed from: d */
    public String m4964d() {
        return this.f4645c;
    }

    /* renamed from: e */
    public List<C0734g> m4965e() {
        return this.f4650h;
    }

    /* renamed from: f */
    public List<? extends AbstractC0819z> m4966f() {
        return this.f4647e;
    }

    /* renamed from: g */
    public C0737j m4967g() {
        return this.f4644b;
    }

    /* renamed from: h */
    public boolean m4968h() {
        return m4959i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m4969j() {
        return this.f4651i;
    }

    /* renamed from: k */
    public void m4970k() {
        this.f4651i = true;
    }

    public C0734g(C0737j c0737j, String str, EnumC0708g enumC0708g, List<? extends AbstractC0819z> list) {
        this(c0737j, str, enumC0708g, list, null);
    }

    public C0734g(C0737j c0737j, String str, EnumC0708g enumC0708g, List<? extends AbstractC0819z> list, List<C0734g> list2) {
        this.f4644b = c0737j;
        this.f4645c = str;
        this.f4646d = enumC0708g;
        this.f4647e = list;
        this.f4650h = list2;
        this.f4648f = new ArrayList(list.size());
        this.f4649g = new ArrayList();
        if (list2 != null) {
            Iterator<C0734g> it = list2.iterator();
            while (it.hasNext()) {
                this.f4649g.addAll(it.next().f4649g);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strM5242a = list.get(i2).m5242a();
            this.f4648f.add(strM5242a);
            this.f4649g.add(strM5242a);
        }
    }
}
