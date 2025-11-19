package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: GsonBuilder.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f38849a = Excluder.f38870H;

    /* renamed from: b, reason: collision with root package name */
    private q f38850b = q.f39120B;

    /* renamed from: c, reason: collision with root package name */
    private d f38851c = c.f38841B;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, f<?>> f38852d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<u> f38853e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<u> f38854f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f38855g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f38856h = Gson.f38808z;

    /* renamed from: i, reason: collision with root package name */
    private int f38857i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f38858j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38859k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f38860l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38861m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38862n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f38863o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f38864p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f38865q = true;

    /* renamed from: r, reason: collision with root package name */
    private t f38866r = Gson.f38806B;

    /* renamed from: s, reason: collision with root package name */
    private t f38867s = Gson.f38807C;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedList<r> f38868t = new LinkedList<>();

    private void a(String str, int i10, int i11, List<u> list) {
        u uVarB;
        u uVarB2;
        boolean z10 = com.google.gson.internal.sql.a.f39111a;
        u uVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            uVarB = DefaultDateTypeAdapter.b.f38900b.b(str);
            if (z10) {
                uVarA = com.google.gson.internal.sql.a.f39113c.b(str);
                uVarB2 = com.google.gson.internal.sql.a.f39112b.b(str);
            } else {
                uVarB2 = null;
            }
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            u uVarA2 = DefaultDateTypeAdapter.b.f38900b.a(i10, i11);
            if (z10) {
                uVarA = com.google.gson.internal.sql.a.f39113c.a(i10, i11);
                u uVarA3 = com.google.gson.internal.sql.a.f39112b.a(i10, i11);
                uVarB = uVarA2;
                uVarB2 = uVarA3;
            } else {
                uVarB = uVarA2;
                uVarB2 = null;
            }
        }
        list.add(uVarB);
        if (z10) {
            list.add(uVarA);
            list.add(uVarB2);
        }
    }

    public Gson b() {
        List<u> arrayList = new ArrayList<>(this.f38853e.size() + this.f38854f.size() + 3);
        arrayList.addAll(this.f38853e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f38854f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f38856h, this.f38857i, this.f38858j, arrayList);
        return new Gson(this.f38849a, this.f38851c, new HashMap(this.f38852d), this.f38855g, this.f38859k, this.f38863o, this.f38861m, this.f38862n, this.f38864p, this.f38860l, this.f38865q, this.f38850b, this.f38856h, this.f38857i, this.f38858j, new ArrayList(this.f38853e), new ArrayList(this.f38854f), arrayList, this.f38866r, this.f38867s, new ArrayList(this.f38868t));
    }

    public e c() {
        this.f38849a = this.f38849a.i();
        return this;
    }

    public e d(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z10 = obj instanceof p;
        com.google.gson.internal.a.a(z10 || (obj instanceof i) || (obj instanceof f) || (obj instanceof TypeAdapter));
        if (obj instanceof f) {
            this.f38852d.put(type, (f) obj);
        }
        if (z10 || (obj instanceof i)) {
            this.f38853e.add(TreeTypeAdapter.c(P9.a.b(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f38853e.add(TypeAdapters.a(P9.a.b(type), (TypeAdapter) obj));
        }
        return this;
    }

    public e e(c cVar) {
        return f(cVar);
    }

    public e f(d dVar) {
        Objects.requireNonNull(dVar);
        this.f38851c = dVar;
        return this;
    }
}
