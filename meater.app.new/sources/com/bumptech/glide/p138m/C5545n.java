package com.bumptech.glide.p138m;

import android.util.Log;
import com.bumptech.glide.p141p.InterfaceC5561d;
import com.bumptech.glide.p145r.C5597k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* renamed from: com.bumptech.glide.m.n */
/* loaded from: classes.dex */
public class C5545n {

    /* renamed from: a */
    private final Set<InterfaceC5561d> f13880a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<InterfaceC5561d> f13881b = new ArrayList();

    /* renamed from: c */
    private boolean f13882c;

    /* renamed from: a */
    private boolean m10816a(InterfaceC5561d interfaceC5561d, boolean z) {
        boolean z2 = true;
        if (interfaceC5561d == null) {
            return true;
        }
        boolean zRemove = this.f13880a.remove(interfaceC5561d);
        if (!this.f13881b.remove(interfaceC5561d) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            interfaceC5561d.clear();
            if (z) {
                interfaceC5561d.mo10928c();
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean m10817b(InterfaceC5561d interfaceC5561d) {
        return m10816a(interfaceC5561d, true);
    }

    /* renamed from: c */
    public void m10818c() {
        Iterator it = C5597k.m11053j(this.f13880a).iterator();
        while (it.hasNext()) {
            m10816a((InterfaceC5561d) it.next(), false);
        }
        this.f13881b.clear();
    }

    /* renamed from: d */
    public void m10819d() {
        this.f13882c = true;
        for (InterfaceC5561d interfaceC5561d : C5597k.m11053j(this.f13880a)) {
            if (interfaceC5561d.isRunning()) {
                interfaceC5561d.clear();
                this.f13881b.add(interfaceC5561d);
            }
        }
    }

    /* renamed from: e */
    public void m10820e() {
        for (InterfaceC5561d interfaceC5561d : C5597k.m11053j(this.f13880a)) {
            if (!interfaceC5561d.mo10937l() && !interfaceC5561d.mo10934i()) {
                interfaceC5561d.clear();
                if (this.f13882c) {
                    this.f13881b.add(interfaceC5561d);
                } else {
                    interfaceC5561d.mo10929d();
                }
            }
        }
    }

    /* renamed from: f */
    public void m10821f() {
        this.f13882c = false;
        for (InterfaceC5561d interfaceC5561d : C5597k.m11053j(this.f13880a)) {
            if (!interfaceC5561d.mo10937l() && !interfaceC5561d.isRunning()) {
                interfaceC5561d.mo10929d();
            }
        }
        this.f13881b.clear();
    }

    /* renamed from: g */
    public void m10822g(InterfaceC5561d interfaceC5561d) {
        this.f13880a.add(interfaceC5561d);
        if (!this.f13882c) {
            interfaceC5561d.mo10929d();
            return;
        }
        interfaceC5561d.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f13881b.add(interfaceC5561d);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f13880a.size() + ", isPaused=" + this.f13882c + "}";
    }
}
