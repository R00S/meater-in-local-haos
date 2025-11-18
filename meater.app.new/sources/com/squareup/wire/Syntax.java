package com.squareup.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Syntax.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/squareup/wire/Syntax;", "", "string", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "PROTO_2", "PROTO_3", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Syntax {
    private static final /* synthetic */ InterfaceC4928a $ENTRIES;
    private static final /* synthetic */ Syntax[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Syntax PROTO_2 = new Syntax("PROTO_2", 0, "proto2");
    public static final Syntax PROTO_3 = new Syntax("PROTO_3", 1, "proto3");
    private final String string;

    /* compiled from: Syntax.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/Syntax$Companion;", "", "()V", "get", "Lcom/squareup/wire/Syntax;", "string", "", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Syntax get(String string) {
            C3862t.g(string, "string");
            for (Syntax syntax : Syntax.values()) {
                if (C3862t.b(syntax.string, string)) {
                    return syntax;
                }
            }
            throw new IllegalArgumentException("unexpected syntax: " + string);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Syntax[] $values() {
        return new Syntax[]{PROTO_2, PROTO_3};
    }

    static {
        Syntax[] syntaxArr$values = $values();
        $VALUES = syntaxArr$values;
        $ENTRIES = C4929b.a(syntaxArr$values);
        INSTANCE = new Companion(null);
    }

    private Syntax(String str, int i10, String str2) {
        this.string = str2;
    }

    public static InterfaceC4928a<Syntax> getEntries() {
        return $ENTRIES;
    }

    public static Syntax valueOf(String str) {
        return (Syntax) Enum.valueOf(Syntax.class, str);
    }

    public static Syntax[] values() {
        return (Syntax[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }
}
