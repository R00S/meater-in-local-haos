package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: B, reason: collision with root package name */
    public static final q f39120B;

    /* renamed from: C, reason: collision with root package name */
    public static final q f39121C;

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ q[] f39122D;

    /* compiled from: LongSerializationPolicy.java */
    enum a extends q {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f39120B = aVar;
        q qVar = new q("STRING", 1) { // from class: com.google.gson.q.b
            {
                a aVar2 = null;
            }
        };
        f39121C = qVar;
        f39122D = new q[]{aVar, qVar};
    }

    private q(String str, int i10) {
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f39122D.clone();
    }

    /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
